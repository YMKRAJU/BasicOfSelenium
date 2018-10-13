package com.Java_Programmes.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.navigate().to("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fpages.ebay.com%2Fmessages%2Fpage_not_found.html");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("MkR7");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("y@rragudi");
//		driver.findElement(By.xpath("//input[contains(@id,Lastname) and @name='lastName']")).sendKeys("y@rragudi7");
		driver.findElement(By.name("email")).sendKeys("kanta2121@gmail.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("yarragudi7");
		Boolean b1= driver.findElement(By.xpath("//input[@type='checkbox' and @name='checkbox-default']")).isSelected();
		System.out.println("CheckBox is selected: "+b1);
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='checkbox-default']")).click();
		Boolean b2= driver.findElement(By.xpath("//input[@type='checkbox' and @name='checkbox-default']")).isSelected();
		System.out.println("Check box is selected: "+b2);
		Thread.sleep(3000);
		Boolean submit = driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).isEnabled();
		System.out.println("Submit button is Enabled: "+submit);
		driver.close();
	}

}
