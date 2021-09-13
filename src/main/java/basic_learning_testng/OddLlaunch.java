package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OddLlaunch {
	public static WebDriver driver;

	@Test(priority = 1,enabled = true)
	@Parameters({"url", "navLink", "email", "password"})
	public void odooLogin(String url, String navLink, String email, String password) {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\workspace\\selenium-chrome\\chdriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className(navLink)).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2,enabled = true)
	@Parameters({"loginXpath", "connectXpath","crmId"})
	public void selectOdooCrm(String loginXpath,String connectXpath , String crmId) {

		driver.findElement(By.xpath(loginXpath)).click();
		driver.findElement(By.xpath(connectXpath)).click();
		driver.findElement(By.id(crmId)).click();
	}
}
