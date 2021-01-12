package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement logBtn;
	

	@FindBy(xpath = "//*[@id='userName']")
	private WebElement txtUserName1;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement signIn;

	public WebElement getLogBtn() {
		return logBtn;
	}
	
	public WebElement getTxtUserName1() {
		return txtUserName1;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getSignIn() {
		return signIn;
	}

}
