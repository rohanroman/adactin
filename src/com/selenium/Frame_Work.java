package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Work {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.name("fname")).sendKeys("Rohan");
		
		driver.findElement(By.name("lname")).sendKeys("Sekar");
		
		WebElement inframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		driver.switchTo().frame(inframe);
		
		driver.findElement(By.name("email")).sendKeys("rohansekar2131@gmail.com");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Watch tutorial")).click();
		
	}

}
