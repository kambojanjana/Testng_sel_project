package basic_learning_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PipeStages {
	WebDriver driver = InitializeDriver.getDriver();

	@Test
	public void pipeStagesCreated() {
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
}
