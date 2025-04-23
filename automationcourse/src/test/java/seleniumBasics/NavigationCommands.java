package seleniumBasics;

public class NavigationCommands extends Base {
	
	public void verifynavigationcommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	

	public static void main(String[] args) {
		
		NavigationCommands commands = new NavigationCommands();
		commands.initializebrowser();
		commands.verifynavigationcommands();
		//commands.closeandquite();
		

	}

}
