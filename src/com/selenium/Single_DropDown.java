package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();
		rhn.manage().window().maximize();
		rhn.get("https://www.facebook.com/");
		WebElement create = rhn.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(2000);
		WebElement first = rhn.findElement(By.name("firstname"));
		first.sendKeys("Rohan");
		
		WebElement lst = rhn.findElement(By.name("lastname"));
		lst.sendKeys("Sekar");
		
		WebElement email = rhn.findElement(By.name("reg_email__"));
		email.sendKeys("rohansekar2131@gmail.com");
		
		WebElement confirm = rhn.findElement(By.name("reg_email_confirmation__"));
		confirm.sendKeys("rohansekar2131@gmail.com");
		
		WebElement password = rhn.findElement(By.id("password_step_input"));
		password.sendKeys("54321678");
		
		WebElement day = rhn.findElement(By.id("day"));
		Select r1 = new Select(day);
		r1.selectByValue("31");
		
		WebElement month = rhn.findElement(By.name("birthday_month"));
		Select r2 = new Select(month);
		r2.selectByIndex(9);
		
		WebElement year = rhn.findElement(By.id("year"));
		Select r3 = new Select(year);
		r3.selectByVisibleText("1997");
		
		WebElement Gender = rhn.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Gender.click();

//		WebElement signup = rhn.findElement(By.name("websubmit");
//		signup.click();
	}

}
