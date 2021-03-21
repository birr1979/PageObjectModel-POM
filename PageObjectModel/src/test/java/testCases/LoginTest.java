package testCases;

import base.BasePage;
import crmPages.CRMAccountsPage;
import crmPages.CreateAccountPage;
import generalPages.AppPage;
import generalPages.HomePage;
import generalPages.SignInPage;

public class LoginTest {

	public static void main(String[] args) {
		
		
		
		HomePage homePage = new HomePage();
		
		SignInPage signIn = homePage.goToSignIn();
		
//		SignInPage signIn = new SignInPage();
		AppPage appPage = signIn.doLogin("selenium.pcs@gmail.com", "SeleniumTraining");

//		AppPage appPage = new AppPage();
		appPage.goToCRM();
		
		CRMAccountsPage accPage = BasePage.menu.goToAccounts();
//		BasePage.menu.goToLeads();
//		BasePage.menu.goToDeals();
		
//		CRMAccountsPage accPage = new CRMAccountsPage();
		CreateAccountPage createAcc = accPage.goToCreateAccount();
		
//		CreateAccountPage createAcc = new CreateAccountPage();
		createAcc.createAccount("Jay's Account");
		
		
		/*
		 * 
		 * driver.manage().window().maximize(); <-- this is also a POM-like design pattern
		 *  --> Each method is returning an object of the class of the next method
		 *    --> driver returns WebDriver interface which contains the manage() method
		 *    --> manage() method returns the Options interface which contains the window() method
		 *    --> window() method returns the Window class which contains the maximize() method
		 *    
		 * Page Object Model design says that when a method is proceeding to a new page,
		 * that method should return an object of that page's class
		 * 
		 */
		
		
		
		
		
		
		
		
		
		

	}

}
