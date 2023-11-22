package Testcases;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() {

		LoginCallMobile_Number_Call login = new LoginCallMobile_Number_Call();

		login.setMobile("9999459457");

		RequestSpecification req = new RequestSpecBuilder().setBaseUri("http://dev.djtretailers.com")
				.setContentType(ContentType.JSON).build();
		RequestSpecification requestSpecification = given().log().all().spec(req).body(login);

		Login_Mobile_Call_Response llogin = requestSpecification.log().all().when().post("/authentication/login")
				.as(Login_Mobile_Call_Response.class);

		System.out.println(llogin.getMessage());
		System.out.println(llogin.getSuccess());
		System.out.println(llogin.data.getMobile());
		
		
		

	}


}
