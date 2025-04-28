package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxandRadiobutton extends Base {
	
	public void handlingcheckboxandradio()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	    WebElement value = driver.findElement(By.xpath("//input[@value='option-1']"));
	    value.click();
	    System.out.println(value.isSelected());
   }
	
	public void handlingradiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
	}
	public static void main(String[] args) 
	{
		HandlingCheckboxandRadiobutton check = new HandlingCheckboxandRadiobutton();
		check.initializebrowser();
		check.handlingcheckboxandradio();
		//check.handlingradiobutton();
		//check.closeandquite();

	}

}
