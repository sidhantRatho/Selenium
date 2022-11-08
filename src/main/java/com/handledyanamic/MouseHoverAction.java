package com.handledyanamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
		Thread.sleep(2000);
		WebElement macMenu=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(desktop).moveToElement(macMenu).click().perform();
		

	}

}
