package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.Property.ConfigClass;

public class AmazonSearchPOM extends BaseClass {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchBtn;

	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement product;

	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	private WebElement cartBtn;

	@FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	private WebElement addCart;

	@FindBy(xpath = "(//div[@class='a-row'])[1]")
	private WebElement noResultproduct;

	@FindBy(className = "s-no-outline")
	private WebElement invalidName;

	@FindBy(xpath = "(//div[@class='a-row'])[1]")
	private WebElement noResultMsg;

	// constructor
	public AmazonSearchPOM(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getNoResultproduct() {
		return noResultproduct;
	}

	public WebElement getInvalidName() {
		return invalidName;
	}

	public WebElement getNoResultMsg() {
		return noResultMsg;
	}

}
