package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory; // Import WebDriverFactory

public class orangepage {

    private WebDriver driver;

    private By usernameField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    private By passwordField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    private By loginButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    private By errmsg = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]");
    private By profile = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/span[1]/p[1]");
    private By logout = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[4]/a[1]");
    private By errmsg1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]");
    private By hrmlogo = By.cssSelector("img[alt='company-branding']");
    private By hrlogo = By.cssSelector(".orangehrm-login-slot-wrapper");
    private By loginimg = By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title");

    private By Forgotpassword = By.cssSelector(".oxd-text.oxd-text--p.orangehrm-login-forgot-header");


    



    public orangepage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverFactory.waitForElementToBeVisible(driver, usernameField); // Wait for the username field to be visible
    }

    public void enterUsername_password(String username, String password) {
        WebElement usernameFieldElement = WebDriverFactory.waitForElementToBeVisible(driver, usernameField);
        usernameFieldElement.sendKeys(username);

        WebElement passwordFieldElement = WebDriverFactory.waitForElementToBeVisible(driver, passwordField);
        passwordFieldElement.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = WebDriverFactory.waitForElementToBeClickable(driver, loginButton);
        loginButtonElement.click();

        // Wait for an element to confirm that login was successful, e.g., the profile icon
        //WebDriverFactory.waitForElementToBeVisible(driver, profile); 
    }

    public void homepage() {
        assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    public void backtologinpage() {
        WebElement profileElement = WebDriverFactory.waitForElementToBeVisible(driver, profile);
        profileElement.click();

        WebElement logoutElement = WebDriverFactory.waitForElementToBeClickable(driver, logout);
        logoutElement.click();

        // Wait for the login page title to confirm successful logout
        WebDriverFactory.waitForElementToBeVisible(driver, usernameField); // Wait for the username field to be visible again
        assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    public void error() {
        String errormsg = WebDriverFactory.waitForElementToBeVisible(driver, errmsg).getText();
        assertEquals(errormsg, "Invalid credentials");
    }
    
    public void emptyfielderror() {
        String errormsg = WebDriverFactory.waitForElementToBeVisible(driver, errmsg1).getText();
        assertEquals(errormsg, "Required");
    }
    public void displayhrmlogo() {
    	WebElement hrmlogoElement = WebDriverFactory.waitForElementToBeVisible(driver, hrmlogo);
    	hrmlogoElement.isDisplayed();
        
    }
    
public void displayhrlogo() {
	WebElement hrlogoElement = WebDriverFactory.waitForElementToBeVisible(driver, hrlogo);
	assertTrue(hrlogoElement.isDisplayed());
    }

public void displayloginimg() {
	WebElement loginimgElement = WebDriverFactory.waitForElementToBeVisible(driver, loginimg);
	assertTrue(loginimgElement.isDisplayed());
}

public void displayForgotpassword() {
	WebElement ForgotpasswordElement = WebDriverFactory.waitForElementToBeVisible(driver, Forgotpassword);
	assertTrue(ForgotpasswordElement.isDisplayed());
}
}
