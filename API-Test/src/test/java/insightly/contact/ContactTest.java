package insightly.contact;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import insightly.Path;
import insightly.model.v22.Contact;
import insightly.test.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

@Path(version = "v2.2", value = "contacts")
public class ContactTest extends BaseTest {

	@Test
	public void GetContact() {
		Response response = given().accept(ContentType.JSON).when().get("/235236635").then().statusCode(200).extract()
				.response();

		Contact contact = response.body().as(Contact.class);
		assertNotNull(contact.getCONTACTID());
	}
}
