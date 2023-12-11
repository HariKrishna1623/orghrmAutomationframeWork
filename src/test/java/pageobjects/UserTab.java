package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utlities.CommonMethods;

public class UserTab extends CommonMethods {

	
	CommonMethods util= new  CommonMethods();
	
	////div[@class='oxd-topbar-header-userarea']//li//span
	
	@FindBy(xpath = "//div[@class='oxd-topbar-header-userarea']//li//span//i")
	WebElement usertab;
	////a[text()='About']
	
	
	public void clickOnUser() {
		
		util.waitElementToBeClickable(usertab);
		usertab.click();
		
		
	}
}
