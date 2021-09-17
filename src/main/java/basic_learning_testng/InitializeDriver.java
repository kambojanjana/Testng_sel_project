package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class InitializeDriver {
	static ChromeDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Testng_sel_project\\chdriver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://www.odoo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("openBrowser: Browser is opened");
		}
		return driver;
	}
	@AfterSuite
	public void quitBrowser() {
		driver.quit();
	}

}