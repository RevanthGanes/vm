@VmailFlow
Feature: Vmail Test Automation Workflow

  Scenario: Create Vmail and verify the Same
    Given User is in login vital engine portal
    When User enters valid username and password
    And Click on submit button
    And User click on new button present in homepage
    And User add new receiving team and add participants
    And User adds subject,tags and image
    And User upload file and medical records
    Then Click on create Vmail
		And Verify the Subject present in header