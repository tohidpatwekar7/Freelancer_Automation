package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdditionalInfoPage extends BasePage {
	WebDriver driver;
	
	public AdditionalInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(xpath="//textarea[@placeholder='Describe your business...']")WebElement Data;
	@FindBy(xpath="//button[@name='next']")WebElement NextBtn;
	
	//Actionmethods
	
	public void EnetrDetails() throws InterruptedException {
		Thread.sleep(3000);
		Data.sendKeys("I want to create an IT Firm");
	}
	
	public void ClickNextBtn() {
		NextBtn.click();
	}

}
