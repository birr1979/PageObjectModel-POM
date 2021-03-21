package crmPages;

import org.openqa.selenium.By;


import base.BasePage;

public class CreateAccountPage extends BasePage {
	
//	WebDriver driver;
//	
//	public CreateAccountPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public void createAccount(String accountName) {
		
		//Enter the Account Name
		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(accountName);
	}

}
