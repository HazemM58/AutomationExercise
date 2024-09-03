@UserRegistration
Feature: User Registration
As a new user
I want to register a new account with valid details
So that I can access the website features and make purchases

  Background:
    When  the user is on the login page

  Scenario: User registers a new account with valid details
    Given the user is on the registration page
    When the user enters a valid username, password, email, and other required details
    And the user clicks on the register button
    Then the user should receive a confirmation email
    And the user should be redirected to the login page
