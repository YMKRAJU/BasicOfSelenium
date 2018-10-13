package com.Java_Programmes.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium3\\Drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
    	driver.navigate().to("http://www.google.com");
    	String tittle = driver.getTitle();
    	System.out.println(tittle);
    	boolean b1 = driver.findElement(By.xpath("//input[@name='btnK']")).isDisplayed();
    	boolean b2 = driver.findElement(By.xpath("//input[@name='btnK']")).isEnabled();
    	System.out.println(b1);
    	System.out.println(b2);
    	driver.close(); 	
    }
}
