package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{
	
	WebDriver driver;
	
	//constructor
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	// locators
	@FindBy(xpath="//a[normalize-space()='Signup']")WebElement lnkSignUp;
	
	@FindBy(xpath="//a[@class='btn btn-custom btn-client']")WebElement lnkloginAsclient;
	
	
	
	//actionmethods
	public void ClickonSignUP() {
		lnkSignUp.click();
		
	}
	public void ClickonLoginAsClient() {
		lnkloginAsclient.click();
		
	}
	
	
	

}
