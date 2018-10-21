package com.Java_Programmes.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']")))
		.moveToElement(driver.findElement(By.xpath("")))
		.build().perform();

	}

}
