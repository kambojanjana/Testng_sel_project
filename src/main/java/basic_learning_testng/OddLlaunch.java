package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
	
	@Test(priority = 3,enabled = true)
	//@Parameters("val")
	//public void CustomerCre(String val) {
	public void CustomerCre() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("ul.o_menu_sections li:nth-child(1) a")).click();
		//driver.wait(5000);

		driver.findElement(By.cssSelector("a[data-menu-xmlid='crm.res_partner_menu_customer']")).click();
		driver.wait(5000);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div/div/div/button")).click();
		//driver.findElement(By.className("o-kanban-button-new")).click();
		
	
	}
	
	@Test(priority = 4,enabled = true)
	//@Parameters("val")
	//public void CustomerCre(String val) {
	public void CustomerCreq1() throws InterruptedException {
		driver.wait(10000);
		driver.findElement(By.className("o-kanban-button-new")).click();
		
		
	
	}
	
	@Test(priority = 5,enabled = true)
	//@Parameters("val")
	//public void CustomerCre(String val) {
	public void CustomerCreq11() throws InterruptedException {
		driver.wait(10000);
		driver.findElement(By.xpath("//div/div/div/button")).click();
		
		
	
	}
	//@Test(priority = 3,enabled = true)
	//@Parameters("val")
	//public void CustomerCre(String val) {
	public void CustomerSales() {
		 //driver.findElement(By.cssSelector("a[data-menu-xmlid='crm.crm_menu_sales']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(val)).click();	
		//driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
		//driver.findElement(By.className("o-kanban-button-new")).click();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div/div/div/button")).click();
		//driver.findElement(By.cssSelector("a[data-menu-xmlid='crm.crm_menu_config']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Sales Teams')]")).click();
		//driver.findElement(By.xpath("//div/div/div/button[3]")).click();
	}
	
	//@Test(priority = 4,enabled = true)
	//@Parameters("val")
	//public void CustomerCre(String val) {
	public void CustomerCre1() {
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.findElement(By.className("o-kanban-button-new")).click();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div/div/div/button")).click();
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.className("o-kanban-button-new"))).click().pause(50).click().build().perform();
		
		//WebElement element = (WebElement) By.className("o-kanban-button-new");
		//((JavascriptExecutor) driver).executeScript("return arguments[0].click();", element); 
	}
}

