package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.AdminJobPage;

public class Testcase extends BaseClass {

	@Test(dataProvider = "testdata", dataProviderClass = rough.class, enabled = false)
	public void tc1(String Uasername, String Password) throws InterruptedException {

		lp.login(Uasername, Password);

		ut.clickOnUser();
		abt.clickOnAbout();

	}

	@Test(dataProvider = "testdata", dataProviderClass = rough.class, enabled = false)
	public void addNewUser(String Uasername, String Password) throws InterruptedException {

		lp.login(Uasername, Password);
		adminpg.addEmployee("C", "krishna hari", "Krishna1234", "Krishna1234");

	}

	@Test(dataProvider = "testdata", dataProviderClass = rough.class)
	public void addNewJobRole(String Uasername, String Password) throws InterruptedException {

		lp.login(Uasername, Password);
		adminJb.addingJobRole();

	}
}
