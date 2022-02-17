Feature: Feature to test lacaptitale login

  Scenario: Check Login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
