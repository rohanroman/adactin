package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();

		rhn.get("https://adactinhotelapp.com/SearchHotel.php");
		
		rhn.manage().window().maximize();
		
		rhn.findElement(By.id("username")).sendKeys("RohanRoman3116");
		
		rhn.findElement(By.id("password")).sendKeys("1234567890");
		
		rhn.findElement(By.id("login")).click();
		
		WebElement country = rhn.findElement(By.id("location"));
		country.click();
	    Select s= new Select(country);
	    s.selectByValue("Los Angeles");
	    
	    WebElement htl = rhn.findElement(By.id("hotels"));
		htl.click();
	    Select s1= new Select(htl);
	    s1.selectByValue("Hotel Sunshine");
	    
	    WebElement RmTyp = rhn.findElement(By.id("room_type"));
		RmTyp.click();
	    Select s2= new Select(RmTyp);
	    s2.selectByValue("Super Deluxe");
	    
	    WebElement Rmno = rhn.findElement(By.id("room_nos"));
		Rmno.click();
	    Select s3= new Select(Rmno);
	    s3.selectByValue("2");
	    
	    
	    WebElement  date= rhn.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("31/10/2022");
		
		WebElement dateout = rhn.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("02/11/2022");
		
		WebElement adult = rhn.findElement(By.id("adult_room"));
		adult.click();
	    Select s4= new Select(adult);
	    s4.selectByValue("2");
	    
	    WebElement chldrm = rhn.findElement(By.id("child_room"));
		chldrm.click();
	    Select s5= new Select(chldrm);
	    s5.selectByValue("0");
	    
	    rhn.findElement(By.id("Submit")).click();
		
	    rhn.findElement(By.id("radiobutton_0")).click();
	    
	    rhn.findElement(By.id("continue")).click();
	    
		rhn.findElement(By.id("first_name")).sendKeys("Rohan");
		
		rhn.findElement(By.id("last_name")).sendKeys("Sekar");
		
		rhn.findElement(By.id("address")).sendKeys("12/23,B, KK nagar Chennai");
		
		rhn.findElement(By.id("cc_num")).sendKeys("12345678900987656");
		
		WebElement card = rhn.findElement(By.id("cc_type"));
		card.click();
		Select s6= new Select(card);
		s6.selectByValue("VISA");
		
		WebElement expmnt = rhn.findElement(By.id("cc_exp_month"));
		expmnt.click();
		Select s7= new Select(expmnt);
		s7.selectByIndex(11);
		
		WebElement expyr = rhn.findElement(By.id("cc_exp_year"));
		expyr.click();
		Select s8 = new Select(expyr);
		s8.selectByValue("2022");
		
		rhn.findElement(By.id("cc_cvv")).sendKeys("576");
		
		rhn.findElement(By.id("book_now")).click();
		
	}

}
