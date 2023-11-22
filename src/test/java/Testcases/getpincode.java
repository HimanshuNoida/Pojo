package Testcases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import pinco.getPincode;
import pinco.warehouse_data;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class getpincode {

	@Test
	public void getpincode() {

		Pincode pin = new Pincode();
		pin.setPincode("201302");

		RequestSpecification res = new RequestSpecBuilder().setBaseUri("http://dev.djtretailers.com")
				.setContentType(ContentType.JSON).build();

		RequestSpecification requestSpecification = given().log().all().spec(res).body(pin);

		Pinncode  pincode = requestSpecification.when().post("/address/believe/set").as(Pinncode.class);
       pincode.getData().getWarehouse_data().get(1).getExpressbees();
       
	
    	
    
	}

}
