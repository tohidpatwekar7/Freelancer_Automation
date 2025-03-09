package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.TestBaseClass;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class TC001 extends TestBaseClass {
	
	WebDriver driver;
	
	
	@BeforeMethod (groups = "smoke")
	public void beforeMethod() throws Exception {
		
		 driver = LaunchBrowser();
		
	}
	
	@Test(groups = "smoke")
	public void verifyLogin() throws Exception {
		
		
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
		
		String Name = dash.getUserName();
		
		Assert.assertEquals(Name, "rcTest");
	}
	
	@Test(groups = "regression")
	public void verifyLogOutFunctionality() throws InterruptedException{
		
		HomePage home=new HomePage(driver);
		home.clickOnLoginButton();
		
		Thread.sleep(5000);
		
		LoginPage login=new LoginPage(driver);
		
		//Login into the application
		
		login.enterUserName("rcTest");
		login.enterPassword("Rahul@123");
		
		login.clickOnLoginButton();
		
		Thread.sleep(5000);
		
		DashboardPage dash=new DashboardPage(driver);
		
		dash.LogOut();
		
		//Verify are we actually on Login page
		Assert.assertEquals(login.getPageTitle(), "Login");
		//driver.close();
				
	}
	
	@AfterMethod
	public void afterMethod() {
		
		driver.close();
	}

}
