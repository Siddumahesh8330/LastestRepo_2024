package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement pswd;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void UserEmail(String EmailValue) {
		email.clear();

		email.sendKeys(EmailValue);
	}

	public void UserPassword(String EmailValue) {
		pswd.clear();
		pswd.sendKeys(EmailValue);
	}
	public void ClickonLoginBtn() {
		loginbtn.click();
	}

}
