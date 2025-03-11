package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AdditionalInfoPage;
import pages.BudgetSelectionPage;
import pages.FinalRegisterPage;
import pages.FindProfessionalPage;
import pages.LocationSelectionPage;
import pages.ProjectStartPage;
import pages.SignUpPage;
import pages.TypeOfBusinessPage;
import pages.TypeofDevelopmentPage;
import pages.TypeofProjectPage;
import pages.hiringDecisionPage;
import pages.platformSelectionPage;

public class TC_001_SignUpPage {
	public WebDriver driver;
	
	@BeforeClass
	public void setUP() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://satishpawale.shop/Neha/Synt/login.php");
		driver.manage().window().maximize();	
	}
	
	@Test(priority=1)
	public void Verify_SignUp() throws InterruptedException {
		SignUpPage sp = new SignUpPage(driver);
		sp.ClickonSignUP();
		Thread.sleep(4000);
		sp.ClickonLoginAsClient();
		
	}
	
	@Test(priority=2)
	public void Verify_ProfessionalPage() throws InterruptedException {
		
		FindProfessionalPage FP  = new FindProfessionalPage(driver);
		Thread.sleep(4000);
		FP.selectingProfession();
		
		FP.ClickNectBtn();
		
	}
	
	@Test(priority=3)
	public void Verify_TypesofProject() throws InterruptedException {
		
		TypeofProjectPage TP  = new TypeofProjectPage(driver);
		Thread.sleep(5000);
		TP.SelectRdio();
		
		TP.ClickNext();
		
	}
	

	@Test(priority=4)
	public void Verify_TypeDev() throws InterruptedException {
		
		TypeofDevelopmentPage TD  = new TypeofDevelopmentPage(driver);
		Thread.sleep(4000);
		TD.selectRadio();

		TD.ClickNextbtn();
		
	}
	
	@Test(priority=5)
	public void Verify_PlatformSelection() throws InterruptedException {
		
		platformSelectionPage PS  = new platformSelectionPage(driver);
		Thread.sleep(4000);
		PS.ClickRadioBtn();
		PS.ClickNextbtn();
		
	}
	@Test(priority=6)
	public void Verify_TypeofBusiness() throws InterruptedException {
		
		TypeOfBusinessPage TBP  = new TypeOfBusinessPage(driver);
		Thread.sleep(4000);
		TBP.SelectRadio();
		Thread.sleep(1000);
		TBP.ClickNext();
		
	}
	@Test(priority=7)
	public void Verify_ProjectSelection() throws InterruptedException {
		
		ProjectStartPage PS  = new ProjectStartPage(driver);
		Thread.sleep(4000);
		PS.SelectRadio();
		
		PS.NextBtn();
		
	}
	
	
	@Test(priority=8)
	public void Verify_HiringDecisionPage() throws InterruptedException {
		
		hiringDecisionPage HDP  = new hiringDecisionPage(driver);
		Thread.sleep(4000);
		HDP.ClickRadioBtn();
		
		HDP.ClickNextBtn();
		
	}
	
	@Test(priority=9)
	public void Verify_BudgetSelectionPage() throws InterruptedException {
		
		BudgetSelectionPage BSP = new BudgetSelectionPage(driver);
		Thread.sleep(5000);
		BSP.ClickSelectRadio();
		
		BSP.ClickNextBtn();
		
	}
	
	@Test(priority=10)
	public void Verify_LoactionPage() throws InterruptedException {
		
		LocationSelectionPage LSP = new LocationSelectionPage(driver);
		Thread.sleep(5000);
		LSP.EnetrLoaction(); 
		
		LSP.ClickNext();
		
	}
	
	@Test(priority=11)
	public void Verify_BusinessDetails() throws InterruptedException {
		
		AdditionalInfoPage AIP = new AdditionalInfoPage(driver);
		AIP.EnetrDetails();
		Thread.sleep(5000);
		AIP.ClickNextBtn();
		
	}
	@Test(priority=12)
	public void Verify_RegisterDetails() throws InterruptedException {
	    FinalRegisterPage FRP = new FinalRegisterPage(driver);
	    
	    FRP.EnterName();
	    Thread.sleep(2000);

	    FRP.EnterEmail();
	    Thread.sleep(2000);
	    
	    FRP.EnterMobile();
	    Thread.sleep(2000);
	    
	    FRP.EnterPincode();
	    Thread.sleep(2000);
	    
	    FRP.EnterPassword();
	    Thread.sleep(2000);

	    
	    FRP.FileUpload();
	    
	    Thread.sleep(3000);
	    FRP.FinalSubmit();
	    
	}

	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

	
	

}
