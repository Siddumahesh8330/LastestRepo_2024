package test;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pom.GooglePage;
import pom.LoginPage;
import utils.Common;

public class All_TestMethods {
	Common common;
	String Browser = "Chrome";
	String Url = "https://www.google.com/";
	WebDriver driver;

	GooglePage Page;
	LoginPage Login;


	@BeforeTest
	public void BeforTest() {
		common = new Common();
		common.LaunchBrowser(Browser, Url);
		driver = common.GetBrowser();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 0)
	public void OpenGoogle() {
		Page = new GooglePage(driver);
		Page.GoogleSearch("Admin NoCommerce");
	}

	@Test(priority = 1)
	public void OpenLink() {
		Page = new GooglePage(driver);
		Page.ClickLink();
	}

	@Test(priority = 2)
	public void EnterEamil() throws Exception {
		Login = new LoginPage(driver);
		Thread.sleep(2000);
		Login.UserEmail("admin@yourstore.com");
	}

	@Test(priority = 3)
	public void ClickBtn() {
		Login = new LoginPage(driver);
		Login.ClickonLoginBtn();
	
	}
	@Test
	public void CheckTitle() {
		
		String ActualTitle = "Dashboard / nopCommerce administration";
		String ExpectedTitle = "Dashboard / nopCommerce administration";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.print(ActualTitle + ExpectedTitle);
	}


	@AfterTest
	public void AfterTest() {
		// common.Quite();
	}
}
