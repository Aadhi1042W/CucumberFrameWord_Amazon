package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

import com.Base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AmazonLoginPOM extends BaseClass {

	public static WebDriver driver;

	@FindBy(id = "nav-link-accountList")
	private WebElement signInbtn;

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement emailId;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInBtn2;

	@FindBy(xpath = "//span[@class='a-list-item']")
	private WebElement inputError;

	@FindBy(xpath = "//div[contains( text(),' Enter your email or mobile')]")
	private WebElement emptyEmail;

	@FindBy(xpath = "//div[contains( text(),' Enter your password')]")
	private WebElement emptyPassword;

	// constructor
	public AmazonLoginPOM(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn2() {
		return signInBtn2;
	}

	public WebElement getInputError() {
		return inputError;
	}

	public WebElement getEmptyEmail() {
		return emptyEmail;
	}

	public WebElement getEmptyPassword() {
		return emptyPassword;
	}

}
