import org.junit.Test;

import insightly.test.BaseTest;

public class FirstTest extends BaseTest {
	
	
	@Test
	public void Test() {
		System.out.println("FirstTest");
		given(this.getClass()).when().get("http://www.google.com").then().statusCode(200);
	}
}
