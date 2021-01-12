package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class TestMailPojo extends BaseClass {

	public TestMailPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@id='subject'])[1]")
	private WebElement typeSubject;

	@FindBy(xpath = "//*[@id='message']")
	private WebElement typeTxtMsg;

	@FindBy(xpath = "//div[@class='tags']/input")
	private WebElement addTags;

	@FindBy(xpath = "//*[@class='suggestion-list']")
	private WebElement suggTags;

	@FindBy(xpath = "//*[text()='Add']")
	private WebElement addTagBtn;

	@FindBy(xpath = "//*[@data-target='#linkImageModal']")
	private WebElement clkAddImages;

	@FindBy(xpath = "//*[@id='patientName']")
	private WebElement typePatient;

	@FindBy(xpath = "//*[@value='Query']")
	private WebElement clkQuery;
	@FindBy(xpath = "//table//td[text()='Fall 3']")
	private WebElement selectPatient;
	
	@FindBy(xpath = "//table//td//input[@name='selectPatientStudy']")
	private WebElement clkChkBox;

	@FindBy(xpath = "(//*[@class='col-sm-12']//child::input[@value='Add'])[2]")
	private WebElement clkAddPatient;

	public WebElement getTypeSubject() {
		return typeSubject;
	}

	public WebElement getTypeTxtMsg() {
		return typeTxtMsg;
	}

	public WebElement getAddTags() {
		return addTags;
	}

	public WebElement getSuggTags() {
		return suggTags;
	}

	public WebElement getAddTagBtn() {
		return addTagBtn;
	}

	public WebElement getClkAddImages() {
		return clkAddImages;
	}

	public WebElement getTypePatient() {
		return typePatient;
	}

	public WebElement getClkQuery() {
		return clkQuery;
	}

	public WebElement getSelectPatient() {
		return selectPatient;
	}

	public WebElement getClkChkBox() {
		return clkChkBox;
	}

	public WebElement getClkAddPatient() {
		return clkAddPatient;
	}

}
