package com.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.base.BaseClass;
import com.pojo.FileUpload;
import com.pojo.HomePage;
import com.pojo.LoginPage;
import com.pojo.TestMailPojo;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class StepDef extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;

	@Given("User is in login vital engine portal")
	public void user_is_in_login_vital_engine_portal() {

	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {

		loginPage = new LoginPage();
		btnClick(loginPage.getLogBtn());
		insert(loginPage.getTxtUserName1(), "Gopi1");
		insert(loginPage.getTxtPassword(), "Test@123");

	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		btnClick(loginPage.getSignIn());
	}

	@When("User click on new button present in homepage")
	public void user_click_on_new_button_present_in_homepage() throws InterruptedException {
		homePage = new HomePage();
		btnClick(homePage.getvMailicon());
		Thread.sleep(3000);
		btnClick(homePage.getNewVmail());
		// btnClick(homePage.getRadioInVitalengine());

	}

	@When("User add new receiving team and add participants")
	public void user_add_new_receiving_team_and_add_participants() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(homePage.getAddReceivingTeam());
		insert(homePage.getAddParticipant(), "Albert");
		// / btnClick(homePage.getRadioInVitalengine());
		btnClick(homePage.getClickSearch());

		btnClick(homePage.getSelectRadioBtn());
		WebDriverWait driverWait = new WebDriverWait(driver, 30);
		WebElement until = driverWait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='wizard-next btn btn-success'])[3]")));
		until.click();
	}

	@When("User adds subject,tags and image")
	public void user_adds_subject_tags_and_image() throws InterruptedException {
		TestMailPojo mailPojo = new TestMailPojo();
		insert(mailPojo.getTypeSubject(), "test mail");
		insert(mailPojo.getTypeTxtMsg(), "text message");
		WebElement addTags = mailPojo.getAddTags();
		// insert(addTags, "test");
		Actions actions = new Actions(driver);
		actions.sendKeys(addTags, "Testing_1").build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).build().perform();
		btnClick(mailPojo.getClkAddImages());
		insert(mailPojo.getTypePatient(), "fall");
		btnClick(mailPojo.getClkQuery());
		Thread.sleep(2000);
		btnClick(mailPojo.getSelectPatient());
		btnClick(mailPojo.getClkChkBox());
		btnClick(mailPojo.getClkAddPatient());
		Thread.sleep(100);

	}

	@When("User upload file and medical records")
	public void user_upload_file_and_medical_records() throws InterruptedException {
		FileUpload fileUpload = new FileUpload();
		btnClick(fileUpload.getAddMedicalRecords());
		selectBYVissibleText(fileUpload.getSelectCategory(), "Merits Note");
		WebElement clkChooseFile = fileUpload.getClkChooseFile();

		clkChooseFile.sendKeys(System.getProperty("user.dir") + "\\File\\referral.pdf");
		Thread.sleep(2000);
		fileUpload.getClkSave().click();
		;

	}

	@Then("Click on create Vmail")
	public void click_on_create_Vmail() {
		FileUpload fileUpload = new FileUpload();
		btnClick(fileUpload.getClkCreateVmail());
	}

	@Then("Verify the Subject present in header")
	public void verify_the_subject_test_mail_present_in_header() {
		FileUpload fileUpload = new FileUpload();
		org.junit.Assert.assertTrue(fileUpload.getSubjecTestMail().isDisplayed());
	}

}
