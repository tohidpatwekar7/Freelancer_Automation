package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationSelectionPage extends BasePage{
	WebDriver driver;

	public LocationSelectionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Loactors
	
	@FindBy(xpath="//input[@id='location']")WebElement Loactionselect;
	@FindBy(xpath="//button[@type='submit']")WebElement NextBtn;
	
	//Action Methods
	
	public void EnetrLoaction() {
		Loactionselect.sendKeys("Mumbai");
	}
	public void ClickNext() {
		NextBtn.click();
		
	}
}
