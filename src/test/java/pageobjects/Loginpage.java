package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utlities.CommonMethods;

public class Loginpage extends CommonMethods {

	public WebDriver driver;
	

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement expectedText;

	public void login(String UserName, String Password) {
		username.sendKeys(UserName);
		password.sendKeys(Password);

		loginButton.click();
//		String Expectedt = expectedText.getText();
//		AsseerEqual(Expectedt, "Dashboard");
	}
}