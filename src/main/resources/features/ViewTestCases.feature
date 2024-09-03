@ViewTestCases
Feature: View Test Cases
  As a user
  I want to view the test cases
  So that I can understand the testing scenarios provided by the site

  Scenario: User navigates to the Test Cases page
    Given the user is on the Home page
    When the user clicks on the "Test Cases" button
    Then the user should be navigated to the Test Cases page
    And the user should see the list of all test cases

  Scenario: Verify that the Test Cases page displays the correct title
    Given the user is on the Test Cases page
    Then the title of the page should be "Test Cases"
