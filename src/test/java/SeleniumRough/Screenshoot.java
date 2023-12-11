package SeleniumRough;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Screenshoot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/exceptions-in-selenium-webdriver");
		
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.className("bstack-mm-btn bstack-mm-btn-products"));
		
		
		JavascriptExecutor exe =( JavascriptExecutor)driver;
		
//		exe.executeScript(document.getElementsByClassName("bstack-mm-btn bstack-mm-btn-products"), click)
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(e));
//		e.click();
//Alert a=driver.switchTo().alert();
//a.

	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		takeSnapShot(driver, "C:\\Users\\manasa\\eclipse-workspace\\SeleniumPractice\\screenshoot\\ss.png");
//		 TakesScreenshot sc=( TakesScreenshot(driver));
//		File f= sc.getScreenshotAs(OutputType.FILE);
//		File x= new File("C:\\Users\\manasa\\eclipse-workspace\\SeleniumPractice\\screenshoot\\browserstack.jpj");
//		com.google.common.io.Files.copy(f, x);

	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		Files.copy(SrcFile, DestFile);
		
	//	ArrayList< String> st = new ArrayList<String>();
	
		
		
		
		
		

	}

}
