package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void handlingWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Hello");
		message.clear();
		WebElement showbutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showbutton.click();
		WebElement messagedisplay = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(messagedisplay.getText());
		WebElement checktag = driver.findElement(By.xpath("//input[@id='value-a']"));
		System.out.println(checktag.getTagName());
		System.out.println(showbutton.getCssValue("background-color"));
		
	}

	public static void main(String[] args) 
	{
		
		WebElementCommands commands = new WebElementCommands();
		commands.initializebrowser();
		commands.handlingWebElementCommands();
		//commands.closeandquite();
	}

}
