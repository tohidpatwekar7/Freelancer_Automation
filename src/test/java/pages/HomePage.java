package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	By loginButton = By.id("login");
	
	
	
	//Methods/Functions
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	

}
