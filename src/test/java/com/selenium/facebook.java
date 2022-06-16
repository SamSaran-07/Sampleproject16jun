package com.selenium;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class facebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("sdfghjk");
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.sendKeys("sa3456");
	System.out.println("done");
	WebElement findElement3 = driver.findElement(By.tagName("h2"));
	System.out.println();
	String text = findElement3.getText();
	System.out.println(text);
	WebElement findElement4 = driver.findElement(By.xpath("//button[@type='submit']"));
	
//	findElement4.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	TakesScreenshot tc =  (TakesScreenshot) driver;
	File screenshotAs = tc.getScreenshotAs(OutputType.FILE);
	File sc = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Sample\\src\\w\\fc.png");
	
	FileUtils.copyFile(screenshotAs, sc);

	
	Actions a = new Actions (driver);
	a.moveToElement(findElement4).perform();
	Actions click = a.click();
	Actions sendKeys = click.sendKeys(Keys.ENTER);
	
	
	
	}
	
}
