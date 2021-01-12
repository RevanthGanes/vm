Feature: Vmail feature file

  Scenario: Verify Vmail workflow
    Given user is in login vital engine portal
    When user enters valid username and password
    And click on submit button
    And user click on new button present in homepage
    And user add new receiving team and add participants
    And user adds subject,tags and image
    And user upload file and medical records
    Then click on create Vmail
