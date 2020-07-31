package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.Base.BasePage;

public class PracticePage1 extends BasePage {

	public PracticePage1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//nav[@class='main-menu']")
	private WebElement mainMenu;
	
	/**
	 * verify user logged in successfully
	 */
	public void verifyLogin() throws Exception {
		verifyElementPresent(mainMenu);
	}

	/**
	 * logout from the application
	 */
	public PracticePage1 logOut() {
		
		//hoverOverElementAndClick(mainMenu, logOut);
		return PageFactory.initElements(getDriver(), PracticePage1.class);
	}

}
