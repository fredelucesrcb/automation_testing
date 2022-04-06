Feature: Google
  Scenario: Go to google
    Given I redirect to google page
    When I enter "google"
    And I click search
    Then the google search should be displayed