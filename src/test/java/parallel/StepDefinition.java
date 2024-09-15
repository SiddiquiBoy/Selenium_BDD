package parallel;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import utility.Driverfactory;


public class StepDefinition {
	
	LoginPage loginPage=new LoginPage(Driverfactory.getDriver());
	@Given("User launch url {string}")
	public void user_launch_url(String string) {
		Driverfactory.getDriver().get(string);
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
		loginPage.getUsername().sendKeys(string);
	}

	@When("User enter password {string}")
	public void user_enter_password(String string) {
		loginPage.getPassword().sendKeys(string);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginPage.getloginBtn().click();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		Assert.assertEquals(Driverfactory.getDriver().getCurrentUrl().toString(), "https://practicetestautomation.com/logged-in-successfully/");
	}
}
