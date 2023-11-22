package Testcases;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class LoginOTPCallRequest {

	String cookie;
	@Test
	public void LoginOTPRequest() {

		
		RequestSpecification loginOTP = new RequestSpecBuilder().setBaseUri("http://dev.djtretailers.com")
				.setContentType(ContentType.JSON).build();

		RequestSpecification LoginOTP = given().log().all().spec(loginOTP);

		RequestSpecification llogin=LoginOTP.body("{\r\n"
    			+ "	\"mobile\":\"9999459457\",\r\n"
    			+ "	\"otp\":{\r\n"
    			+ "		\"value\":\"5246\"\r\n"
    			+ "	}\r\n"
    			+ "}");
				
		Login_Mobile_Call_Response	lllogin= llogin.when().post("/authentication/otp-verify").as(Login_Mobile_Call_Response.class);
		
	
		
		
		System.out.println(lllogin.data.get_id());
		System.out.println(lllogin.data.getName());
		System.out.println(lllogin.data.getMobile());
		System.out.println(lllogin.data.getEmail());
		System.out.println(lllogin.data.image_url);
		System.out.println(lllogin.data.getMember_card_number());
		
	}

}
