package stepdefinitions;

import io.cucumber.java.en.*;
import pages.Homepage;
import utils.WebDriverFactory;

public class Homestep {
	Homepage hp=new Homepage(WebDriverFactory.getDriver());
	
//	@When("I click on admin button")
//	public void i_click_on_admin_button() {
//	    hp.clickadminicon();
//	}

	@Then("I should see Admin Text")
	public void i_should_see_admin_text() {
	    hp.displayadmintext();
	}
	@Then("I should see PIM")
	public void i_should_see_pim() {
	    hp.displayPIM();
	}

	@Then("I should see leave")
	public void i_should_see_leave() {
	    hp.leavedisplay();
	}

	@Then("I should see time")
	public void i_should_see_time() {
	    hp.timedisplay();
	}

	@Then("I should see Recruitment")
	public void i_should_see_recruitment() {
	    
	}

	@Then("I should see myinfo")
	public void i_should_see_myinfo() {
	    hp.myinfodisplay();
	}

	@Then("I should see Performance")
	public void i_should_see_performance() {
	    hp.Performancedisplay();
	}
	@Then("I should see dashboard")
	public void i_should_see_dashboard() {
	    hp.Dashboarddisplay();
	}

	@Then("I should see directory")
	public void i_should_see_directory() {
	    hp.Directorydisplay();
	}

	@Then("I should see maintainence")
	public void i_should_see_maintainence() {
	    hp.maintainancedisplay();
	}

	@Then("I should see claim")
	public void i_should_see_claim() {
	    hp.claimdisplay();
	}

	@Then("I should see buzz")
	public void i_should_see_buzz() {
	    hp.buzzdisplay();
	}

}
