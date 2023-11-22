package fake_practising_Api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class pojo {
	
	public static void main(String[] args) {

		// RestAssured.baseURI="https://dummy.re  stapiexample.com/";

		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://dummy.restapiexample.com/").

				setContentType("text/html").build();
		
		DataDetails dataofemployees = given().log().all().spec(req).when().get("api/v1/employees")
				.as(DataDetails.class);
		int size = dataofemployees.getData().size();
		System.out.println("Details of employees are");
		for (int i = 0; i < size; i++) {
			if (i == 17) {
				System.out.println("details of " + i + " employee is " + dataofemployees.getData().get(i).getId());
				System.out.println("details of " + i + " employee salary is "
						+ dataofemployees.getData().get(i).getEmployee_salary());
				System.out.println(
						"details of " + i + " employee age is " + dataofemployees.getData().get(i).getEmployee_age());
				System.out.println(
						"details of " + i + " profile image is " + dataofemployees.getData().get(i).getProfile_image());
			}
		}

		System.out.println(dataofemployees.getMessage());
	}

}
