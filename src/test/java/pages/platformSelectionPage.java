package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class platformSelectionPage extends BasePage {
	WebDriver driver;
	
	
	//Constructor
	public platformSelectionPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	@FindBy(xpath="//input[@value='iOS']")WebElement selectradio;
	
	@FindBy(xpath="//button[@type='submit']")WebElement NextBtn;
	
	//ActionMethods
	
	public void ClickRadioBtn() {
		selectradio.click();
	}
	public void ClickNextbtn() {
		NextBtn.click();
	}
	

}
