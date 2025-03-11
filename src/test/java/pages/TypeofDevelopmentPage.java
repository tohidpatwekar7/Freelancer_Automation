package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TypeofDevelopmentPage extends BasePage {
	
	WebDriver driver;
	
	//constructor
	public TypeofDevelopmentPage(WebDriver driver) {
		super(driver);
	}

	
	//locators
	@FindBy(xpath="//input[@value='Changes to an app that already exists']")WebElement Radiobtn;
	@FindBy(xpath="//button[@type='submit']")WebElement ClickNext;
	
	//Action methods
	
	public void selectRadio() {
		Radiobtn.click();
	}
	
	public void ClickNextbtn() {
		ClickNext.click();
	}
}

