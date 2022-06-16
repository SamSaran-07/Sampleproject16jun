package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DgandDp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Propagation");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("/html/body/div[1]/p"));
		
	WebElement findElement2 = driver.findElement(By.xpath("//div[@id='droppable2']"));
	
	Actions s = new Actions (driver);
	s.dragAndDrop(findElement, findElement2).perform();
		
		
		
	}
	
}
