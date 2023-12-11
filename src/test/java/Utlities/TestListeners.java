package Utlities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;

public class TestListeners extends BaseClass implements ITestListener {

	public static ExtentTest test;
	public static String Scpath;
	
	ExtentReports extent = Utlities.CommonMethods.extentReport();
	
	

	public void onTestStart(ITestResult result) {
 test = extent.startTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, "test passed sucessfully");
		
	}

	public void onTestFailure(ITestResult result) {
		
		test.log(LogStatus.FAIL, "testcase failed");

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "test case failed is" + result.getName());
			test.log(LogStatus.FAIL, "test case failed is" + result.getThrowable());

			try {
				Scpath = CommonMethods.takeScreenShot(driver, result.getName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		test.log(LogStatus.FAIL, test.addScreenCapture(Scpath));

		}
		
	

	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
	
		extent.flush();
	}

}
