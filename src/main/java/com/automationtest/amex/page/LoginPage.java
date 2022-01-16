package com.automationtest.amex.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationtest.amex.driver.DriverSingleton;

public class LoginPage {
	
private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(css = "#header > ul > li > a > span")
	private WebElement txtDisplayName;
	
	
	public void goToLoggedIn(String username, String password) {		
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getDisplayName() {
		return txtDisplayName.getText();
	}

}
