package com.lacrm.api.genericutility;

import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class RestAssuredUtility {

	FileUtility fUtil = new FileUtility();
	public String getDataOnJsonPath(Response resp,String jsonXpath)
	{
		List<Object> lst = JsonPath.read(resp.asString(),jsonXpath);
		return lst.get(0).toString();
	}

	public boolean verifyDataOnJsonPath(Response resp, String expectedData,String jsonXpath)
	{
		List<String> lst = JsonPath.read(resp.asString(),jsonXpath);
		boolean flag = false;
			for(String str:lst)
			 {
				if(str.equals(expectedData))
				 {
				   System.out.println(expectedData+" is avaliable");
				   flag=true;
				 }
			 }
				return flag;
		}
	public String getAccessToken() throws IOException 
	{
		Response resp = given()
					.formParam("client_id",fUtil.getDataFromProperty("client_id"))
					.formParam("client_secret", fUtil.getDataFromProperty("client_secret"))
					.formParam("grant_type",fUtil.getDataFromProperty("grant_type"))
					
					.when()
					.post("http://localhost:9080/token");
		resp.then().log().all();
		String token = resp.jsonPath().get("access_token");
		return token;
					
	}
}
