package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseSteps {
	
	@Test (dataProvider = "sendData")
	public void createLead(String Company, String firstName, String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider
	public String[][] sendData() {
		String[][] data = new String[2][3];
		
		data[0][0] = "TestLeaf";
		data[0][1] ="Hari";
		data[0][2] ="R";
		
		data[1][0] = "TestLeaf";
		data[1][1] ="Babu";
		data[1][2] ="M";
		
		return data;
		
	}
}
