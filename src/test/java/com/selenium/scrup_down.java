package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrup_down {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement findElement1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement1.click();
		JavascriptException js = (JavascriptException)driver;
	
}
}
