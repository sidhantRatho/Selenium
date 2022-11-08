package com.handledyanamic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Que1.How to select specific check box?
//Que2.How to select all check boxes?
//Que3.How to select multiple check boxes by choice?
//Que4.How to select last 2 check boxes?
//Que5.How to select first 2 check boxes?
public class HandleCheckbox {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	
	/*//Que1.How to select specific check box?
	
	driver.findElement(By.xpath("//input[@id='monday']")).click(); //select monday checkbox*/
	
	//Que2.How to select all check boxes?
	
	List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	System.out.println("Total number of checkboixes"+checkboxes.size());
	
	/*//using for loop
	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}*/
	
	/*//using for-each loop
	for(WebElement chbox:checkboxes)
	{
		chbox.click();
	}*/
	
	/*//Que3.How to select multiple check boxes by choice?
	//I want to select monday and sunday only-get attribute of the checkbox
	for(WebElement chbox:checkboxes)
	{
		String checkboxname=chbox.getAttribute("id");
		if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
		{
			chbox.click();
		}}*/
	
	/*//Que4.How to select last 2 check boxes?
	 //total no of check boxes-no of check boxes want to select=starting index
	  //7-2=5
	int totalcheckboxes=checkboxes.size();
	for(int i=totalcheckboxes-2;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}*/
	
	
	//Que5.How to select first 2 check boxes?
	
	/*int totalcheckboxes=checkboxes.size();
	for(int i=totalcheckboxes-6;i<checkboxes.size();i--)
	{
		checkboxes.get(i).click();
	}*/
	
	int totalcheckboxes=checkboxes.size();
	for(int i=0;i<checkboxes.size();i++)
	{
		if(i<2) 
		{
			checkboxes.get(i).click();
		}
		
	}
	
	
}}
