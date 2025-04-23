package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver; // ref, Webdriver is a pre-defined interface.Declares a public instance variable named driver of type WebDriver.

	public void initializebrowser() {
		driver = new ChromeDriver();// Creates an object of ChromeDriver, which opens the Chrome browser.
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	
	public void closeandquite()
	{
		driver.close();// close only one window
		//driver.quit(); // close more than one windows or browsers
	}

	public static void main(String[] args) {

		Base base = new Base();
		base.initializebrowser();
		base.closeandquite();

	}

}
