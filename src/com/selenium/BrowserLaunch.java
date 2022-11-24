package com.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
	
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://web.whatsapp.com/");
		
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		String c = driver.getCurrentUrl();
		System.out.println(c);
		
		driver.navigate().to("https://www.youtube.com/?gl=IN&tab=r1");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
	
	}

}
