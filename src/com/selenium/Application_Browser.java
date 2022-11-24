package com.selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_Browser {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		r.manage().window().maximize();
		r.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3DsgxGdTXASGSzvUmi7bOIp8wX0IwRDkOQ3wA6NDy6Z4yJZAAAAAQAAAABjK_DAcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-5745721-8386403&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email = r.findElement(By.id("ap_email"));
		email.sendKeys("rohansekar2131@gmail.com");
		
		WebElement password = r.findElement(By.name("password"));
		password.sendKeys("rohan@12345");
		
		WebElement login = r.findElement(By.id("signInSubmit"));
		login.click();
		
	}

}
