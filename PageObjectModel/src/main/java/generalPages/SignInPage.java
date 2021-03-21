package generalPages;

import org.openqa.selenium.By;


import base.BasePage;

public class SignInPage extends BasePage {

	
//	WebDriver driver;
	
//	//Create a Constructor so the driver reference can be passed to the elements/methods in this page
//	public SignInPage(WebDriver driver) {
//		this.driver = driver;
//	}
	
	By usernameField = By.xpath("//input[@id='login_id']");
	By nextButton = By.xpath("//span[contains(text(),'Next')]");
	By passwordField = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("(//button//span[text()='Sign in'])");
	
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
		
	}
	
	public void clickNext_Login() {
		driver.findElement(nextButton).click();
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
		
	}
	
	public void clickSignIn_Login() {
		driver.findElement(signInButton).click();
	}
	
	public AppPage doLogin(String username, String password) {
		enterUsername(username);
		clickNext_Login();
		enterPassword(password);
		clickSignIn_Login();
		
		return new AppPage();
	}
	
	
	
	
	
	
	
	
	
	
}
