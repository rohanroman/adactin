package com.selenium2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();

		rhn.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg-CpzNsf7FORYYOx9p49E7pie_5J7HS7tUIvxb58ZD-wAAAAAQAAAABjQSHrcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2Fsignup%3Fref_%253Datv_nb_signup_mlp&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-5745721-8386403&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		rhn.manage().window().maximize();
		
		WebElement email = rhn.findElement(By.id("ap_email"));
		email.sendKeys("rohansekar2131@gmail.com");
		
		WebElement password = rhn.findElement(By.id("ap_password"));
		password.sendKeys("222564653");
		
		WebElement submit = rhn.findElement(By.id("signInSubmit"));
		submit.click();
		
	}

}
