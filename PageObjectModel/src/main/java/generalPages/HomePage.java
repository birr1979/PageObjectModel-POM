package generalPages;

import org.openqa.selenium.By;


import base.BasePage;


public class HomePage extends BasePage {
	
//	WebDriver driver;
	
//	//Create a Constructor so the driver reference can be passed to the elements/methods in this page
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	By signInLink = By.xpath("//a[contains(text(),'Sign in')]");
	
	public void goToCustomers() {
		
	}
	
	public void goToSales() {
		
	}
	
//	public String myName(String name) {
//		
//		return name;
//	}
	
	public SignInPage goToSignIn() {
		driver.findElement(signInLink).click();
		
		return new SignInPage();
	}
	
	public void goToSignUp() {
		System.out.println("Calling the SignUP Method");
	}
	

}
