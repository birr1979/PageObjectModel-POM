package generalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;


public class HomePage extends BasePage {

	//Elements on the page

	WebElement customers= driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/a[1]"));
	WebElement sales= driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/a[4]"));
	WebElement FreeSignUp= driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/a[6]"));
	By signInLink = By.xpath("//a[contains(text(),'Sign in')]");


	//Methods to perform action

	public CustomersPage goToCustomers() {
		customers.click();
		return new CustomersPage();

	}

	public SalesPage goToSales() {
		sales.click();
		return new SalesPage();
	}


	public SignInPage goToSignIn() {
		driver.findElement(signInLink).click();
		return new SignInPage();
	}

	public SignUpPage goToSignUp() {
		FreeSignUp.click();
		return new SignUpPage();
	}


}
