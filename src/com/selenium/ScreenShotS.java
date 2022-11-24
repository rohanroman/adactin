package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotS {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");

		WebDriver rhn = new ChromeDriver();

		rhn.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734074&hvpos=&hvnetw=g&hvrand=6180791702575355746&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061967&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=Cj0KCQjwhY-aBhCUARIsALNIC048XrR9cNT5m_6KfxHVW7CMCjhgi2Y57ETZz_-iMo5ymArPhooD7_8aAnClEALw_wcB");
		
		rhn.manage().window().maximize();
		
		WebElement lang = rhn.findElement(By.id("icp-touch-link-language"));
		JavascriptExecutor js = (JavascriptExecutor) rhn;
		js.executeScript("arguments[0].scrollIntoView();", lang);
		
		TakesScreenshot rr = (TakesScreenshot) rhn;
		
		File src = rr.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\ScreenShot\\amazon.png");
		
		FileUtils.copyFile(src, des);

	}

}
