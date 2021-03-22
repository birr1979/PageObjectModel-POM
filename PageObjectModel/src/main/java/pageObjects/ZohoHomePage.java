package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoHomePage {

	static WebDriver driver;
	public ZohoHomePage (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//body[1]/div[3]/div[2]/div[1]/a[5]")
	public WebElement signInLink;
	
	
	public WebElement goToSignIn() {
		
		return signInLink;
	}
	
	
public static void main(String[] args) {
	ZohoHomePage page=new ZohoHomePage(driver);
	page.goToSignIn();
	
}	
	//Generic Class
	

}
