package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		
		WebDriver dyn = new ChromeDriver();
		
		dyn.manage().window().maximize();
		
		dyn.get("https://www.google.co.in/");
		
		//implicitly wait
		dyn.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dyn.findElement(By.name("q")).sendKeys("ponni nadhi pakkanum");
		
		//dyn.findElement(By.xpath("(//input[@class='gNO89b'])[2]//preceding::div[@class='RNNXgb']")).sendKeys("ponni nadhi");
		

	}
}
