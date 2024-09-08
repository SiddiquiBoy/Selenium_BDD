package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username_fld;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_fld;
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement login_btn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username_fld;
	}

	public WebElement getPassword() {
		return password_fld;
	}

	public WebElement getloginBtn() {
		return login_btn;
	}

}
