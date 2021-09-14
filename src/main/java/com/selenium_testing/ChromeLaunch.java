package com.selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\work\\workspace\\selenium_testing\\chrome_file\\chromedriver.exe");

		ChromeDriver chromedriver = new ChromeDriver();
		chromedriver.navigate().to("https://www.fb.com/");
		chromedriver.findElement(By.id("email")).sendKeys("rakeshkamboj26@gmail.com");

		//chromedriver.findElement(By.id("pass")).sendKeys("!");
		//chromedriver.findElement(By.name("login")).click();

		String s = chromedriver.getTitle();
		System.out.println(s);

		Dimension dim = chromedriver.findElement(By.id("email")).getSize();
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("width ="+ width);
		System.out.println("height ="+ height);
		Point point = chromedriver.findElement(By.id("email")).getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println(" x ="+ x);
		System.out.println(" y ="+ y);

	}
}
