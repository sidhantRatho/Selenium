package com.handledyanamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Que.how to perform double click action?
public class MouseDoubleClickAction {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
       Actions act=new Actions(driver);
       act.doubleClick(element).perform();
       driver.switchTo().alert().accept();
}}
