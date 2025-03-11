package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectStartPage extends BasePage{
	WebDriver driver;

	//Constructor
	public ProjectStartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locator
	@FindBy(xpath="//label[normalize-space()='Within a week']")WebElement SelectRadio;
	@FindBy(xpath="//button[@type='submit']")WebElement NextBtn;
	
	//Action methods
	public void SelectRadio() {
		SelectRadio.click();
	}
	public void NextBtn() {
		NextBtn.click();

}
}
