package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOverAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions a = new Actions (driver);
		
		WebElement findElement = driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(findElement).perform();
		
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"browse_courses-greens\"]/ul/li[4]/div[1]"));
		a.moveToElement(findElement2).perform();
		
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"submenu-3\"]/ul/li[3]/a"));
		a.moveToElement(findElement3).perform();
	findElement3.click();
		
		
	}
	
}
