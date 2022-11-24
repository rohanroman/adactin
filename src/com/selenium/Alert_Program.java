package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Program {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		
		WebElement simple = driver.findElement(By.id("accept"));
		simple.click();
		
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		
		WebElement ca = driver.findElement(By.id("confirm"));
		ca.click();
		
		Alert d = driver.switchTo().alert();
		System.out.println(d.getText());
		d.dismiss();
		
		WebElement pro = driver.findElement(By.id("prompt"));
		System.out.println(pro.getText());
		pro.click();
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("ROHAN");
		System.out.println(al.getText());
		al.accept();
	}

}