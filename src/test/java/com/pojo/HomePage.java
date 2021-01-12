package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@ui-sref='vmail']")
	private WebElement vMailicon;

	@FindBy(xpath = "//*[@class='btn newButtonMsg']")
	private WebElement newVmail;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement radioInVitalengine;

	@FindBy(xpath = "(//*[@class='addParticipant img-wrap'])[2]")
	private WebElement addReceivingTeam;

	@FindBy(xpath = "(//*[@id='addPartSearchTxt'])")
	private WebElement addParticipant;

	@FindBy(xpath = "(//input[@class='btn btn-success'])[1]")
	private WebElement clickSearch;

	@FindBy(xpath = "(//table//tr//td/child::input)[1]")
	private WebElement selectRadioBtn;

	@FindBy(xpath = "(//input[@class='wizard-next btn btn-success'])[3]")
	private WebElement clickAddBtn;

	public WebElement getvMailicon() {
		return vMailicon;
	}

	public WebElement getNewVmail() {
		return newVmail;
	}

	public WebElement getRadioInVitalengine() {
		return radioInVitalengine;
	}

	public WebElement getAddReceivingTeam() {
		return addReceivingTeam;
	}

	public WebElement getAddParticipant() {
		return addParticipant;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getSelectRadioBtn() {
		return selectRadioBtn;
	}

	public WebElement getClickAddBtn() {
		return clickAddBtn;
	}

}
