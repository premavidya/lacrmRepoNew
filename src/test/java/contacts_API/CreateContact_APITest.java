package contacts_API;

import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import com.lacrm.api.baseclass.BaseAPIClass;
import com.lacrm.api.endpoints.IEndPoints;
import com.lacrm.api.pojoclass.Address;
import com.lacrm.api.pojoclass.CreateContactPOJO;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class CreateContact_APITest extends BaseAPIClass{

	@Test
	public void createContactTest()
	{
		Address addrObj = new Address("JPNagar","Bangalore","Karnataka","India",569909);
		List<String> lst = new ArrayList<String>();
		lst.add("Lead");
		lst.add("Priority");
		int randNum=jUtil.getRandomNumber();
		String contactName="User"+randNum;
		CreateContactPOJO cObj = new CreateContactPOJO(contactName,"Jane",contactName+"@gmail.com",9880057766L,"GlobalSoft","Senior QA",lst,addrObj);
		Response resp=given()
			.spec(reqSpecObj)
			.body(cObj)
		.when()
			.post(IEndPoints.CreateContact);
		resp.then()
		.statusCode(201)
		.time(Matchers.lessThan(5000L))
		.spec(resSpecObj)
		.log().all();
	}
	
	@Test
	public void deleteContactTest()
	{
		//create contact
		Address addrObj = new Address("JPNagar","Bangalore","Karnataka","India",569909);
		List<String> lst = new ArrayList<String>();
		lst.add("Lead");
		lst.add("Priority");
		int randNum=jUtil.getRandomNumber();
		String contactName="User"+randNum;
		CreateContactPOJO cObj = new CreateContactPOJO(contactName,"Jane",contactName+"@gmail.com",9880057766L,"GlobalSoft","Senior QA",lst,addrObj);
		
		Response resp=given()
				
				.spec(reqSpecObj)
				.body(cObj)
			.when()
				.post(IEndPoints.CreateContact);
			String contId=resp.jsonPath().get("ContactIds");
			resp.then()
				.statusCode(201)
				.log().all();
			
		//Delete contact
			
		given()
			.spec(reqSpecObj)
			.pathParam("contactId", contId)
		.when()
			.delete(IEndPoints.DeleteContact)
		.then()
			.statusCode(204)
			.body("Success",Matchers.equalTo("true"))
			.time(Matchers.lessThan(300L))
			.spec(resSpecObj)
			.log().all();
			
	}
	@Test
	public void editContactTest()
	{
		//create contact
				Address addrObj = new Address("JPNagar","Bangalore","Karnataka","India",569909);
				List<String> lst = new ArrayList<String>();
				lst.add("Lead");
				lst.add("Priority");
				int randNum=jUtil.getRandomNumber();
				String contactName="User"+randNum;
				CreateContactPOJO cObj = new CreateContactPOJO(contactName,"Jane",contactName+"@gmail.com",9880057766L,"GlobalSoft","Senior QA",lst,addrObj);
				
				Response resp=given()
						
						.spec(reqSpecObj)
						.body(cObj)
					.when()
						.post(IEndPoints.CreateContact);
					String contId=resp.jsonPath().get("ContactIds");
					resp.then()
						
						.log().all();
					
					//Edit Contact - Put request
					given()
					 .spec(reqSpecObj)
					 .pathParam("contactId", contId)
					.when()
						.put(IEndPoints.EditContact)
					.then()
						.contentType(ContentType.JSON)
						.statusCode(200)
						.body("Success",Matchers.equalTo("true"))
						.spec(resSpecObj)
						.log().all();
	}
}
