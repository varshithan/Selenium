package projectemployee.springprojectemployee;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetDataTest {
	
	@Test
	public void testResponsecode()
	{
	
	int code = get("http://localhost:8080/employees").getStatusCode();
	
	System.out.println("the status code is "+ code);
	
	Assert.assertEquals(code, 200);

	}
	
	@Test
	public void testBody()
	{
		
		Response response =get("http://localhost:8080/employees");
		String bodyStringValue = response.getBody().asString();
	    System.out.print(bodyStringValue);
	    
	}
	    

}
	
	