package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

    private WebDriver driver;

    	//page object model : 
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By Backpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    
    private By FirstName = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input");
    private By LastName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
    private By Address = By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea");
    private By Emailaddress = By.xpath("//*[@id=\"eid\"]/input");
    private By Phone = By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input");
    private By Gender= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
    private By Hobbies= By.xpath("//*[@id=\"checkbox1\"]");
  
    
    private By Languages1 = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a");

  //*[@id="basicBootstrapForm"]/div[7]/div/multi-select/div[2]/ul/li[6]/a
    //private By Languages1 = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li");

    
    //WebElement Skills = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));

//    private By = By.xpath(""); //*[@id="basicBootstrapForm"]/div[7]/div/multi-select/div[2]/ul/li[1]/a
//
//    private By = By.xpath("");
//
//    private By = By.xpath("");


    private By Languages= By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]");
    private By country= By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]");


    
    

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterEmailaddress(String emailaddress) {
        driver.findElement(Emailaddress).sendKeys(emailaddress);
    }
    
    public void enterPhone(String phone) {
        driver.findElement(Phone).sendKeys(phone);
    }
    
    public void selectGender() {
        driver.findElement(Gender).click();
    }
    
    public void selectHobbies() {
        driver.findElement(Hobbies).click();
    }
    
    public void selectLanguages() throws InterruptedException {   
    	driver.findElement(Languages).click();
    	Thread.sleep(3000);
    	driver.findElement(Languages1).click();
    	Thread.sleep(3000);

    	WebElement skills = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
    	Select dropdown = new Select(skills);

        // Select an option by visible text
        dropdown.selectByVisibleText("Certifications");
        Thread.sleep(9000);


    	//driver.findElement(Languages1).click();
    	
    	
    }
    
    public void selectcountry() {
        driver.findElement(country).click();
    }
    
    public void enterFirstName(String firstName) {
        driver.findElement(FirstName).sendKeys(firstName);
    }
    
    public void enterLastName(String lastName) {
        driver.findElement(LastName).sendKeys(lastName);
    }
    
    public void enterAddress(String address) {
        driver.findElement(Address).sendKeys(address);
    }
    
    public void navigateToLoginPage() {
        driver.get("https://demo.automationtesting.in/Register.html");
        
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(usernameField).clear();

    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void isLoggedIn() {
    	String title=driver.getTitle();
    	System.out.println(title);
        //return driver.findElement(inventoryContainer).isDisplayed();
    	assertEquals(title, "Swag Labs");
    }
    
    public boolean checkBackpack() {
    	return driver.findElement(Backpack).isDisplayed();
        
    }
    
    
    
}