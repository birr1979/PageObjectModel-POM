package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BasePage;


public class TestCase1 extends BasePage{
	public WebDriver driver;

	@Test(dataProvider="getData")
	public void LoginTest(String userName, String password, String browserName) {
		openBrowser(browserName);
		By usernameField = By.xpath("//input[@id='login_id']");
		By nextButton = By.xpath("//span[contains(text(),'Next')]");
		By passwordField = By.xpath("//input[@id='password']");
		By signInButton = By.xpath("(//button//span[text()='Sign in'])");
		getDriver().get("https://www.zoho.com/");
			getDriver().findElement(signInButton).click();
			getDriver().findElement(usernameField).sendKeys(userName);
			getDriver().findElement(nextButton).click();
						
			getDriver().findElement(passwordField).sendKeys(password);
			
			
	
		
		
		
		
	}
	
	@DataProvider (parallel=false)
	public Object[][] getData(){
		Object [][] data =new Object [2][3];
		data [0][0] = "selenuim.pcs@gmail.com";
		data [0][1] ="SeleniumTraining";
		data [0][2] ="Firefox";
		
		
		data[1][0]="pcs.selenium+yetanother@gmail.com";
		data[1][1]="";
		data[1][2]="Chrome";
		
		return data;
	
	}
	
	
	
	
	
	
	
	
}
