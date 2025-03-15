package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.WebDriverFactory;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());
   // private LoginPage logout = new logout(WebDriverFactory.quitDriver());


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }
    
    @When("I enter firstname")
    public void I_enter_firstname() {
    	loginPage.enterFirstName("azhar");
    }
    
    @When("I enter Lastname")
    public void I_enter_Lastname() {
    	loginPage.enterLastName("ul haq");
    }
    
    @When("I enter address")
    public void I_enter_address() {
    	loginPage.enterAddress("address");
    }
    
    @When("I enter Emailaddress")
    public void i_enter_emailaddress() {
    	loginPage.enterEmailaddress("azhar@123");
    }

    @When("I enter phone")
    public void i_enter_phone() {
    	loginPage.enterPhone("8367307374");
    }

    @When("I select Gender")
    public void i_select_gender() {
    	loginPage.selectGender();
    }

    @When("I select hobbies")
    public void i_select_hobbies() {
    	loginPage.selectHobbies();
    }
    
    @When("I select Languages and skills")
    public void i_select_languages() throws InterruptedException {
    	loginPage.selectLanguages();
    }
    
    @When("I select country")
    public void i_select_country() {
    	loginPage.selectcountry();
    }

    @When("I select year, month, date")
    public void i_select_year_month_date() {
        
    }

    @When("I enter Password")
    public void i_enter_password() {
        
    }

    @When("I enter confirm Password")
    public void i_enter_confirm_password() {
        
    }

    @When("I click submit")
    public void i_click_submit() {
        
    }

    @Then("home page should display")
    public void home_page_should_display() {
        
    }
    

//    @When("I enter username {string} and password {string}")
//    public void i_enter_username_and_password(String username, String password) {
//        loginPage.enterUsername(username);
//        loginPage.enterPassword(password);
//    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
    	loginPage.isLoggedIn();
    }
    
    @Then("The element should display on the home page.")
    public void the_element_should_display_on_the_home_page() {
    	loginPage.checkBackpack();
    }
    
    @Then("I should see the element with xpath {string}")
    public void i_should_see_the_element_with_xpath(String string) {
        
    }
    
  
    
    
    
    
}