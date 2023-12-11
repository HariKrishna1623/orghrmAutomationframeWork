package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utlities.CommonMethods;

public class AdminPage extends CommonMethods {

	// click on admin from left navigation panel
	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//ul//li[1]")
	WebElement adiminTab;

	// click on add user button
	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement AddButton;

	// verifying add user text
	@FindBy(xpath = "//h6[text()='Add User']")
	WebElement addusertext;
//_--------------------------------------------------------------------------------------------------------------------------------------------------------------
	// userRole drop down
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")
	WebElement userRoleDropDown;

	// sending dropdown value // x path for drop down panel
	// //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]

	@FindBy(xpath = "//div[@role='option'][2]")
	WebElement userRoleDropDownValue;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// employee name text box
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employNameTextBox;

	// status drop down
	// //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")
	WebElement statusDropdown;

////div[@role='listbox']//div[@role='option'][2]

	@FindBy(xpath = "//div[@role='listbox']//div[@role='option'][2]")
	WebElement statusDropdownValues;

	// user name text box
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters'][4]//input")
	WebElement userNameTextBox;

	// click on user first name
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]")
	WebElement EmpNameFirstname;

	// password text box
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input[@type='password']")
	WebElement EnterPassword;

	// confirm password
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@type='password']")
	WebElement ConfirmPassword;

	// save button

	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;

	public void addEmployee(String EmpName, String userName, String password, String confirmPass)
			throws InterruptedException {

		waitElementToBeClickable(adiminTab);
		adiminTab.click();
		
		

		waitElementToBeClickable(AddButton);
		AddButton.click();
		
		

		waitElementToBeVisable(userRoleDropDown);
		userRoleDropDown.click();
		
		

		waitElementToBeVisable(userRoleDropDownValue);
		userRoleDropDownValue.click();
		
		

		waitElementToBeVisable(statusDropdown);
		statusDropdown.click();
		
		

	
		
		

		statusDropdownValues.click();
		
		

		employNameTextBox.sendKeys(EmpName);
		
		Thread.sleep(50000);
        waitElementToBeClickable(EmpNameFirstname);
        EmpNameFirstname.click();
        
        

		
		userNameTextBox.sendKeys(userName);
		
		

		EnterPassword.sendKeys(password);
		
		

		
		

		ConfirmPassword.sendKeys(confirmPass);
		
		

		saveButton.click();
		
		
		
		Thread.sleep(50000);
	}

}
