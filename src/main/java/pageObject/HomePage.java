package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// PART1
	@FindBy(id = "abc")
	private WebElement brandLogo;

	@FindBy(id = "va", xpath = "da")
	private WebElement schdeule_btn;

	// PART2
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// PART3
	public WebElement getBrandLogo() {
		return brandLogo;
	}

	public WebElement getSchdeuleBtn() {
		return schdeule_btn;
	}

}
