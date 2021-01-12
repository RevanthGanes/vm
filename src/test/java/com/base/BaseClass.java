package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Revanth\\workspace\\Vmail\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void loadUrl(String data) {
		driver.get(data);
	}

	public static void insert(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void btnClick(WebElement element) {

		element.click();
	}

	public static void clickByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void selectBYVissibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);

	}
}
