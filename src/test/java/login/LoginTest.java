package login;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.lacrm.api.baseclass.BaseAPIClass;
import com.lacrm.api.endpoints.IEndPoints;

import static io.restassured.RestAssured.*;

public class LoginTest extends BaseAPIClass{

	@Test
	public void loginTest()
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("username", "user123");
		map.put("password", "password@123");
		
		given()
			.spec(reqSpecObj)
			.body(map)
		.when()
			.post(IEndPoints.Login)
		.then()
			.spec(resSpecObj)
			.log().all();
	}
}
