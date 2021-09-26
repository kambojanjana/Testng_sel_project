package basic_learning_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class PipeStages {
	WebDriver driver = InitializeDriver.getDriver();

	@Test(priority = 1,enabled = false)
	public void pipeLineNewStageSchedule() {
		driver.findElement(By.xpath("//div/div/div/div[3]/div[2]/div[5]/div/div[2]/a/span")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Schedule an activity')]")).click();
		// driver.findElement(By.xpath("//div/div/div/div/div/div/table/tbody/tr/td[2]/div/div[@class='o_input_dropdown']/input/a")).click();

		driver.findElement(By.xpath("//div/div/div/div/div/div/table/tbody/tr/td[2]/div/div/input")).click();

		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[2]/a")).click();

		//driver.findElement(By.xpath("//div/div/div/table[2]/tbody/tr/td[2]/div/input")).clear();
		//driver.findElement(By.xpath("//div/div/div/table[2]/tbody/tr/td[2]/div/input")).sendKeys("09/22/2021");
		
		driver.findElement(By.xpath("//div/div/table[2]/tbody/tr[2]/td[2]/div/div/input")).click();
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[4]/a")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Schedule')]")).click();
	}
	
	
	@Test(priority = 2,enabled=false)
	public void pipeStagesNewToQualified() {
		WebElement dragFrom = driver.findElement(By.xpath("//body/div/div/div[2]/div/div/div[3]"));// 1st column, 3rd div
		WebElement dropTo = driver.findElement(By.xpath("//body/div/div/div[2]/div/div[2]")); // 2nd column
		
		Actions dragAndDrop= new Actions(driver);
		dragAndDrop.clickAndHold(dragFrom).moveToElement(dropTo).release().build().perform();
	}
	@Test(priority = 3, enabled = false)
	public void pipeLineQualifiedtoPrepositionSchedule() {
		driver.findElement(By.xpath("//div/div/div[2]/div[2]/div[2]/div[5]/div/div[2]/a/span")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Schedule an activity')]")).click();
		driver.findElement(By.xpath("//div/div/div/div/div/div/table/tbody/tr/td[2]/div/div/input")).click();
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]/a")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Mark as Done')]")).click();
	
	}
	
	@Test
	public void pipeLineQualifiedtoPrepositionSchedule1() {
		WebElement dragFrom = driver.findElement(By.xpath("//body/div/div/div[2]/div/div[2]/div[2]"));// 1st column, 3rd div
		WebElement dropTo = driver.findElement(By.xpath("//body/div/div/div[2]/div/div[4]")); // 2nd column
		
		Actions dragAndDrop= new Actions(driver);
		dragAndDrop.clickAndHold(dragFrom).moveToElement(dropTo).release().build().perform();
	}
	@AfterSuite
	public void quitBrowser() {
		//driver.quit();
	}
	
}
