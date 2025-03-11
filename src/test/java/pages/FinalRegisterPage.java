package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalRegisterPage extends BasePage {
    WebDriver driver;

    public FinalRegisterPage(WebDriver driver) {
        super(driver);
    }
    
    // Locators
    @FindBy(name="name") WebElement Name;
    @FindBy(id="email") WebElement Email;
    @FindBy(xpath="//input[@id='mobile']") WebElement Mobile;
    @FindBy(xpath="//input[@id='pincode']") WebElement Pincode;
    @FindBy(xpath="//input[@id='password']") WebElement Password;
    @FindBy(xpath="//input[@id='profile-image']") WebElement fileInput;
    @FindBy(xpath="//button[@type='submit']") WebElement Submit;

    // Methods to enter details
    public void EnterName() {
        Name.sendKeys("Nirgun");
    }

    public void EnterEmail() {
        Email.sendKeys("Nirgun@gmail.com");
    }

    public void EnterMobile() {
        Mobile.sendKeys("9172048584");
    }

    public void EnterPincode() {
        Pincode.sendKeys("917200");
    }

    public void EnterPassword() {
        Password.sendKeys("Tohid@3456");
    }

   
    public void FileUpload() {
        fileInput.sendKeys("E:\\\\New folder (2)\\\\simulation.jpg");
    }
    public void FinalSubmit() {
    	Submit.click();
    }
}
