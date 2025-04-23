package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
	
	public void handlinglocator()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.cssSelector("button[id='button-two']"));
		//CSS selector TagName[attribute='Value']
		
		// relative xpath : //tagname[@attribute='value'];
		
		
		//Absolute xpath : /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
		
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-two']"));
		
		driver.findElement(By.xpath("//label[text()='Enter Message']"));// here use text instead of attribute
	    driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
	    driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));// 'and' operator check the both condition
	    driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));// either one is true
	    // //tagname[@attribute=’value’]//axesMethodName::tagname
	    // //div[contains(text(),'Single Input Field')]//parent::div[@class='card'] : Parent
	    
	    driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
	    driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));//following the spacified
	    driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));// preceding id that the specified
	    driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));// Ancestor
	    driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	
	}
	
	

	public static void main(String[] args) {
		
		HandlingLocators locator = new HandlingLocators();
		locator.initializebrowser();
		locator.handlinglocator();
		locator.closeandquite();

	}

}
