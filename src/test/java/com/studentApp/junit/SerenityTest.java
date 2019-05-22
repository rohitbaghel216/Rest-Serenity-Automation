package com.studentApp.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;



@RunWith(SerenityRunner.class)
public class SerenityTest {
	
	
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8085;
		RestAssured.basePath="student";
	}
	@Test
	public void getAllStudents()
	{
		 // RequestSpecification reqSpec =   RestAssured.given();
		  RestAssured.given().when().get("/list").then().log().all().statusCode(200);
		  
		  
		
	}

}
