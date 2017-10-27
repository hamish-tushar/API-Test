import org.junit.Test;

import static io.restassured.RestAssured.given;

public class FirstTest {
	
	
	@Test
	public void Test() {
		given().when().get("http://www.google.com").then().statusCode(200);
	}
}
