@CompletePurchase
Feature: Complete Purchase
  As a user
  I want to complete a purchase
  So that I can buy the items in my shopping cart


  Background:
    When  the user is on the login page
    Then the user enters a valid username and password
    And the user clicks on the login button

  Scenario: User completes a purchase

    Given the user selects a product and clicks on the "Add to Cart" button
    And the product should be added to the user's shopping cart
    When the user proceeds to checkout
    And the user proceeds to Place Order
    And the user enters valid payment and shipping information
    And the user clicks on the "Place Order" button
    Then the user should see an order confirmation page
    And the user downloads the invoice
