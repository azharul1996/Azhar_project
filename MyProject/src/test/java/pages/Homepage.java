package pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebDriverFactory;

public class Homepage {
	
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
   // private By adminicon = By.xpath("//a[@class='oxd-main-menu-item active']//span[1]");
    private By admintext = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    private By PIM = By.xpath("//a[normalize-space()='']");
    private By leave = By.xpath("//a[normalize-space()='']");
    private By time = By.xpath("//a[normalize-space()='']");
    private By Recruitment = By.xpath("//a[@class='oxd-main-menu-item active']");

    private By myinfo = By.xpath("//a[@class='oxd-main-menu-item active']");

    private By Performance = By.xpath("//a[@class='oxd-main-menu-item active']");
    private By Dashboard = By.xpath("//a[@class='oxd-main-menu-item active']");
    private By Directory = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Directory']");

    private By maintainance  = By.xpath("//a[normalize-space()='']");

    private By claim = By.xpath("//a[@class='oxd-main-menu-item active']");
    private By buzz  = By.xpath("//a[@class='oxd-main-menu-item active']");





    
//    public void clickadminicon() {
//        WebElement adminiconElement = WebDriverFactory.waitForElementToBeClickable(driver, adminicon);
//        adminiconElement.click();
//}
    public void displayadmintext() {
    	WebElement hrmlogoElement = WebDriverFactory.waitForElementToBeVisible(driver, admintext);
    	assertTrue(hrmlogoElement.isDisplayed());
    	//assertFalse(hrmlogoElement.isDisplayed());
    }
    public void displayPIM() {
    	WebElement PIMElement = WebDriverFactory.waitForElementToBeVisible(driver,PIM );
    	assertTrue(PIMElement.isDisplayed());
    	
    }
    public void leavedisplay() {
    	WebElement leaveElement = WebDriverFactory.waitForElementToBeVisible(driver,leave );
    	assertTrue(leaveElement.isDisplayed());
    	
    }
    public void timedisplay() {
    	WebElement timeElement = WebDriverFactory.waitForElementToBeVisible(driver,time );
    	assertTrue(timeElement.isDisplayed());
    	
    }
    public void Recruitmentdisplay() {
    	WebElement RecruitmentElement = WebDriverFactory.waitForElementToBeVisible(driver,Recruitment );
    	assertTrue(RecruitmentElement.isDisplayed());
    	
    }
    public void myinfodisplay() {
    	WebElement myinfoElement = WebDriverFactory.waitForElementToBeVisible(driver,myinfo );
    	assertTrue(myinfoElement.isDisplayed());
    	
    }
    public void Performancedisplay() {
    	WebElement PerformanceElement = WebDriverFactory.waitForElementToBeVisible(driver,Performance );
    	assertTrue(PerformanceElement.isDisplayed());
    	
    }
    public void Dashboarddisplay() {
    	WebElement DashboardElement = WebDriverFactory.waitForElementToBeVisible(driver,Dashboard );
    	assertTrue(DashboardElement.isDisplayed());
    	
    }
    public void Directorydisplay() {
    	WebElement DirectoryElement = WebDriverFactory.waitForElementToBeVisible(driver,Directory );
    	assertTrue(DirectoryElement.isDisplayed());
    	
    }
    public void maintainancedisplay() {
    	WebElement maintainanceElement = WebDriverFactory.waitForElementToBeVisible(driver,maintainance );
    	assertTrue(maintainanceElement.isDisplayed());
    	
    }
    public void claimdisplay() {
    	WebElement claimElement = WebDriverFactory.waitForElementToBeVisible(driver, claim);
    	assertTrue(claimElement.isDisplayed());
    	
    }
    public void buzzdisplay() {
    	WebElement buzzElement = WebDriverFactory.waitForElementToBeVisible(driver,buzz );
    	assertTrue(buzzElement.isDisplayed());
    	
    }
}
