package pom;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	WebDriver driver;

	@FindBy(id = "APjFqb")
	WebElement Google;

	@FindBy(xpath = "//h3[contains(text(),'Admin area demo')]")
	WebElement ClickOnLink;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void GoogleSearch(String Value) {
		Google.sendKeys(Value);
		Google.sendKeys(Keys.ENTER);

	}

	public void ClickLink() {
		ClickOnLink.click();
	}
}
