package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class loginTest {
	public static WebDriver driver;
	
	public loginTest(WebDriver driver) {
		loginTest.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) {
		System.out.println("new main method");
		driver=new ChromeDriver();
		driver.get("http://google.com/");	
		
	}
	
	
	

}
