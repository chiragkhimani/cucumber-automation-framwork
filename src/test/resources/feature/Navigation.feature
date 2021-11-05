Feature: This feature validate naviagtion between the pages

  Scenario Outline: Verify user can able to navigate to product detail page from cart page
    Given user open the website
    When user do login with valid credentials
    Then verify user is on homepage
    When user click on item "<itemName>"
    Then verify user is on product detail page
    When user clicks on add to cart button
    And click on cart icon
    Then verify user is on cart page
    When user click on item name from cart page
    Then verify user is on product detail page
    And verify remove button is displayed

    Examples: 
      | itemName                 |
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light    | 
      | Sauce Labs Fleece Jacket | 
