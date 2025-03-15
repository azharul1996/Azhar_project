Feature: OrangeHRM homepage Functionality

  Scenario: adminpage validation
    Given I am on the OrangeHRM login page
    When I enter username "Admin" and password "admin123"
    And I click the login button
    Then I should be redirected to the dashboard
    #When I click on admin button 
    Then I should see Admin Text 
    Then I should see PIM
    Then I should see leave
    Then I should see time
    Then I should see Recruitment
    Then I should see myinfo
    Then I should see Performance
    Then I should see dashboard
    Then I should see directory
    Then I should see maintainence
    Then I should see claim
    Then I should see buzz