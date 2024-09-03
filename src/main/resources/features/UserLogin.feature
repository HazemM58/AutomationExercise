@UserLogin
Feature: User Login
  As a user
  I want to log in with my valid username and password
  So that I can access my account dashboard

  Scenario: User logs in with valid username and password
    Given the user is on the login page
    When the user enters a valid username and password
    And the user clicks on the login button
    Then the user should be redirected to the Home page
