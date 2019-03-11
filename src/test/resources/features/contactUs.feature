Feature: Verify that ContactUs page is working as expected

  Background:
    Given I navigate to the Contact page
    And I should see the Contact page title

  Scenario Outline: Test that validation message are displaying correct with Invalid data in the Contact page
    And I enter Invalid contact <Name> <Email> <Message> details in the Contact page
    When I submit the contact details
    Then I should see the Contact Page Validation message <Type>
    Examples:
      | Name | Email      | Message | Type    |
      |      |            |         | Name    |
      | Hi   |            |         | email1  |
      | Hi   | hello      | hello   | email2  |
      | Hi   | hello@     | hello   | email3  |
      | Hi   | hello@test |         | message |
@wip
  Scenario Outline: Test that User is able to submit the form Successfully
    And I enter Valid contact <Name> <Email> <Message> details in the Contact page
    When I submit the contact details
    Then I should see the Contact Page Success message
    Examples:
      | Name | Email          | Message      |
      | Hi   | hello@test.com | Test Message |

  Scenario: Test that Cookie Notification message is displayed correctly
    Then I should see the Cookie Notification message
    When I click on the Privacy Policy link
    Then the Privacy Policy page should be opened in the same tab


