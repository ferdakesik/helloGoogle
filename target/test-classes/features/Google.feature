@Google
Feature: As a user, I should be able to search details

  Scenario: I should be able to see results
    Given I am on the google page
    When I enter "Iphone" and enter search area
    Then I should be able to see the search results

    #iphone=search area