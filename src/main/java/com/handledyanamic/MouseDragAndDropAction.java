package com.handledyanamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDropAction {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement element=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
        Actions action=new Actions(driver);
        action.dragAndDrop(element, element1).perform();
        
}}
