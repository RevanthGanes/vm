$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Vmail.feature");
formatter.feature({
  "name": "Vmail Test Automation Workflow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VmailFlow"
    }
  ]
});
formatter.scenario({
  "name": "Create Vmail and verify the Same",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VmailFlow"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in login vital engine portal",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_in_login_vital_engine_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on new button present in homepage",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_click_on_new_button_present_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add new receiving team and add participants",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_add_new_receiving_team_and_add_participants()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds subject,tags and image",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_adds_subject_tags_and_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User upload file and medical records",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_upload_file_and_medical_records()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on create Vmail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.click_on_create_Vmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Subject present in header",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.verify_the_subject_test_mail_present_in_header()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});