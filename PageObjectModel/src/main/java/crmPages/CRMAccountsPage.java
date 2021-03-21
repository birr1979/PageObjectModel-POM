package crmPages;

import org.openqa.selenium.By;


import base.BasePage;

public class CRMAccountsPage extends BasePage {
	
//	WebDriver driver;
//	
//	public CRMAccountsPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public CreateAccountPage goToCreateAccount() {
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		
		return new CreateAccountPage();
	}

}
