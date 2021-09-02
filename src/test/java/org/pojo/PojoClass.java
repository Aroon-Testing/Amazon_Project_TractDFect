package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement txtSearch;

	@FindBy(xpath = "//input[@type='submit' and @value='Go']")
	private WebElement btnSearch;

	@FindBy(xpath = "//span[text()='New Apple iPhone 11 (64GB) - Black']")
	private WebElement myProduct;

	@FindBy(xpath = "//input[@id='buy-now-button']//..//preceding::span[text()='Add to Cart']")
	private WebElement cartBtn;

	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	private WebElement checkOutBtn;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement txtUser;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtPass;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInBtn;

	@FindBy(xpath = "//a[contains(text(),'Deliver to this address')]")
	private WebElement deliveryBtn;

	@FindBy(xpath = "//span[contains(text(),'Add Debit/Credit/ATM Card')]")
	private WebElement paymentCard;

	@FindBy(xpath = "//span[@id='nav-cart-count']")
	private WebElement cartBtnFinal;

	@FindBy(xpath = "//input[@type='submit' and @value='Delete']")
	private WebElement deleteProduct;

	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement myAccount;

	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signOut;

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getMyProduct() {
		return myProduct;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getDeliveryBtn() {
		return deliveryBtn;
	}

	public WebElement getPaymentCard() {
		return paymentCard;
	}

	public WebElement getCartBtnFinal() {
		return cartBtnFinal;
	}

	public WebElement getDeleteProduct() {
		return deleteProduct;
	}

}
