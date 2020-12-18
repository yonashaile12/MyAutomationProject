Feature: Login feature
  As a user I want login because i otherwise how do I use this app?

  Scenario: Basic login
    Given user is on thee landing page
    When user enters credentials
    And user clicks login button
    Then user supposed to see welcome message
