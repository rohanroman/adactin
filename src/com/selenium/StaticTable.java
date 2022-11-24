package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");

		WebDriver rhn = new ChromeDriver();

		rhn.manage().window().maximize();

		rhn.get("https://letcode.in/table");

		System.out.println("+++++All Data++++");

		List<WebElement> alldata = rhn.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for (WebElement all : alldata) {
			System.out.println(all.getText());
			}
		List<WebElement> cd = rhn.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));
		for (WebElement data : cd) {
			System.out.println(data.getText());	
		}
		
		List<WebElement> data = rhn.findElements(By.xpath("(//table)[3]/tr/td"));
		for (WebElement da : data) {
			System.out.println(da.getText());
		}

	}

}
