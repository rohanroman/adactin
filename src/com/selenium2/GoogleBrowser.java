package com.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowser {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		
		
		//driver.findElement(By.xpath("//span[@class='MrEfLc']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@role='presentation'])[1]")));
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		
	}
}
