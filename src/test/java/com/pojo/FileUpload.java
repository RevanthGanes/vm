package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FileUpload extends BaseClass {

	public FileUpload() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[contains(text(),'Subject')]")
	private WebElement subjecTestMail;

	public WebElement getSubjecTestMail() {
		return subjecTestMail;
	}

	@FindBy(xpath = "//*[@class='pull-right push-10-t']")
	private WebElement addMedicalRecords;

	@FindBy(xpath = "//*[@id='mdCategoryId']")
	private WebElement selectCategory;

	@FindBy(xpath = "//input[@id='mdFile']")
	private WebElement clkChooseFile;

	@FindBy(xpath = "//*[@value='Save']")
	private WebElement clkSave;

	@FindBy(xpath = "//*[@class='btn btn-primary btn-lg']")
	private WebElement clkCreateVmail;

	public WebElement getAddMedicalRecords() {
		return addMedicalRecords;
	}

	public WebElement getSelectCategory() {
		return selectCategory;
	}

	public WebElement getClkChooseFile() {
		return clkChooseFile;
	}

	public WebElement getClkSave() {
		return clkSave;
	}

	public WebElement getClkCreateVmail() {
		return clkCreateVmail;
	}

}
