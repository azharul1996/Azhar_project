package stepdefinitions;

import io.cucumber.java.en.*;
import pages.orangepage;
import utils.WebDriverFactory;

public class orangesteps {
	
    private orangepage op = new orangepage(WebDriverFactory.getDriver());

	
	@Given("I am on the OrangeHRM login page")
    public void i_am_on_the_orangehrm_login_page() throws InterruptedException {
        // Initialize WebDriver and open the OrangeHRM login page
		op.navigateToLoginPage();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) throws InterruptedException {
        // Enter username and password
    	op.enterUsername_password(username, password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
        // Click the login button
    	op.clickLoginButton();
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
    	op.homepage();
        
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedErrorMessage) {
        // Verify the error message 
    	op.error();
    }
    @Then("Go back to the login page")
    public void go_back_to_the_login_page() throws InterruptedException {
        op.backtologinpage();
    }
    
    @Then("I should see an error message {string} below text boxes")
    public void i_should_see_an_error_message_below_text_boxes(String string) {
        op.emptyfielderror();
    }
    
    @And("I see hrm logo")
    public void i_see_hrm_logo() {
        // Implementation to verify the HRM logo is displayed
    	op.displayhrlogo();
    }

    @And("I see hr for all logo")
    public void i_see_hr_for_all_logo() {
        // Implementation to verify the "HR for All" logo is displayed
    	op.displayhrlogo();
    }

    @And("I see Login")
    public void i_see_login() {
        // Implementation to verify the "Login" text is displayed
    	op.displayloginimg();
    }

    @And("I see Forgot your password?")
    public void i_see_forgot_your_password() {
        // Implementation to verify the "Forgot your password?" link is displayed
    	op.displayForgotpassword();
    }
}


