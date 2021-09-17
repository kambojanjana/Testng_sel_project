package basic_learning_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PipeLine {
	WebDriver driver = InitializeDriver.getDriver();

	@Test
	@Parameters({ "pipelineCreateButton", "organizationText", "organizationDropdown", 
			"expectedRevenueAmountId", "expectedRevenueAmount","pipelineAdd" })
	public void pipelineCreated(String pipelineCreateButton, String organizationText, String organizationDropdown,
			 String expectedRevenueAmountId, String expectedRevenueAmount,String pipelineAdd) {

		driver.findElement(By.xpath(pipelineCreateButton)).click();
		driver.findElement(By.xpath(organizationText)).click();
		driver.findElement(By.className(organizationDropdown)).click();
		driver.findElement(By.id(expectedRevenueAmountId)).clear();
		driver.findElement(By.id(expectedRevenueAmountId)).sendKeys(expectedRevenueAmount);
		driver.findElement(By.xpath(pipelineAdd)).click();
		//driver.findElement(By.xpath(" div/div/div[2]/span")).click();
		

	}

}
