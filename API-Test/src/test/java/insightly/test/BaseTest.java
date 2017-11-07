package insightly.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import insightly.Accept;
import insightly.Content;
import insightly.Path;
import insightly.contact.ContactTest;

public class BaseTest {
	private static Properties prop;
	
	public static RandomObjectFiller runtimeInstance;

	private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

	@BeforeClass
	public synchronized static void SetUp() {
		if(prop != null) {
			return;
		}
		System.out.println("Base class");
		prop = new Properties();
		try {
			InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("config.properties");

			prop.load(input);
			runtimeInstance = new RandomObjectFiller();
			
			RestAssured.baseURI = prop.getProperty("uri");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    protected static InsightlyRequestSpecification given(Class testClass) {	
        InsightlyRequestSpecification insightlyRequestSpecification = new InsightlyRequestSpecification().header("Authorization", "Basic " + new String(Base64.encodeBase64(prop.getProperty("api-key").getBytes())));
        insightlyRequestSpecification.contentType(ContentType(testClass));
        insightlyRequestSpecification.acceptType(AcceptType(testClass));
        return insightlyRequestSpecification;
    }
    
    @Before
    public void Version() {
    	Path annotation = this.getClass().getAnnotation(Path.class);
    	if(annotation != null) {
    		RestAssured.basePath = annotation.value();
    	}
    }
    
    public static ContentType AcceptType(Class clazz) {
    	Accept annotation = clazz.getClass().getAnnotation(Accept.class);
    	if(annotation != null) {
    		return annotation.value();
    	}
		return ContentType.JSON;
    }
    
    public static ContentType ContentType(Class clazz) {
    	Content annotation = clazz.getClass().getAnnotation(Content.class);
    	if(annotation != null) {
    		return annotation.value();
    	}
		return ContentType.JSON;
    }
    
    public byte[] getFileBytes(String fileName) {
		URL input = BaseTest.class.getClassLoader().getResource("Albert_Einstein_Head.jpg");
		try {
			return Files.readAllBytes(Paths.get(input.toURI()));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
}
