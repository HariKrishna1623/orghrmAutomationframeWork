package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utlities.CommonMethods;
import pageobjects.AboutPage;
import pageobjects.AdminJobPage;
import pageobjects.AdminPage;
import pageobjects.Loginpage;
import pageobjects.UserTab;

public class BaseClass {
	public static String browser;
	public static WebDriver driver;
	public static Loginpage lp;
	public static UserTab ut;
	public static AboutPage abt;
	public static AdminPage adminpg;
	public static AdminJobPage adminJb;

	public static CommonMethods util;
	// public static Loginpage logg;

	@BeforeTest

	public static void LaunchBrowser() throws IOException {
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\manasa\\eclipse-workspace\\SeleniumPractice\\Properties\\browser.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("browser"));

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		} else if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser") == "internetExplorer") {
			driver = new InternetExplorerDriver();
		}
		initClass();

	}

	public static void initClass() {
		lp = PageFactory.initElements(driver, Loginpage.class);
		ut = PageFactory.initElements(driver, UserTab.class);
		abt = PageFactory.initElements(driver, AboutPage.class);
		util = PageFactory.initElements(driver, CommonMethods.class);
		adminpg = PageFactory.initElements(driver, AdminPage.class);
		adminJb = PageFactory.initElements(driver, AdminJobPage.class);
	}

	@AfterTest
	public static void closeBrowser() {

		// util.assertAll();
		// extent.flush();
		driver.close();

	}

}