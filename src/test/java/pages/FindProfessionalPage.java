package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FindProfessionalPage extends BasePage {
	WebDriver driver;
	
	//constructor
	public FindProfessionalPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//select[@name='service']") WebElement selectlnk;
	
	@FindBy(xpath="//button[@name='search']") WebElement Nextbtn;
	
	//Action Methods
	
	public void selectingProfession() {
		Select drpdown= new Select(selectlnk);
		drpdown.selectByVisibleText("Mobile Software Development");
		
	}
	 
	
	public void ClickNectBtn() {
		Nextbtn.click();
		
	}
	
	

}
