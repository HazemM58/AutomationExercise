@regression




  Background:
  #Given  Open Browser
    When  the user is on the login page
    Then the user enters a valid username and password
    And the user clicks on the login button

  Scenario: User adds a product to the shopping cart
    Given the user is logged in and on a product page
    When the user selects a product and clicks on the "Add to Cart" button
    Then the product should be added to the user's shopping cart



Feature: Contact Us Form Submission
  As a user
  I want to submit a contact form
  So that I can get in touch with customer support
#
#  Background:
#    Given  Open Browser
#    When  the user is on the login page
#    Then the user enters a valid username and password
#    And the user clicks on the login button

  Scenario: User submits the Contact Us form with valid details
    Given the user is on the Contact Us page
    When the user enters valid name, email, subject, and message
  # And the user uploads a file
    And the user clicks on the Submit button
    Then the user should see a success message
    And the user should be able to navigate back to the home page
  @regression

#Feature: User should be able to register successfully

#  Background:user open browser and go to login page
#    Given user open browser
#   And user navigates to login page


  Feature: User Login
  As a user
  I want to log in with my valid username and password
  So that I can access my account dashboard

#
#  Background:
# #  Given  Open Browser
#    When  the user is on the login page


  Scenario: User logs in with valid username and password
    Given the user is on the login page
    When the user enters a valid username and password
    And the user clicks on the login button
    Then the user should be redirected to the Home page
  @regression


  Feature: Complete Purchase
  As a user
  I want to complete a purchase
  So that I can buy the items in my shopping cart


  Background:
  #  Given  Open Browser
    When  the user is on the login page
    Then the user enters a valid username and password
    And the user clicks on the login button

  Scenario: User completes a purchase
    Given the user has items in their shopping cart
    When the user proceeds to checkout
    And the user proceeds to Place Order
    And the user enters valid payment and shipping information
    And the user clicks on the "Place Order" button
    Then the user should see an order confirmation page
    And the user downloads the invoice
Feature: View and Search Products
  As a user
  I want to view and search for products
  So that I can find items I am interested in purchasing

  Background:
  #  Given  Open Browser
    When  the user is on the login page
    Then the user enters a valid username and password
    And the user clicks on the login button


  Scenario: User views the products page
    Given the user is on the Products page
    Then the user should see the list of all products

  Scenario: User searches for a product
    Given the user is on the Products page
    When the user enters a product name in the search input
    And the user clicks on the search button
    Then the user should see the searched products
  @regression


    When  the user is on the login page



  Scenario: User registers a new account with valid details
    Given the user is on the registration page
    When the user enters a valid username, password, email, and other required details
    And the user clicks on the register button
    Then the user should receive a confirmation email
    And the user should be redirected to the login page
Feature: View Test Cases
  As a user
  I want to view the test cases
  So that I can understand the testing scenarios provided by the site

  Background:
  #  Given  Open Browser
    When  the user is on the login page
    Then the user enters a valid username and password
    And the user clicks on the login button


  Scenario: User navigates to the Test Cases page
    Given the user is on the Home page
    When the user clicks on the "Test Cases" button
    Then the user should be navigated to the Test Cases page
    And the user should see the list of all test cases

  Scenario: Verify that the Test Cases page displays the correct title
    Given the user is on the Test Cases page
    Then the title of the page should be "Test Cases"