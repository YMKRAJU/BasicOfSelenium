package com.Java_Programmes.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		String path = "C:\\Selenium3\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.1/components/dropdowns/#split-button");
		Select sel_Dp= new Select(driver.findElement(By.xpath("//button[text()='Primary' and @class='btn btn-primary dropdown-toggle']")));
		sel_Dp.selectByVisibleText("Separated link");
	}

}
