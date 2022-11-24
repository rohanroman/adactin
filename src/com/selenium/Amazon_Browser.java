
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\SeleniumConcepts\\driver\\chromedriver.exe");
		WebDriver rhn = new ChromeDriver();

		rhn.manage().window().maximize();

		rhn.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3DsgwPW5cYPt9Y5Fk2NGRJKKbSgK4W4WHk9RadQA5fWxkYMAAAAAQAAAABjLVkvcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage%3F_encoding%253DUTF8%2526dvah%253Dnonprimehomepage%2526ref_%253Ddvm_pds_amz_in_as_s_g_138&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-5745721-8386403&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		WebElement email = rhn
				.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		email.sendKeys("rohanroman2131@gmail.com");
		System.out.println(email.isDisplayed());
		System.out.println(email.isEnabled());

		WebElement password = rhn.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-required-field']"));
		password.sendKeys("37523581");
		System.out.println(password.isDisplayed());
		System.out.println(password.isEnabled());
		
		WebElement login = rhn.findElement(By.xpath("//input[@class='a-button-input']"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		login.click();
		
		

	}

}
