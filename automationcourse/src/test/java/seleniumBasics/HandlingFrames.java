package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void handlingframes()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		int totalframes = iframe.size();
		System.out.println(totalframes);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		WebElement head = driver.findElement(By.id("sampleHeading"));
		System.out.println(head.getText());
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		
		HandlingFrames frame = new HandlingFrames();
		frame.initializebrowser();
		frame.handlingframes();
		//frame.closeandquite();
		
		
	}

}
