package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGooglesearch {
	public static void main(String[] args) {
		googleSearch();
	}

	public static void googleSearch() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sidhant\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//go to google.com
		driver.get("https://www.google.com/");
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("automation selenium");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 
		
		//close browser
		driver.close();
		System.out.println("Test completed successfuly");
	}
}
