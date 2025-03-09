package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {
	
	WebDriver driver;
	
	
	public WebDriver LaunchBrowser() throws Exception {
		
		driver = new ChromeDriver();
		 driver.get("https://demoqa.com/books");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 return driver;
		
	}
	
	
	

}
