package com;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\workspace\\selenium-chrome\\chdriver\\chromedriver.exe");
		
		ChromeDriver ch = new ChromeDriver();
		ch.navigate().to("https://www.google.com/");
		
		String title=ch.getTitle();
		System.out.println(title);

	}

}
