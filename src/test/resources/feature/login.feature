Feature: This feature will validate login fuctionality

  Background: 
    Given user open the website

  @Smoke
  Scenario: Verify user can able to login
    When user do login with valid credentials
    Then verify user is on homepage

  Scenario: Verify user cannot able to login with invalid credentials
    When user do login with invalid credentials
    Then verify invalid login error message
