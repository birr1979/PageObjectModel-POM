package generalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;
import crmPages.CRMHomePage;

public class AppPage extends BasePage {
	
//	WebDriver driver;
	
//	//Create a Constructor so the driver reference can be passed to the elements/methods in this page
//	public AppPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	WebElement booksLink = driver.findElement(By.xpath("//div[contains(text(),'Books')]"));
	WebElement calendarLink = driver.findElement(By.xpath("//div[contains(text(),'Calendar')]"));
	WebElement crmLink = driver.findElement(By.xpath("//div[contains(text(),'CRM')]"));
	
	public void goToBooks() {
		booksLink.click();
	}
	
	public void goToCalendar() {
		calendarLink.click();
	}
	
	public CRMHomePage goToCRM() {
		crmLink.click();
		
		return new CRMHomePage();
	}
	
	
	
	
	
	
	
	
	
	

}
