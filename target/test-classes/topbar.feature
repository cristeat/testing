Feature: Top bar functionality

  Scenario: Test top bar drop down buttons functionality
    Given I am on the main page
    When I click on the top section vehicles button
    Then The corresponding drop down is presented
    When I click the top shopping button
    Then The shopping drop down is expanded
    When I click the top ownership button
    Then The ownership drop down is expanded
    When I click the top certified pre-owned button
    Then The certified pre-owned drop down is expanded
    When I click the top find a dealer button
    Then The find a dealer drop down is expanded
    And Page URL is updated
    When I click the top world of cadillac button
    Then The world of cadillac drop down is expanded