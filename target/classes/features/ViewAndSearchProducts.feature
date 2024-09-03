@@ViewAndSearchProducts
Feature: View and Search Products
  As a user
  I want to view and search for products
  So that I can find items I am interested in purchasing

  Background:
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
