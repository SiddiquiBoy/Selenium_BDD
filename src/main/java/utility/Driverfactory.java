package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	public static ThreadLocal<WebDriver> tldiver = new ThreadLocal<>();

	public static WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldiver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldiver.set(new FirefoxDriver());
		} else {
			System.out.println(browser + " is not valid");
		}
		return tldiver.get();
	}
}
