package com.itview.testng;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AllAnnotations {
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println(" ------------------- beforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println(" ------------------- afterMethod");

	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println(" ---------------- beforeClass");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("------------------ afterClass");

	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println(" -------------- beforeTest");

	  }
	  
	  @Test
	  public void Test1() {
		  System.out.println(" ---------------------- Test1");

	  }
	  
	  @Test
	  public void Test2() {
		  System.out.println(" ---------------------- Test2");

	  }
	  
	  @Test
	  public void Test3() {
		  System.out.println(" ---------------------- Test3");

	  }
	  

	  @AfterTest
	  public void afterTest() {
		  System.out.println(" -------------- afterTest");

	  }

	  @BeforeSuite
	  public void beforeSuite() {
	  
	  System.out.println("beforeSuite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("afterSuite");

	  }

	}