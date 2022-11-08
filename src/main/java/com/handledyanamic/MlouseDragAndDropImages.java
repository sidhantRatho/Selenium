package com.handledyanamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Que.how to drag and drop in iframe
public class MlouseDragAndDropImages {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
		WebElement ele3=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele3).perform();// move both the item in trash
		act.dragAndDrop(ele2, ele3).perform();
}}
