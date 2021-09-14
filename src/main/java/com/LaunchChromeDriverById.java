package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriverById {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\work\\workspace\\selenium-chrome\\chdriver\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.navigate().to("https://www.fb.com/");
		
		chromeDriver.findElement(By.id("email")).sendKeys("rakeshkamboj26@gmail.com");
		chromeDriver.findElement(By.id("pass")).sendKeys("");
		
		//chromeDriver.findElement(By.name("login")).click();
		//chromeDriver.findElement(By.id("u_0_d_2A")).click();
		chromeDriver.findElement(By.xpath("//form/div[2]/button")).click();
  
		
	}

}
