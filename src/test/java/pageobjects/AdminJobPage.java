package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utlities.CommonMethods;

public class AdminJobPage extends CommonMethods {

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//ul//li[1]")
	WebElement adiminTab;

	//span[normalize-space()='Job']
	// clicking on job tab froom headder
	@FindBy(xpath = "//span[normalize-space()='Job']")
	WebElement AdminJoBTab;

	// click ing on job titles //a[text()='Job Titles']

	@FindBy(xpath = "//a[text()='Job Titles']")
	WebElement jobTitlesTab;

	// h6[text()='Job Titles'] verifying job page title
	@FindBy(xpath = "//h6[text()='Job Titles']")
	WebElement jobTitlesTabTitle;

	// add button //*[@id="app"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i")
	WebElement addButton;

	// job title //div[@class='orangehrm-card-container']//input[@class='oxd-input
	// oxd-input--active']

	@FindBy(xpath = "//div[@class='orangehrm-card-container']//input[@class='oxd-input oxd-input--active']")
	WebElement jobTitle;

	// job description //textarea[@placeholder='Type description here']

	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	WebElement jobDescription;

	// note //textarea[@placeholder='Add note']

	@FindBy(xpath = "//textarea[@placeholder='Add note']")
	WebElement note;

	// savebutton //button[@type='submit']

	@FindBy(xpath = "//button[@type='submit'] ")
	WebElement submitButton;
	
	
	public void addingJobRole() throws InterruptedException {
		
		adiminTab.click();
		
		waitElementToBeVisable(AdminJoBTab);
		AdminJoBTab.click();
		
		
		jobTitlesTab.click();
		
		addButton.click();
		
		jobTitle.sendKeys("Analyst");
		
		jobDescription.sendKeys("ntg");
	
		note.sendKeys("ntg");
		 Thread.sleep(5000);
		submitButton.click();
		
	}

}
