package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BudgetSelectionPage extends BasePage {
	WebDriver driver;
	//Constructors
	public BudgetSelectionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	@FindBy(xpath="//input[@value='60000-1L']")WebElement SelectRadio;
	@FindBy(xpath="//button[@type='submit']")WebElement NextBtn;
	
	//Action Methods
	
	public void ClickSelectRadio() {
		SelectRadio.click();
	}

	public void ClickNextBtn() {
		NextBtn.click();
	}
}
