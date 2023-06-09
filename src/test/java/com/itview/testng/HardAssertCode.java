package com.itview.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssertCode {

	WebDriver w;

	@BeforeTest
	public void preCondition() {

		w = new ChromeDriver();
	}

	@Test(priority = 0, description = "Test Login Functionality")
	public void loginTest() {
		
		w.get("http://altoromutual.com:8080/login.jsp");
		
		//1. verify page title should be "Altoro Login"		
		String loginPageTitle=w.getTitle();		
		Assert.assertEquals(loginPageTitle, "Altoro Mutual");
		
		//2. verify page url should be -> http://altoromutual.com:8080/login.jsp
		String loginPageURL=w.getCurrentUrl();		
		Assert.assertEquals(loginPageURL, "http://altoromutual.com:8080/login.jsp");
		
		//3. verify page label should contain "Login"

		WebElement loginPageLabel=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
		String loginPageLabelText=loginPageLabel.getText();		
		Assert.assertTrue(loginPageLabelText.contains("Admin"), "Login Page Label doesn't contains 'Login'");
		
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		
	}

	@Test(priority = 1, description = "Test Logout Functionality", dependsOnMethods = "loginTest")
	public void logoutTest() throws Exception {
		
		String homePageTitle=w.getTitle();
		Assert.assertEquals(homePageTitle, "Altoro Mutual");
		
		WebElement homePageLabel=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1"));
		String homePageLabelText=homePageLabel.getText();			
		Assert.assertTrue(homePageLabelText.contains("Admin"), "Home Page Label doesn't contains 'Admin'");
		
		WebElement SignOffLink=w.findElement(By.linkText("Sign Off"));
		Assert.assertTrue(SignOffLink.isDisplayed(),"Sign Off link not present on home page");
		
		Thread.sleep(2000);
		w.findElement(By.linkText("Sign Off")).click(); // 2 Sec
	}

	@AfterTest
	public void postCondition() {
		
		w.close();
	}

}
