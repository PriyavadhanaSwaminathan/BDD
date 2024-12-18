package restassuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Demo1_GET_Request {
	@Test
	 public void weatherdetails() {
		 
		 given()
		 .when()
		 	.get("https://demoqa.com/utilities/weather/city/Hyderabad")
		 .then()
		 	.statusCode(200)
		 	.statusLine("HTTP/1.1 200 OK")
		 	.assertThat().body("City", equalTo("Hyderabad"))
		 	.header("Content-Type","application/json; charset=utf-8");
		 			
		 }
}
