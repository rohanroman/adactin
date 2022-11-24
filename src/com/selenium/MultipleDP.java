package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDP {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();
		rhn.manage().window().maximize();
		rhn.get("https://letcode.in/dropdowns");

		WebElement fruit = rhn.findElement(By.id("fruits"));
		Select f = new Select(fruit);
		f.selectByValue("4");

		WebElement heros = rhn.findElement(By.id("superheros"));
		Select h = new Select(heros);
		h.selectByValue("bt");
		h.selectByValue("sm");
		h.selectByValue("gr");

		h.deselectByVisibleText("Ghost Rider");

		List<WebElement> rr = h.getOptions();
		for (WebElement wbelm : rr) {
			System.out.println(wbelm.getText());
		}
		System.out.println("***************************");
		List<WebElement> opt = h.getAllSelectedOptions();
		for (WebElement wbelmt : opt) {
			System.out.println(wbelmt.getText());

		}
		System.out.println("First Selected Method:");
		WebElement SelectedOption = h.getFirstSelectedOption();
		System.out.println(SelectedOption.getText());

		h.deselectAll();

	}

}
