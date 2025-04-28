package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	public void handlingdropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement javadrop = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	    //javadrop.click();
	    Select select = new Select(javadrop);
	    //select.selectByIndex(2);// select based on the index value starting from 0
	    //select.selectByVisibleText("SQL");
	    select.selectByValue("c#");
	    
	    
	}
	

	public static void main(String[] args) 
	{
		
		HandlingDropdown dropdown = new HandlingDropdown();
		dropdown.initializebrowser();
		dropdown.handlingdropdown();
		//dropdown.closeandquite();
		
	}

}
