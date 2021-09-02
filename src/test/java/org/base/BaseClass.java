package org.base;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;

	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void fireFoxBrowserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	public static void ieBrowserLaunch() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();

	}

	public static void edgeBrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void urlLaunch(String url) {

		driver.get(url);

	}

	public static void fillText(WebElement e, String txt) {

		e.sendKeys(txt);

	}

	public static void clickingButton(WebElement e) {

		e.click();
	}

	public static void doubleClicking(WebElement target) {

		a = new Actions(driver);

		a.doubleClick(target).perform();

	}

	public static void movingElement(WebElement target) {

		a = new Actions(driver);

		a.moveToElement(target).perform();

	}

	public static void actionsClicking(WebElement target) {

		a = new Actions(driver);

		a.click(target).perform();

	}

	public static void refreshing() {
		driver.navigate().refresh();

	}

	public static void waitTime(long time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public static void closingBrowser() {
		driver.quit();

	}

	public static void dateRange() {
		Date d = new Date();
		System.out.println(d);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void switchingWindow() {

		String parId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();

		for (String eachId : allId) {

			if (!parId.equals(eachId)) {
				driver.switchTo().window(eachId);
			}
		}

	}

	public static void assertValidationTrue(boolean condition) {
		Assert.assertTrue(condition);

	}

	public static void assertValidationEquals(boolean actual, boolean expected) {
		Assert.assertEquals(actual, expected);

	}

}
