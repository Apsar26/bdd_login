Feature: Check for Broken Links on W3Schools

  Scenario: Verify and Print Broken Links
    Given I start with the home URL
    When I check for broken links
    Then I print out any broken links
