package com.Amazon;

import org.checkerframework.checker.units.qual.s;

import com.Base.BaseClass;
import com.POM.AmazonLoginPOM;
import com.POM.AmazonPaymentPOM;
import com.POM.AmazonSearchPOM;
import com.POMA.AmazonPageObjectManager;
import com.Property.AmazonFileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDef extends BaseClass {

	AmazonPageObjectManager apom = new AmazonPageObjectManager();

//	AmazonLoginPOM loginPOM = new AmazonLoginPOM(driver);

	@Given("User Land On The Amazon Page")
	public void user_land_on_the_amazon_page() {
		launchUrl(driver, AmazonFileReaderManager.getConfigReader().getAmazonURL());

	}

	@When("User Click The SignIn Button")
	public void user_click_the_sign_in_button() {
		clickOnElement(driver, apom.getAmazonLogin().getSignInbtn());

	}

	@When("User Enter the Username In The Username Field {string}")
	public void user_enter_the_username_in_the_username_field(String Email) {
		passInput(driver, apom.getAmazonLogin().getEmailId(), Email);

	}

	@When("User click The Continue Button And Navigate To Password Page")
	public void user_click_the_continue_button_and_navigate_to_password_page() {
		clickOnElement(driver, apom.getAmazonLogin().getContinueBtn());

	}

	@When("User Enter The Password In The Password Field {string}")
	public void user_enter_the_password_in_the_password_field(String password) {
		passInput(driver, apom.getAmazonLogin().getPassword(), password);

	}

	@When("User Click The SignIn Button And Navigate To The Home Page")
	public void user_click_the_sign_in_button_and_navigate_to_the_home_page() {
		clickOnElement(driver, apom.getAmazonLogin().getSignInBtn2());

	}

	@Then("User Land On The Amazon Homepage")
	public void user_land_on_the_amazon_homepage() {
		System.out.println("user land on the amazon homepage");

	}

//	AmazonSearchPOM searchPOM = new AmazonSearchPOM(driver);

	@When("User Click The Search Box And Enter The Product Name {string}")
	public void user_click_the_search_box_and_enter_the_product_name(String ProductName) {
		implicitWait(30);
		clickOnElement(driver, apom.getAmazonSearch().getSearchBox());
		clearText(apom.getAmazonSearch().getSearchBox());
		passInput(driver, apom.getAmazonSearch().getSearchBox(), ProductName);

	}

	@When("User Click The Search Button And Navigate to the Product List Page")
	public void user_click_the_search_button_and_navigate_to_the_product_list_page() {
		clickOnElement(driver, apom.getAmazonSearch().getSearchBtn());

	}

	@When("User Select The Product In The List And navigate To The Product Details Page")
	public void user_select_the_product_in_the_list_and_navigate_to_the_product_details_page() {
		clickOnElement(driver, apom.getAmazonSearch().getProduct());
		staticWait(5000);
		windowHandler(1);
		staticWait(5000);
	}

	@When("User Click The Add To Cart Button  And Get The Window Popup In The Current page")
	public void user_click_the_add_to_cart_button_and_get_the_window_popup_in_the_current_page() {
		JSFindElement(apom.getAmazonSearch().getCartBtn());
		staticWait(5000);

	}

	@When("User Click The Cart Button  and Navigate To the Cart Page")
	public void user_click_the_cart_button_and_navigate_to_the_cart_page() {
		clickOnElement(driver, apom.getAmazonSearch().getAddCart());

	}

	@Then("User Lands On The Cart Page")
	public void user_lands_on_the_cart_page() {
		System.out.println("user lands on the cart page");
		closeTab();
		windowHandler(0);

	}

//	AmazonPaymentPOM paymentPOM = new AmazonPaymentPOM(driver);

	@When("User Click The Cart Button And Navigates to the Cart Page")
	public void user_click_the_cart_button_and_navigates_to_the_cart_page() {
		clickOnElement(driver, apom.getAmazonPayment().getCartPage());

	}

	@When("User Clicks THe Proceed To Pay Button And Navigates To The CheckOut Page")
	public void user_clicks_t_he_proceed_to_pay_button_and_navigates_to_the_check_out_page() {
		clickOnElement(driver, apom.getAmazonPayment().getProceedToPay());
	}

	@When("User Click The Use This Address Button")
	public void user_click_the_use_this_address_button() {
		clickOnElement(driver, apom.getAmazonPayment().getUseThisAddress());

	}

	@When("User Clicks The PaymentMethod ratio Button And Click The Enter Card Details Button And New PopUp frames opens")
	public void user_clicks_the_payment_method_ratio_button_and_click_the_enter_card_details_button_and_new_pop_up_frames_opens() {
		clickOnElement(driver, apom.getAmazonPayment().getPaymentMethod());

		clickOnElement(driver, apom.getAmazonPayment().getEnterCardDetails());
		staticWait(5000);
	}

	@When("User Changes Frame And Click Card Number Button And Pass The Value\"{int} {int} {int}\"")
	public void user_changes_frame_and_click_card_number_button_and_pass_the_value(Integer int1, Integer int2,
			Integer int3) {
		frameByIndex(0);
		clickOnElement(driver, apom.getAmazonPayment().getCardNumber());
		passInput(driver, apom.getAmazonPayment().getCardNumber(), "1234 2345 654");

	}

	@Then("User Click The Enter Button and Gets THere Was A Problem Message")
	public void user_click_the_enter_button_and_gets_t_here_was_a_problem_message() {
		clickOnElement(driver, apom.getAmazonPayment().getClickEnter());
		System.out.println("user gets THERE WAS A PROBLEM. message");

	}

}
