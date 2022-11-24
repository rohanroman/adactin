package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActioN {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();
		
		rhn.manage().window().maximize();
		
		rhn.get("https://testautomationpractice.blogspot.com/");
		
		Actions ac = new Actions(rhn);
		Robot rb = new Robot();
		
		//drag and drop; 
		WebElement src = rhn.findElement(By.id("draggable"));
		WebElement drc = rhn.findElement(By.id("droppable"));
		
		ac.dragAndDrop(src, drc).perform();
		rhn.navigate().to("https://www.amazon.in/");
		
		//move to element
		WebElement mob = rhn.findElement(By.linkText("Mobiles"));
		ac.moveToElement(mob).perform();
		
		//keyboard action
		WebElement deal = rhn.findElement(By.linkText("Today's Deals"));
		ac.contextClick(deal).perform();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
