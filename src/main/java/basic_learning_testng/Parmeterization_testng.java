package basic_learning_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parmeterization_testng {

	public static WebDriver driver;
	
	@Test
	@Parameters({"Browser","url","emailid","password"})
	public void Rediff(String Browser,String url,String emailid,String password) {
		if(Browser.equals("Chrome")) {
		driver=new ChromeDriver();
		}
		else if(Browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(emailid);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		
	}
}
