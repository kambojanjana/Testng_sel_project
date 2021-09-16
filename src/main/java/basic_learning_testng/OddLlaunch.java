package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OddLlaunch {
	public static WebDriver driver;
	private WebDriver button;

	@Test(priority = 1, enabled = true)
	@Parameters({ "url", "navLink", "email", "password" })
	public void odooLogin(String url, String navLink, String email, String password) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Testng_sel_project\\chdriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className(navLink)).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2, enabled = true)
	@Parameters({ "loginXpath", "connectXpath", "crmId" })
	public void selectOdooCrm(String loginXpath, String connectXpath, String crmId) {

		driver.findElement(By.xpath(loginXpath)).click();
		driver.findElement(By.xpath(connectXpath)).click();
		driver.findElement(By.id(crmId)).click();
	}

	@Test(priority = 3, enabled = true)
	public void SalesPage() throws InterruptedException {
//Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[data-menu-xmlid='crm.crm_menu_config']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sales Teams')]")).click();
		driver.findElement(By.xpath("//div/div/div/button[3]")).click();
		driver.findElement(By.name("name")).sendKeys("100 Dell");
		driver.findElement(By.className("custom-control-label")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// driver.findElement(By.id("o_field_input_742")).click();
		// driver.findElement(By.xpath("//input[@id='o_field_input_742']")).sendKeys("anju");
		// driver.findElement(By.name("alias_name")).sendKeys("kamboj");
		// driver.findElement(By.id("o_field_input_753")).click();
	}

	@Test(priority = 4, enabled = true)
	public void SalesPageCreated() throws InterruptedException {

		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div/div/input")).click();
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")).click();
		driver.findElement(By.name("alias_name")).sendKeys("kamboj0071");
		driver.findElement(By.className("o_form_button_save")).click();

		driver.findElement(By.xpath("div/div/div/div[2]/div/div/div/div[2]/button[1]")).click();

		// driver.findElement(By.xpath("//input[@id='o_field_input_742']")).sendKeys("anjana");
		// driver.findElement(By.name("alias_name")).sendKeys("kamboj");
		// driver.findElement(By.id("o_field_input_753")).click();

	}

}
