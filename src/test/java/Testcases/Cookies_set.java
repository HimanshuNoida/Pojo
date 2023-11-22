package Testcases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Cookies_set {

	@Test
	public void CookiesSet() {

		Cookie cookie = new Cookie();
		cookie.setLatitude("28.49452");
		cookie.setLongitude("77.09579");

		RequestSpecification spec = new RequestSpecBuilder().setBaseUri("http://dev.djtretailers.com")
				.setContentType(ContentType.JSON).build();

		RequestSpecification sspec = given().log().all().spec(spec).body(cookie);

		Cookie_Response cokk = sspec.log().all().when().post("/address/set").as(Cookie_Response.class);
		System.out.println(cokk.getSuccess());
		System.out.println(cokk.getMessage());
		
	}

}
