package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.TestBaseClass;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class TC002 extends TestBaseClass{
	
	WebDriver driver;
	
	@BeforeMethod (groups = "smoke")
	public void beforeMethod() throws Exception {
		
		 driver = LaunchBrowser();
		
	}
	
	@Test(groups = "smoke")
	public void validateSearchFunction() throws Exception {
		
		
		HomePage home=new HomePage(driver);
		home.clickOnLoginButton();
		
		Thread.sleep(5000);
		
		LoginPage login=new LoginPage(driver);
		
		//Verify are we actually on Login page
		Assert.assertEquals(login.getPageTitle(), "Login");
		
		
		//Login into the application
		login.enterUserName("rcTest");
		login.enterPassword("Rahul@123");
		
		login.clickOnLoginButton();
		
		Thread.sleep(5000);
		
		//Verify are we actually on Dashboard Page
		
		DashboardPage dash=new DashboardPage(driver);
		
		dash.enterSearchValue("speaking");
		
		String bookname = dash.getBookName();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(bookname, "Speaking JavaScript");
		
		
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		driver.close();
	}


}
