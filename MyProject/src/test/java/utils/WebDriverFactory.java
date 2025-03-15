package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebDriverFactory {

    private static WebDriver driver;

    // Singleton design pattern: This ensures only one WebDriver instance is created.
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azhar Ul Haq\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {  // If driver is already running
            driver.quit(); // Quit the driver
            driver = null;
        }
    }

    // Utility function to wait for an element to be visible
    public static WebElement waitForElementToBeVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Utility function to wait for an element to be clickable
    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
