Feature: Checking sign in functionality

  Scenario: Verify whether the user able to create customer account without entering all mandatory fields
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user Do not enter any input value in all mandatory fields mentioned fields
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for all mandatory fields.

  Scenario: Verify whether the user able to create customer account by entering all mandatory field excluding Confirm Password field.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields excluding Confirm password field.
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for Confirm password fields.

  Scenario: Verify whether the user able to create customer account by entering all mandatory field excluding Password field.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields excluding password field.
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for password fields..

  Scenario: Verify whether the user able to create customer account by entering all mandatory field excluding email field.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields excluding email field.
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for email fields.

  Scenario: Verify whether the user able to create customer account by entering all mandatory field excluding first name field.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields excluding first name field.
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for first name fields..

  Scenario: Verify whether the user able to create customer account by entering all mandatory field excluding last name field.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields excluding last name field.
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for last name fields.

  Scenario: Verify whether the user able to create customer account by entering all mandatory fields without having domain into the email.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields and enter email id without having domain
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for email validation.

  Scenario: Verify whether the user able to create customer account by entering all mandatory fields and by entering confirm password which is not match with enter password.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields along with Confirm Password mismatched
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for password validation.

  Scenario: Verify whether the user able to create customer account by entering all email id which has already account available.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the input value in all mandatory fields along with already user email id
    And Click on Create An Account button on signUp Page
    Then Verify the system displayed the error messages for duplicate email id.

  Scenario: Verify whether the user able to create customer account by entering all mandatory fields along with correct input values.
    Given The user should launch the browser and URL
    And Click on Create An Account button on home page
    When The user enter the correct input value in all mandatory fields
    And Click on Create An Account button on signUp Page
    Then verify the system displayed the success message on top for new accout creation

  Scenario: Verify whether the user is able to login into application with valid credentials.
    Given The user should launch the browser and URL
    And Click on sign in on home page and enter the username and password
    When click on signin button on sign in page
    Then verify user is loggned to account
    
