package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Locators
	By PageTitle = By.xpath("//h1[text()='Login']");
	By UserName = By.id("userName");
	By Password = By.id("password");
			
	By LoginButton = By.id("login");
	
	
	//Methods
	public void enterUserName(String Name) {
		
		WebElement Loginb = driver.findElement(LoginButton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", Loginb);
		
		driver.findElement(UserName).sendKeys(Name);
	}

	public void enterPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
	}

	public void clickOnLoginButton() {
		driver.findElement(LoginButton).click();
	}

	public String getPageTitle() {
		String title = driver.findElement(PageTitle).getText();
		return title;
	}
	
}
