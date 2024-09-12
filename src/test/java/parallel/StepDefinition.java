package parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import utility.Driverfactory;


public class StepDefinition {
	
	WebDriver driver;
	LoginPage loginPage;
	@Before()
	public void setup()
	{
      driver=Driverfactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	@Given("User launch url {string}")
	public void user_launch_url(String string) {
		driver.get(string);
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
	    loginPage=new LoginPage(driver);
		loginPage.getUsername().sendKeys(string);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
		
	}

	@When("User enter password {string}")
	public void user_enter_password(String string) {
		loginPage.getPassword().sendKeys(string);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginPage.getloginBtn().click();
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://practicetestautomation.com/logged-in-successfully/");
	}
}
