package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZOhoAppPage {

	WebDriver driver;
	public ZOhoAppPage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="")
	public WebElement booksElement;
	

	@FindBy(xpath="")
	public WebElement calendarElement;


	@FindBy(xpath="")
	public WebElement CRM;
	
	
	
	//methods to return webelement
	public WebElement gotoBooks() {
		return booksElement;
	}
	
	public WebElement gotoCalendar() {
		return calendarElement;
	}
	

	public WebElement gotoCRM() {
		return CRM;
	}
	
	
	
}
