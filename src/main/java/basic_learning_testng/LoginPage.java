package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver = InitializeDriver.getDriver();

	@Test(priority = 2, enabled = true)
	@Parameters({ "url", "navLink", "email", "password" })
	public void odooLogin(String url, String navLink, String email, String password) {
		driver.findElement(By.className(navLink)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Test(priority = 3, enabled = true)
	@Parameters({ "loginXpath", "connectXpath", "crmId" })
	public void selectOdooCrm(String loginXpath, String connectXpath, String crmId) {

		driver.findElement(By.xpath(loginXpath)).click();
		driver.findElement(By.xpath(connectXpath)).click();
		driver.findElement(By.id(crmId)).click();

	}
}
