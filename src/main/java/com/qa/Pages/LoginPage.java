package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.Base.BasePage;
import com.qa.Base.Configuration;


public class LoginPage  extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='userName']")
	public WebElement userNameField;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@id='login']")
	public WebElement loginButton;
	
	
	/**
	 * login into the application
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public HomePage login(String username, String password) throws Exception {
		String userName = Configuration.readApplicationFile(username);
		String pwd = Configuration.readApplicationFile(password);
		inputText(userNameField, userName);
		inputText(passwordField, pwd);
		clickOn(loginButton);
		return PageFactory.initElements(getDriver(), HomePage.class);
	}

	
}
