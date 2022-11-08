package com.handledyanamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Que.how to perform double click action in frame
public class MouseDoubleClickAction2 {public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("Sidhant Rathod");
	WebElement element=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	
	Actions act=new Actions(driver);
	act.doubleClick(element).perform(); // perform double click action
	

}}

