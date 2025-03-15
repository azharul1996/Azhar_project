Feature: OrangeHRM Login Functionality

  Scenario: Successful login with valid credentials
    Given I am on the OrangeHRM login page
    When I enter username "Admin" and password "admin123"
    And I click the login button
    Then I should be redirected to the dashboard
    Then Go back to the login page 

  Scenario: Failed login with invalid username
    Given I am on the OrangeHRM login page
    When I enter username "invaliduser" and password "admin123"
    And I click the login button
    Then I should see an error message "Invalid credentials"

  Scenario: Failed login with invalid password
    Given I am on the OrangeHRM login page
    When I enter username "Admin" and password "wrongpassword"
    And I click the login button
    Then I should see an error message "Invalid credentials"

  Scenario: Failed login with empty username and password
    Given I am on the OrangeHRM login page
    When I enter username "" and password ""
    And I click the login button
    Then I should see an error message "Required" below text boxes
     
    Scenario: Validating logos and text 
    Given I am on the OrangeHRM login page
    And I see hrm logo
    And I see hr for all logo
    And I see Login
    And I see Forgot your password?