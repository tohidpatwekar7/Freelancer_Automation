package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hiringDecisionPage extends BasePage{
	WebDriver driver;
	
	//Constructor
	public hiringDecisionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	@FindBy(xpath="//label[normalize-space()='I will possibly hire someone']") WebElement RadioBtn;
	@FindBy(xpath="//button[@type='submit']") WebElement NextBtn;
	
	//Action Methods
	
	public void ClickRadioBtn() {
		RadioBtn.click();
		
	}
	public void ClickNextBtn() {
		NextBtn.click();
	}

}
