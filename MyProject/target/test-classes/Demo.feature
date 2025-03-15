@skip
Feature: Automation Demo Site login
  @tag1
  Scenario: validating login page
    Given I am on the login page
    When I enter firstname
    When I enter Lastname
    When I enter address
    When I enter Emailaddress
    When I enter phone
    When I select Gender
    When I select hobbies
    When I select Languages and skills
    When I select country
    When I select year, month, date
    When I enter Password
    When I enter confirm Password
    When I click submit
    Then home page should display


