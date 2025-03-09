package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	By userName = By.id("userName-value");
	By LogOutButton = By.id("submit");
	By searchBar = By.id("searchBox");
	By bookName = By.xpath("//div[@class='rt-tr -odd']//div[@class='rt-td'][2]");
	//By bookName = By.xpath("//a[text()='Git Pocket Guide']");
	
	//Methods
	
	public String getUserName() {
		String username = driver.findElement(userName).getText();
		return username;
	}
	
	public void LogOut() {
		driver.findElement(LogOutButton).click();
	}
	
	public void enterSearchValue(String searchText) {
		driver.findElement(searchBar).sendKeys(searchText);
	}
	
	public String getBookName() {
		String bookN = driver.findElement(bookName).getText();
		return bookN;
	}
	
}
