package com.POMA;

import com.Base.BaseClass;
import com.POM.AmazonLoginPOM;
import com.POM.AmazonPaymentPOM;
import com.POM.AmazonSearchPOM;

public class AmazonPageObjectManager extends BaseClass {

	private AmazonLoginPOM login;
	private AmazonSearchPOM search;
	private AmazonPaymentPOM payment;

	public AmazonLoginPOM getAmazonLogin() {

		if (login == null) {
			login = new AmazonLoginPOM(driver);

		}
		return login;

	}

	public AmazonSearchPOM getAmazonSearch() {

		if (search == null) {
			search = new AmazonSearchPOM(driver);

		}
		return search;

	}

	public AmazonPaymentPOM getAmazonPayment() {

		if (payment == null) {
			payment = new AmazonPaymentPOM(driver);

		}
		return payment;

	}
}
