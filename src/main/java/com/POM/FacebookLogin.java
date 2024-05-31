package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.BaseClass;
import com.Property.ConfigClass;

public class FacebookLogin extends BaseClass {

	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "pass")
	private WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	private WebElement createAccBtn;

	private static ConfigClass cfg = new ConfigClass();

	public void launchBrowser() {

		browserLauch("browser");

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getCreateAccBtn() {
		return createAccBtn;
	}

	public static ConfigClass getCfg() {
		return cfg;
	}

	public void loginFacebook() {

		implicitWait(30);
		launchUrl(driver, cfg.getFacebookURL());
		clickOnElement(driver, email);
		passInput(driver, email, "username");
		clickOnElement(driver, password);
		passInput(driver, password, "password");
		clickOnElement(driver, loginBtn);
	}

}
