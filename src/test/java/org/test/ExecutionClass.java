package org.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PojoClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExecutionClass extends BaseClass {
	PojoClass pj;

	@Parameters({ "URL" })
	@BeforeClass
	private void launcher(String url) {
		chromeBrowserLaunch();
		urlLaunch(url);
		maxWindow();
		waitTime(30);

	}

	@BeforeMethod
	private void preTest() {
		pj = new PojoClass();

	}

	@Parameters({ "Product" })
	@Test
	private void tc1(String product) {
		assertValidationTrue(pj.getTxtSearch().isDisplayed());
		fillText(pj.getTxtSearch(), product);

		assertValidationTrue(pj.getBtnSearch().isEnabled());
		clickingButton(pj.getBtnSearch());

	}

	@Test
	private void tc2() {

		assertValidationTrue(pj.getMyProduct().isEnabled());
		clickingButton(pj.getMyProduct());

	}

	@Test
	private void tc3() {
		switchingWindow();
		assertValidationTrue(pj.getCartBtn().isDisplayed());

	}

	@Test
	private void tc4() throws InterruptedException {
		movingElement(pj.getCartBtn());
		actionsClicking(pj.getCartBtn());

		movingElement(pj.getCheckOutBtn());
		actionsClicking(pj.getCheckOutBtn());

	}

	@Parameters({ "Username", "Password" })
	@Test
	private void tc5(String user, String pass) {

		fillText(pj.getTxtUser(), user);
		assertValidationTrue(pj.getTxtUser().isDisplayed());

		movingElement(pj.getContinueBtn());
		actionsClicking(pj.getContinueBtn());

		fillText(pj.getTxtPass(), pass);
		assertValidationTrue(pj.getTxtPass().isDisplayed());

		clickingButton(pj.getSignInBtn());

	}

	@Test
	private void tc6() {
//		clickingButton(pj.getDeliveryBtn());

	}

	@Test
	private void tc7() {
		clickingButton(pj.getPaymentCard());

	}

	@Parameters({ "URL" })
	@Test
	private void tc8(String url) {
		urlLaunch(url);

		movingElement(pj.getCartBtnFinal());
		actionsClicking(pj.getCartBtnFinal());

		clickingButton(pj.getDeleteProduct());

	}

	@Test
	private void tc9() {
		movingElement(pj.getMyAccount());
		actionsClicking(pj.getSignOut());
		assertValidationTrue(driver.getCurrentUrl().contains("signin"));

		closingBrowser();
	}

}
