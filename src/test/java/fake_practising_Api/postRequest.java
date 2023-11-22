package fake_practising_Api;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.RestAssured;

public class postRequest {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("firstname", "Ram");
		map.put("lastname", "sharma");
		map.put("totalprice", "111");
		map.put("depositpaid", "true");
		HashMap<String, Object> mapp = new HashMap<String, Object>();
		mapp.put("checkin", "2018-01-01");
		mapp.put("checkout", "2019-01-01");
		map.put("bookingdates", mapp);
		map.put("additionalneeds", "Breakfast");
		String res = given().log().all().body(map).when().post("booking").then().assertThat().statusCode(200).extract()
				.response().asString();
	}

}
