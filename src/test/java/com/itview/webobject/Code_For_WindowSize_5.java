package com.itview.webobject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Code_For_WindowSize_5 {

	WebDriver w;

	@BeforeTest
	public void beforeTest() {

		   w=new ChromeDriver();
           w.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
   	       w.manage().window().maximize();
   	       //OR
   		  Dimension d=new Dimension(1280, 880); // width , height
		  w.manage().window().setSize(d);
      
		   
	}

	@Test
	public void Code_For_WindowSize() throws InterruptedException {
		
	
		w.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		}

	@AfterTest
	public void afterTest() {
	//	w.quit();
	}

}
