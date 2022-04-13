package com.wiki.seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script1 {
	WebDriver driver; 
	@Test(priority='2')
	
	public void wikipageTest() {
		
		//declaration and instantiation of objects/variables
		
		System.setProperty("webdriver.chrome.driver","./chromedriver");
		
		
		// open the browser using Selenium
		
		 driver = new ChromeDriver();
		 
		 //Maximize the window
		 
		 driver.manage().window().maximize();
		 
		 
		 String baseUrl = "https://www.wikipedia.org/";
		 
		 //Launch Chrome and direct it to the Base URL
		 
		 driver.get(baseUrl);
		 //driver.get("https://www.wiki.com/");
		
		
	}
	
	@Test(priority='1')
	public void wikipageTest2() {
		
		System.out.println("my second testcase");
	}
	
}
