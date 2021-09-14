package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OddLlaunch2 {
	public static WebDriver driver;
	
	@Test(priority = 1,enabled = true)
	//@Parameters({"url", "navLink", "email", "password"})
	public void odooLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\workspace\\selenium-chrome\\chdriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.odoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className("nav-link")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).sendKeys("kamboj.anjana2017@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9050020229rA!");
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	//@Test(priority = 2,enabled = true)
	//@Parameters({"loginXpath", "connectXpath","crmId"})
	public void selectOdooCrm() {

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.id("")).click();
		//driver.findElement(By.xpath()).click();
	}
}
