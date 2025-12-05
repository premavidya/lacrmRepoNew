package users;

import org.testng.annotations.Test;

import com.lacrm.api.baseclass.BaseAPIClass;
import com.lacrm.api.endpoints.IEndPoints;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ListUsersTest extends BaseAPIClass{

	@Test
	public void listUsersTest()
	{
		given()
			.spec(reqSpecObj)
			.get(IEndPoints.GetUsers)
		
		.then()
		    .statusCode(200)
			.spec(resSpecObj)
			.log().all();
	}
}
