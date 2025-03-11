package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeOfBusinessPage extends BasePage{
	WebDriver driver;
	
	//Constructor
	public TypeOfBusinessPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locator
	@FindBy(xpath="//label[normalize-space()='Extra large business (100 or more employees)']")WebElement SelectRdio;
	@FindBy(xpath="//button[@type='submit']")WebElement SelectNext;
	
	//Action methods
	
	public void SelectRadio() {
		SelectRdio.click();
	}
	public void ClickNext() {
		SelectNext.click();
	}

}
