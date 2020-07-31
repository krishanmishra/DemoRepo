package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BasePage;



public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//nav[@class='main-menu']")
	private WebElement mainMenu;

	@FindBy(xpath = "//div[@id='books-wrapper']//button")
	private WebElement logOut;
	
	/**
	 * logout from the application
	 */
	public LoginPage logOut() {
		clickOn(logOut);
		return PageFactory.initElements(getDriver(), LoginPage.class);
	}

	
	
}
