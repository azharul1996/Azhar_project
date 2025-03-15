@skip
Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given I am on the login page
    #When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    Then I should be logged in successfully
    
    Scenario: Successful login with valid credentials
    Given I am on the login page
    #When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    Then I should be logged in successfully
    And The element should display on the home page.
    And I should see the element with xpath "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div"
    
    