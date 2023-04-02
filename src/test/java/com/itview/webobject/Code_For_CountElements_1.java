package com.itview.webobject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Code_For_CountElements_1 {

	WebDriver w;

	@BeforeTest
	public void beforeTest() {

		w = new ChromeDriver();

	}

	@Test(priority = 0, description = "Test case to Count WebElements ")
	public void CountWebElement() throws Exception {

		w.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		// Count number of radio button on web page.

		List<WebElement> radioButton = w.findElements(By.name("radiooptions"));
		System.out.println("Total Number of radio button : " + radioButton.size());

		// Count number of checkBox on web page.

		List<WebElement> checkBox = w.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Total Number of checkBox : " + checkBox.size());

		// Count number of drop down on web page.

		List<WebElement> drop_down = w.findElements(By.tagName("select"));
		System.out.println("Total Number of drop down list : " + drop_down.size());

		// Count number of links on web page.
		
		List<WebElement> links = w.findElements(By.tagName("a"));
		System.out.println("Total Number of links : " + links.size());


		// Print value from Drop Down List

		WebElement MonthDropDown = w.findElement(By.cssSelector("select[ng-model='monthbox']"));

		Select sel = new Select(MonthDropDown);

		System.out.println("\n Value inside Month DropDown : \n");
		List<WebElement> MonthDropDown_Values = sel.getOptions(); // .getOptions() method to fetch all elements from
																	// drop-down list

		for (int i = 1; i < MonthDropDown_Values.size(); i++) {

			System.out.println(MonthDropDown_Values.get(i).getText());

		}
	}

	@AfterTest
	public void afterTest() {

		 w.quit();
	}

}
