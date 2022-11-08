package com.handledyanamic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	//Que.1-How to handle browser window in selenium
	//Que.2-differnece bet getWindowHandle() & getWindowHandles() methods?
	//Que.3-how to switch between multiple browser windows?
	//Que.4how to close all browser windows?
	//Que.5-how to close specific browser window by choice?
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//--------------	
		//getWindowHandle()-get id of only one browser windrow-return string
	//	String windowID=driver.getWindowHandle(); //return id of single browser window
	//	System.out.println(windowID); //at runtime dynamically window id created for browser window
	//--------------------------------------	
		
		
		//getWindowHandles()-id of multiple browser window-return set of string
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowIDs=driver.getWindowHandles(); //return ids of multiple 

		//First Method-By using Iterator() use to capture id window
		
	/*	Iterator<String> it=windowIDs.iterator(); //return iterator object string-to get parent,child window id useing iterator
		String parentwindowID=it.next(); //every id string format 
		String childwindowID=it.next();
		
		System.out.println("Parent window id"+parentwindowID);
		System.out.println("Child window id"+childwindowID); */
		
		
		//2nd method using List/ArrayList
		List<String> windowIDsList=new ArrayList(windowIDs); //coverting set to list 
		/*String parentwindowID=windowIDsList.get(0);
		String childwindowID=windowIDsList.get(1);
		
		System.out.println("Parent window id"+parentwindowID);
		System.out.println("Child window id"+childwindowID);
		
		
		//How to use window id for switching purpose
		
		driver.switchTo().window(parentwindowID);
		System.out.println("Parent window title"+driver.getTitle());
		
		driver.switchTo().window(childwindowID);
		System.out.println("Child window title"+driver.getTitle());*/
		
		//using for each loop
		
		/*for(String wid:windowIDsList)
		{
			//System.out.println(wid); //print windowid
			String title=driver.switchTo().window(wid).getTitle();
			System.out.println(title);
		}*/
		//driver.close();  //close single browser window driver which pinning
		//driver.quit();  // close all the browser windows
		
		//Que.5-how to close specific browser window by choice?
			for(String wid:windowIDsList)
			{
			   String title=driver.switchTo().window(wid).getTitle();
			    if(title.equals("OrangeHRM"))
			  {
				driver.close();
			  }
			
		}
	}
	}
