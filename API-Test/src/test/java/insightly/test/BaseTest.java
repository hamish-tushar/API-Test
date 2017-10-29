package insightly.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.junit.Before;
import org.junit.BeforeClass;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import insightly.Path;

public class BaseTest {
	private static Properties prop;
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

			RestAssured.baseURI = prop.getProperty("uri");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    protected static RequestSpecification given() {
        return RestAssured.given().header("Authorization", "Basic " + new String(Base64.encodeBase64(prop.getProperty("api-key").getBytes())));
    }
    
    @Before
    public void Version() {
    	Path annotation = this.getClass().getAnnotation(Path.class);
    	if(annotation != null) {
    		RestAssured.basePath = annotation.value();
    	}
    }
}
