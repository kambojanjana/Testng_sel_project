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

		driver.findElement(By.className(navLink)).click();

		driver.findElement(By.id("login")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@Test(priority = 2, enabled = true)
	@Parameters({ "loginXpath", "connectXpath", "crmId" })
	public void selectOdooCrm(String loginXpath, String connectXpath, String crmId) {

		driver.findElement(By.xpath(loginXpath)).click();
		driver.findElement(By.xpath(connectXpath)).click();
		driver.findElement(By.id(crmId)).click();
	}

	@Test(priority = 3, enabled = true)
	@Parameters({ "configurationMenu", "salesteam", "create" })
	public void salesPage(String configuration, String salesteam, String create) throws InterruptedException {

		//driver.findElement(By.cssSelector(configuration)).click();
		driver.findElement(By.cssSelector("a[data-menu-xmlid='crm.crm_menu_config']")).click();
		driver.findElement(By.xpath(salesteam)).click();
		driver.findElement(By.xpath(create)).click();

	}

	@Test(priority = 4, enabled = true)
	@Parameters({ "salesteamName", "salesteamNamevalue", "customControlLabel" })
	public void saleFormPart1(String salesteamName, String salesteamNamevalue, String customControlLabel) {
		driver.findElement(By.name(salesteamName)).sendKeys(salesteamNamevalue);
		driver.findElement(By.className(customControlLabel)).click();
	}

	@Test(priority = 5, enabled = true)
	@Parameters({ "teamLeadNameClick", "teamLeadNameSelect","teamLeadEmail","teamLeadNameAlias" ,"everyOne","clickOnSave"})
	public void saleFormPart2(String teamLeadNameClick,String teamLeadNameSelect,String teamLeadEmail,String teamLeadNameAlias,String everyOne,String clickOnSave) throws InterruptedException {

		driver.findElement(By.xpath(teamLeadNameClick)).click();
		driver.findElement(By.xpath(teamLeadNameSelect)).click();
		driver.findElement(By.name(teamLeadNameAlias)).sendKeys(teamLeadEmail);
		driver.findElement(By.className(everyOne)).click();
		driver.findElement(By.xpath(clickOnSave)).click();

	}

}
