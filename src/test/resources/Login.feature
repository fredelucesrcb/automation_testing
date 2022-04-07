Feature: Registration Action
  Scenario: Go to Parabank Landing Site
    Given I am on Parabank Home page
    When I click on the Register Button
    And I enter "Roy" on First name field
    And I enter "Test" on Last name field
    And I enter "Tondo" on Address Field
    And I enter "Manila" on City Field
    And I enter "NCR" on State Field
    And I enter "1008" on Zip code Field
    And I enter "12345678" on Phone number field
    And I enter "122222" on SSN field
    And I enter "test_user1995" on Username field
    And I enter "password" on Password field
    And I enter "password" on Confirm field
    And I submit the form
    Then the registration will be successful and I am Logged in