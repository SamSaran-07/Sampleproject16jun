package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robtclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement findElement1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement1.click();
		WebElement findElement = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		//findElement.sendKeys(Keys.SPACE);
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.contextClick(findElement).perform();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		//action.contextClick(findElement).perform();
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		
		
	}
}
