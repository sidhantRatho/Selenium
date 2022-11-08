package com.handledyanamic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Que.How to login into any site if it is showing any authenticator popup for username and password?
public class AuthenticatorPopup {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			//syntax
			//http://username:password@URL
			//http://admin:admin@the-internet.herokuapp.com/basic_auth
  }
 }
