package com.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_App {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();
		rhn.get("https://www.youtube.com/?gl=IN&tab=r1");
		
		WebElement searc = rhn.findElement(By.xpath("//input[@autocapitalize='none']"));
		searc.sendKeys("Mallipo song");
		
		rhn.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		
		Thread.sleep(2000);
		rhn.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		
		Thread.sleep(2000);
		rhn.findElement(By.xpath("//div[@class='ytp-scrubber-container']")).click();
	}

}
