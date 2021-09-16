package basic_learning_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PipeLine {
	public static WebDriver driver;
	private WebDriver button;


@Test
public void pipelinecreated() {
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Testng_sel_project\\chdriver\\chromedriver.exe");
	driver.findElement(By.xpath("//span[contains(text(),'Sales Teams')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'My Pipeline')]")).click();
	driver.findElement(By.xpath("//div/div/div/button[2]/div/div/div/button[1]")).click();
	driver.findElement(By.className("o_dropdown_button")).click();
	
}

}
