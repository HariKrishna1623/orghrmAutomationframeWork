package Utlities;

import java.io.File;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import base.BaseClass;

public class CommonMethods extends BaseClass {
	public static ExtentReports extent;
	public static ExtentTest test;

	SoftAssert Assert;

	public static void main(String[] args) throws Exception {
		takeScreenShot(driver, "hari");

	}

	
	public void waitElementToBeClickable(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void waitElementToBeVisable(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static String takeScreenShot(WebDriver webdriver, String testNAme) throws Exception {

		// Convert web driver object to TakeScreenshot

		String date = new SimpleDateFormat("ddmmyyhhmmss").format(new Date());

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		String destination = System.getProperty("user.dir") + "/screenshoot" + date + testNAme + "test.png";

		File DestFile = new File(destination);

		// Copy file at destination

		Files.copy(SrcFile, DestFile);

		return destination;

	}

	public void AsseerEqual(String Expected, String Actual) {

		Assert = new SoftAssert();

		Assert.assertEquals(Actual, Expected);

	}

	public void assertAll() {

		Assert.assertAll();
	}

	public static ExtentReports extentReport() {

//		File fl = new File("C:\\Users\\manasa\\eclipse-workspace\\SeleniumPractice\\Reports\\ExtentReports");
		extent = new ExtentReports(
				"C:\\Users\\manasa\\eclipse-workspace\\SeleniumPractice\\Reports\\ExtentReportResults.html");
	
		
		// test = extent.startTest("test case name");
		return extent;
	}
	
	
	
	
	
	public void selectingValuesByindex(WebElement ele ,int index ) {
		
		Select sc = new Select(ele);
		sc.deselectByIndex(index);
	}
}




