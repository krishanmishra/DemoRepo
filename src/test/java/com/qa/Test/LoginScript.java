package com.qa.Test;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.Base.Utilities;
import com.qa.dataProviders.DataProviders;

public class LoginScript extends BaseTest {

	@Factory(dataProvider = "Config", dataProviderClass = DataProviders.class)
	public LoginScript(String browser) {
		super(browser);
	}

	// initialize variables
	String randomString = "test" + Utilities.getTimeStamp();

	/**
	 * Verify user is be able to login using a valid user-name and password and
	 * is able to logout from the application.
	 * 
	 * @throws Exception
	 */
	@Test
	public void test01_Login_And_LogOut_With_Valid_Username_And_Password()
			throws Exception {

		reportLog("login into the application");
		homePage = loginPage.login("username", "password");		

		reportLog("logout from the application");
		loginPage = homePage.logOut();

	}

	
}
