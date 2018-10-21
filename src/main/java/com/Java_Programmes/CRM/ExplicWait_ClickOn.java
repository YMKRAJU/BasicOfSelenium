package com.Java_Programmes.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicWait_ClickOn {

	public static void main(String[] args) {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		ClickOn(driver, driver.findElement(By.xpath("//a[@href='NewFlights.aspx']")), 20);
	}
	
	public static void ClickOn(WebDriver driver, WebElement locator, int timeouts) {
		new WebDriverWait(driver,timeouts).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();		
	}
}
