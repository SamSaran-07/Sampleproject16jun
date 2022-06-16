package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/aclk?sa=L&ai=DChcSEwi-neDf8aL4AhU5mmYCHYKzCCsYABAAGgJzbQ&ae=2&sig=AOD64_0CZplaXmid_hfdYihufegbOK7mOg&q&adurl&ved=2ahUKEwj9pdjf8aL4AhXJ7XMBHe3hDOMQ0Qx6BAgCEAE");
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		findElement.sendKeys("iphone");
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		findElement2.click();
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		findElement4.click();
		TakesScreenshot t =  (TakesScreenshot)driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File ("D:\\sub\\JAVA\\Day 32.png"));




	}

}
