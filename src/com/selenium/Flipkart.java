package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");

		WebDriver h = new ChromeDriver();
		
		h.get("https://www.flipkart.com/lifestyle-big-billion-days-store?fm=neo%2Fmerchandising&iid=M_3610a65f-1bd1-46c8-98a6-6daee12c53ab_1_LFZDN752UAJV_MC.MAGMJ6L3VQ88&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion_MAGMJ6L3VQ88&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=MAGMJ6L3VQ88");
		
		h.manage().window().maximize();
		

		WebElement women = h.findElement(By.xpath("(//span[@class='_2I9KP_'])[4]"));
		women.click();
		
	
		Thread.sleep(3000);
		WebElement kurta = h.findElement(By.xpath("(//a[@class='_3QN6WI'])[15]"));
		kurta.click();
		
		
	}
}
