package com.itview.webobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class test {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");	
		
		WebDriver w = new ChromeDriver(co);
				
		w.get("https://www.zoopla.co.uk/");
		
	//	w.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/input")).sendKeys("London");		
	//	w.findElement(By.xpath("//*[@id=\"radix-4-content-for-sale\"]/div/form/div/div[2]/button/div/div[2]")).click();

	}

}
