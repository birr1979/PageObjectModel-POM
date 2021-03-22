package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import crmPages.CRMTopMenu;

public class BasePage {
	// super class for all pages

	public static WebDriver driver;
	public static CRMTopMenu menu;
	public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>(); //to make the browser driver thread safe.
	
	public static WebDriver getDriver() {
		return dr.get(); //creating multi threading for parallel testing 
	}
	
	public static void setDriver(WebDriver driver) {
		 dr.set(driver); //creating multi threading for parallel testing 
	}
	
	public static void openBrowser(String browserName) {
	
		if (browserName.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "\\src\\test\\resources\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.chrome.driver", "\\src\\test\\resources\\Executables\\chromedriver.exe");
				driver = new FirefoxDriver();
		}
		
		
			setDriver(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			menu = new CRMTopMenu(driver);
		}
	}


