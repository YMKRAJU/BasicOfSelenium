package com.Java_Programmes.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");
		driver.findElement(By.xpath("//button[text()='Click To Open Modal']")).click();
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		String str = alt.getText();
		System.out.println("Text Message of the Alert is: "+str);
		alt.accept();

	}

}
