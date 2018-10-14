package com.Java_Programmes.CRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tag_NAME {

	public static void main(String[] args) {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		List<WebElement> Inputs_Tags = driver.findElements(By.tagName("a"));
		System.out.println(Inputs_Tags.size());
		for (int i = 0; i < Inputs_Tags.size(); i++) {
			String str =Inputs_Tags.get(i).getText();
			System.out.println(str);
			
		}

	}

}
