Feature: Basic search feature
Background:
  Given User opens basic page

  Scenario: Basic test

    And User presses Features tab
    And User presses Prices tab
    Then Prices tab header is correct

    Scenario: Docs Test
      
    Given User presses Docs tab
    And Docs page text is correct
    And Click Cookie Policy

