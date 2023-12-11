package pageobjects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage {

	
	
	@FindBy(xpath = "//a[text()='About']")
	WebElement about;
	//div[@class='oxd-grid-2 orangehrm-about']
	
	
	@FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-about']")
	WebElement gettextinAboutPage;
	public void clickOnAbout() {
		about.click();
	String text=	gettextinAboutPage.getText();
	
	System.out.println(text);
	}
}
