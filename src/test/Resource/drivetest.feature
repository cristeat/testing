Feature: Drive test demo

  Scenario: Submitting a drive test request
    Given I am on the drive test request page
    When I fill in the application with my valid data
    And Click submit button
    Then I am presented with successful thank you page
