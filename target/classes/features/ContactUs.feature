@ContactUs
Feature: Contact Us Form Submission
  As a user
  I want to submit a contact form
  So that I can get in touch with customer support


  Scenario: User submits the Contact Us form with valid details
    Given the user is on the Contact Us page
    When the user enters valid name, email, subject, and message
    And the user clicks on the Submit button
    Then the user should see a success message
    And the user should be able to navigate back to the home page
