package com.lacrm.api.baseclass;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import com.lacrm.api.genericutility.DatabaseUtility;
import com.lacrm.api.genericutility.FileUtility;
import com.lacrm.api.genericutility.JavaUtility;

import static io.restassured.RestAssured.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseAPIClass {

	public DatabaseUtility dbUtil =new DatabaseUtility();
	public JavaUtility jUtil = new JavaUtility();
	public FileUtility fUtil = new FileUtility();
	public static  RequestSpecification reqSpecObj;
	public static ResponseSpecification resSpecObj;
		
	@BeforeSuite
	public void configBS() throws IOException
	{		
		dbUtil.connectToDB();
		RequestSpecBuilder reqSpec = new RequestSpecBuilder();
		reqSpec.setBaseUri(fUtil.getDataFromProperty("BaseURI"));
		reqSpec.setAuth(oauth2(fUtil.getDataFromProperty("token")));
		
		
		reqSpec.setContentType(ContentType.JSON);
		reqSpecObj=reqSpec.build();
	}
	public void configAS()
	{
		dbUtil.closeDB();
	}
}
