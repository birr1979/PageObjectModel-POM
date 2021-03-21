package crmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CRMTopMenu {
	
	
	/*
	 * Inheritance --> 'IS A' relationship
	 * 	 - CRMAccountsPage IS A page so it extends the BasePage
	 *   - CreateAccountPage IS A page so it extends the BasePage
	 *   
	 *   CRMTopMenu IS A page?? --> it's NOT a page so it WILL NOT extend BasePage
	 *   
	 * Encapsulation --> 'HAS A' relationship
	 *   - CRMHomePage HAS A TopMenu so CRMTopMenu is encapsulated in the CRMHomePage
	 *   - CRMAccountsPage HAS A TopMenu so CRMTopMenu is encapsulated in the CRMAccountsPage
	 */
	
	WebDriver driver;
	
	public CRMTopMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public CRMAccountsPage goToAccounts() {
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		return new CRMAccountsPage();
	}
	
	public void /*CRMLeadsPage*/ goToLeads() {
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		
//		return new CRMLeadsPage();
	}
	
	public void goToContacts() {
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}
	
	public void goToDeals() {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
	}
	
	

}
