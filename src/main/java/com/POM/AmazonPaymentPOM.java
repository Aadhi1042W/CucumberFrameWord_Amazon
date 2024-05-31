package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.Property.ConfigClass;

public class AmazonPaymentPOM extends BaseClass {

	public static WebDriver driver;

	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	private WebElement cartPage;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToPay;

	@FindBy(xpath = "//input[@data-testid='Address_selectShipToThisAddress']")
	private WebElement useThisAddress;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement paymentMethod;

	@FindBy(xpath = "(//a[contains(text(),'Enter card details')])[1]")
	private WebElement enterCardDetails;

	@FindBy(xpath = "//input[@name='addCreditCardNumber']")
	private WebElement cardNumber;

	@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	private WebElement clickEnter;

	@FindBy(xpath = "//h4[@class='a-alert-heading']")
	private WebElement errorMassage;

	@FindBy(xpath = "//button[@aria-label='Close']")
	private WebElement closeCardDetail;

	@FindBy(id = "nav-link-accountList")
	private WebElement signInbtn;

	// constructor
	public AmazonPaymentPOM(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getCartPage() {
		return cartPage;
	}

	public WebElement getProceedToPay() {
		return proceedToPay;
	}

	public WebElement getUseThisAddress() {
		return useThisAddress;
	}

	public WebElement getPaymentMethod() {
		return paymentMethod;
	}

	public WebElement getEnterCardDetails() {
		return enterCardDetails;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getClickEnter() {
		return clickEnter;
	}

	public WebElement getErrorMassage() {
		return errorMassage;
	}

	public WebElement getCloseCardDetail() {
		return closeCardDetail;
	}

	public WebElement getSignInbtn() {
		return signInbtn;
	}

}
