Feature: This feature will validate login fuctionality

  Scenario: Verify user can able to login
    Given user open the website
    When user do login with valid credentials
    Then verify login successful

  Scenario: Verify user cannot able to login with invalid credentials
    Given user open the website
    When user do login with invalid credentials
    Then verify invalid login error message
