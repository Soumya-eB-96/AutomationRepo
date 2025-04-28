package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyrightclick()
	{
		driver.navigate().to("https://selenium.qabible.in/");
		WebElement homeicon = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions = new Actions(driver);// driver is the reference for webdriver, driver control to the action class
		actions.contextClick(homeicon).build().perform();
		
	}
	
	public void verifymousehover()
	{
		driver.navigate().to("https://selenium.qabible.in/");
		WebElement progressmenu = driver.findElement(By.xpath("//a[@id='progress-bars']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(progressmenu).build().perform();
		
	}
	
	public void verifydraganddrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifykeyboardaction() throws Throwable
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);	
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) 
	{
		HandlingActions action = new HandlingActions();
		action.initializebrowser();
		//action.verifyrightclick();
		//action.verifymousehover();
		//action.verifydraganddrop();
		try {
			action.verifykeyboardaction();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//action.closeandquite();

	}

}
