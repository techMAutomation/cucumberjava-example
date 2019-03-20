@test
Feature: Verify that Home page is working fine

  Background:
    Given I am on the Home page

  Scenario Outline: Test that Login page functionality is working correctly with Invalid data
    When I click on the SignIn link
    And I enter invalid Username <username>
    And I enter invalid Password <password>
    And I submit login details
    Examples:
      | username | password |
      |          |          |
      | Hi       |          |
      | Hi       | hello    |

  Scenario: Test that Registration page is opened correctly
    When I click on the Join Now link
    Then I should see the Join Now page is opened in the same tab