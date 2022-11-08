package com.handledyanamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class DynamicWebtableHandle
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sidhant\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
    //Table
	//Find Total Number of pages in table
//	String text=driver.findElement(By.xpath("")).getText();
//	System.out.println(text);; //showing 1-20(pages)
	
	
	
		WebElement pages=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody"));
		System.out.println("pages"+pages.getText()); //print all content row and column text
		
		
		int rows=driver.findElements(By.xpath("//*[@id=\"customers\"]//tbody/tr")).size();
		System.out.println(rows); ////count row in table
		
		//read all the rows from each page
		
		for(int r=2;r<=rows;r++) 
		{
		String company=driver.findElement(By.xpath("//*[@id=\"customers\"]//tbody//tr["+r+"]//td[1]")).getText();
	    String contact=driver.findElement(By.xpath("//*[@id=\"customers\"]//tbody//tr["+r+"]//td[2]")).getText();
		String country=driver.findElement(By.xpath("//*[@id=\"customers\"]//tbody//tr["+r+"]//td[3]")).getText();
	    
		System.out.println(company+"    "+contact+"    "+country);
		}
	
	driver.quit();
}}
