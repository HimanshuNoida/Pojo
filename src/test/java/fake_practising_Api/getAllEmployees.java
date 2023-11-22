package fake_practising_Api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

public class getAllEmployees {
	
	public static void main(String[] args) {
		
		String Act_employee_name="Tiger Nixon";
		RestAssured.baseURI="https://dummy.restapiexample.com/";
	    String res=given().log().all().when().get("api/v1/employees").then().log().all().
		assertThat().extract().response().asString();
	  
	    JsonPath js=new JsonPath(res);
	   int size= js.getInt("data.size()");
	   System.out.println(size);
	  
	   for(int i=0;i<size;i++) {
		   
		String exp_employee_name=js.get("data["+i+"].employee_name");
		//in assert actual first comes then expected comes
		if(Act_employee_name.equalsIgnoreCase("Tiger Nixon")){
			System.out.println("The "+Act_employee_name +" found in the employee_name");
			break;
		}
		Assert.assertEquals(Act_employee_name, exp_employee_name,"There is mismatch in Actual and Expected");
		   
	   }
	   
	   
	   
	   
	    
	    
	
	
	}

}
