package com.handledyanamic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		//alert window with OK button
//		driver.findElement(By.xpath("//input[@name='alert']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		//Alert window with OK and Cancle button
//		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept(); //close alert by using ok button
//		driver.switchTo().alert().dismiss();  //close alert by using cancle button
		
		//Alert with input box
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.sendKeys("sidhnat");
		alert.accept();
		Thread.sleep(3000);
		
		
		
		
	}

}
