package com.Java_Programmes.CRM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//a[@id='highlight-gift-card']")).click();
		Set<String>handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String P_win = it.next();
		System.out.println("Parent Window id is: "+P_win);
		String C_win = it.next();
		System.out.println("Child Window id is: "+C_win);		
		driver.switchTo().window(C_win);
		driver.findElement(By.xpath("//input[@placeholder='Search for a gift card']")).sendKeys("kanta2121@gmail.com");
		System.out.println("Tittle of Clid Window is: "+driver.getTitle());
		//driver.findElement(By.id("Password")).sendKeys("y@rragudi7");
		driver.close();
		System.out.println("Child Window is closed");
		driver.switchTo().window(P_win);
		System.out.println("Tittle of Clid Window is: " + driver.getTitle());
		driver.findElement(By.xpath("//span[contains(text(),'Manage Booking')]")).click();
		driver.close();
		System.out.println("Parent Window is closed");
	}

}
