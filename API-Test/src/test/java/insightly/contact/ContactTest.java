package insightly.contact;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import insightly.Accept;
import insightly.Content;
import insightly.Path;
import insightly.model.v22.Contact;
import insightly.model.v22.Tag;
import insightly.test.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

@Path("v2.2")
@Accept(ContentType.JSON)
@Content(ContentType.JSON)
public class ContactTest extends BaseTest {

	private static final Logger logger = LoggerFactory.getLogger(ContactTest.class);

	//serialize and deserialize all entity types
	//linking entity types
	//add custom field
	
	@Test
	public void GetContact() {
		Contact contact1 = randomObjectFiller.createContact();
		contact1.setFIRSTNAME(RandomStringUtils.randomAlphanumeric(20));
		contact1.setLASTNAME(RandomStringUtils.randomAlphanumeric(20));
		
		contact1 = given(this.getClass())
				.when()
					.body(contact1)
					.post("/Contacts")
				.then()
					.statusCode(201).extract().response().body().as(Contact.class);
		
		Response response = given(this.getClass()).withId(contact1.getCONTACTID()).when().get("/contacts/").then().statusCode(200).extract()
				.response();

		Contact contact2 = response.body().as(Contact.class);
		assertEquals(contact2.getFIRSTNAME(), contact1.getFIRSTNAME());
		
		deleteContact(contact1);
	}
	
	@Test
	public void GetFilteredContacts() {
		Response response = given(this.getClass()).when()
				.queryParam("first_name", "ramya").get("/contacts/search")
				.then()
					.statusCode(200).extract().response();
		Contact[] contacts = response.body().as(Contact[].class);
		assertEquals(5, contacts.length);
	}
	
	@Test
	public void GetListOfContactsPage1() {
		Response response = given(this.getClass())
				.when()
					.brief(false)
					.countTotal(false)
					.get("/Contacts")
				.then()
					.statusCode(200)
					.extract()
					.response();
		
		Contact[] contacts = response.body().as(Contact[].class);
		assertEquals(100, contacts.length);
	}
	
	@Test
	public void GetListOfContactsWith50Records() {
		Response response = given(this.getClass())
				.when()
				.take(50)
				.brief(false)
				.countTotal(false)
				.get("/Contacts").then().statusCode(200).extract()
				.response();
		Contact[] contacts = response.body().as(Contact[].class);
		assertEquals(50, contacts.length);
	}
	
	@Test
	public void GetListOfContactsSkip100() {
		//check ids not in other	
		Response response = given(this.getClass())
				.skip(100)
				.brief(false)
				.countTotal(false)
				.get("/Contacts").then().statusCode(200).extract()
				.response();
		Contact[] contacts = response.body().as(Contact[].class);
		assertEquals(100, contacts.length);
	}
	
	@Test
	public void AddAContactWithNoLastName() {
		Contact contact = randomObjectFiller.createContact();
		contact.setFIRSTNAME(RandomStringUtils.randomAlphanumeric(20));
		Response response = given(this.getClass())
				.when()
				.body(contact)
				.post("/Contacts").then().statusCode(400).extract().response();
		String errorMessage = response.body().print();
		assertEquals("Field 'LAST_NAME' cannot be empty", errorMessage);
	}
	
	@Test
	public void AddAContact() {
		Contact contact = randomObjectFiller.createContact();
		contact.setFIRSTNAME(RandomStringUtils.randomAlphanumeric(20));
		contact.setLASTNAME(RandomStringUtils.randomAlphanumeric(20));
		
		contact = given(this.getClass())				
				.when()
					.body(contact)
					.post("/Contacts")
				.then()
					.statusCode(201).extract().response().body().as(Contact.class);
		
		assertNotNull(contact.getCONTACTID());
		deleteContact(contact);
	}
	
	@Test
	public void AddAContactImage(){		
		try {
			Contact contact = addContact();			
			URL input = BaseTest.class.getClassLoader().getResource("Albert_Einstein_Head.jpg");
			
			contact = given(this.getClass())				
					.when().contentType(ContentType.BINARY)
					.pathParam("id", contact.getCONTACTID())
					.pathParam("filename", "Albert_Einstein_Head.jpg")
						.body(Files.readAllBytes(Paths.get(input.toURI())))
						.put("/Contacts/{id}/Image/{filename}")
					.then()
						.statusCode(200).extract().response().body().as(Contact.class);
		
			assertNotNull(contact.getIMAGEURL());
			
			deleteContact(contact);
		}
		catch(Exception ex){
			logger.error(ex.toString());
		}		
	}	
	
	
	@Test
	public void AddAContactTag(){		
		try {
			Contact contact = addContact();	
			
			Tag tag = new Tag();
			String tagName = "AP-Test-" + RandomStringUtils.randomAlphanumeric(5);
			tag.tAGNAME = tagName;
			
			given(this.getClass())				
					.when()
					.pathParam("id", contact.getCONTACTID())
						.body(tag)
						.post("/Contacts/{id}/Tags")
					.then()
						.statusCode(201).extract().response().body();
		
			contact = getContact(contact.getCONTACTID());
			
			
			ObjectMapper mapper = new ObjectMapper();
			Tag recievedTag = mapper.convertValue(contact.getTAGS().get(0), Tag.class);
			assertTrue(recievedTag.tAGNAME.equals(tagName));

			
			deleteTag(contact.getCONTACTID(), tagName);
			deleteContact(contact);
		}
		catch(Exception ex){
			logger.error(ex.toString());
		}		
	}
	
	@Test
	public void AddAFileAttachementToAContact(){		
		try {
			Contact contact = addContact();	
			URL input = BaseTest.class.getClassLoader().getResource("Albert_Einstein_Head.jpg");

			given(this.getClass())				
					.when()
					.contentType("multipart/form-data").multiPart(new File(input.toURI()))
					.pathParam("id", contact.getCONTACTID())
						.post("/Contacts/{id}/FileAttachments")
					.then()
						.statusCode(201).extract().response().body();
		
			contact = getContact(contact.getCONTACTID());
			
			deleteContact(contact);
		}
		catch(Exception ex){
			logger.error(ex.toString());
		}		
	}
	
	
	public void deleteTag(int id, String tagName) {
		given(this.getClass())
				.when()
				.pathParam("id", id)
				.pathParam("tagName", tagName)
				.delete("/Contacts/{id}/Tags/{tagName}").then().statusCode(202);
	}
	
	public void deleteContact(Contact contact) {
		given(this.getClass())
				.when()
				.withId(contact.getCONTACTID())
				.delete("/contacts").then().statusCode(202);
	}
	
	public Contact addContact() {
		try {
			Contact contact = randomObjectFiller.createContact();
			contact.setFIRSTNAME(RandomStringUtils.randomAlphanumeric(20));
			contact.setLASTNAME(RandomStringUtils.randomAlphanumeric(20));
			
			contact = given(this.getClass())				
					.when()
						.body(contact)
						.post("/Contacts")
					.then()
						.statusCode(201).extract().response().body().as(Contact.class);
			return contact;
		}
		catch(Exception ex) {
			//log error here
			return null;
		}
		
	}
	
	public Contact getContact(int id) {		
		return given(this.getClass())
				.when()
					.withId(id)
					.get("/Contacts")
				.then()
					.statusCode(200).extract().response().body().as(Contact.class);				
	}
}
