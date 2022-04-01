package com.wiki.seleniumScripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Script2 {
	
	WebDriver driver; 
	
	@Test
	public void wikiSearchtest() {
		
		// open the browser using Selenium
		
				 driver = new ChromeDriver();
				 
				 //Maximize the window
				 
				 driver.manage().window().maximize();
				 
				 
				 String baseUrl = "https://en.wikipedia.org/wiki/Main_Page";
				 
				 //Launch Chrome and direct it to the Base URL
				 
				 driver.get(baseUrl);
				 //driver.get("https://www.wiki.com/");
				 
				 //selenium to find the inputbox and enter data -> selenium automation
				 
				 driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Selenium Automation");
				 
				 driver.findElement(By.xpath("//input[@class='searchButton']")).click();
				 
				 
				 
				 WebElement label = new WebDriverWait(driver, 5).until(
						 driver -> driver.findElement(By.xpath("//a[@title='Selenium (software)']")));
				 
				 assertEquals(label.getText(), "Selenium (software)"); 

				 driver.close();
				
				
			}
	}

