package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeofProjectPage extends BasePage{
	public WebDriver driver;
	
	//Constructor
	public  TypeofProjectPage(WebDriver driver) {
		super (driver);
	}
	
	//locator
	@FindBy(xpath="//input[@value='Application - social media']") WebElement ClickRadio;
	@FindBy(xpath="//button[@type='submit']") WebElement NextBtn;
	
	//action methods
	
	public void SelectRdio() {
		ClickRadio.click();
		
	}
	public void ClickNext() {
		NextBtn.click();
		
	}

}
