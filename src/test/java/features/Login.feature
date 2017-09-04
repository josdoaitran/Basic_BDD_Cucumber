Feature: Login Feature
  This feature deals with the login functionalities of the applications.

  Scenario: Login with correct username and password in Pass.
    Given I navigate to login page
    And I click on login link
    And I enter the following for Login
      | Username | Password |
      | adminUsd | adminPwd |
    And I click on login button
    Then I should see the home page