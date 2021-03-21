package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import crmPages.CRMTopMenu;

public class BasePage {
	// super class for all pages

	public static WebDriver driver;
	public static CRMTopMenu menu;

	public BasePage() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

			driver.get("http://zoho.com");

			menu = new CRMTopMenu(driver);
		}
	}

}
