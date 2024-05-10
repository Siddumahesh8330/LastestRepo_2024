package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	WebDriver driver;

	public void LaunchBrowser(String Browser, String Url) {

		if (Browser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		else if (Browser.equalsIgnoreCase("FireFox"))
			driver = new FirefoxDriver();
		else if (Browser.equals("Chrome"))
			driver = new ChromeDriver();
		else
			System.out.println("Please valid driver");
		if (Url!= "")
			driver.get(Url);
		else
			driver.get("about:blank");
	}

	public WebDriver GetBrowser() {
		return driver;
	}

	public void Close() {
		driver.close();
	}

	public void Quite() {
		driver.quit();
	}
}
