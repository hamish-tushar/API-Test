package insightly.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.junit.Before;
import org.junit.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import insightly.Accept;
import insightly.Content;
import insightly.Path;

public class BaseTest {
	private static Properties prop;
	
	public static RandomObjectFiller randomObjectFiller;

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
			randomObjectFiller = new RandomObjectFiller();
			
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
}
