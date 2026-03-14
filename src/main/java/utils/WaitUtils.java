package utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private WebDriver driver;
    private static WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        WaitUtils.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ IMPORTANT
    }
    public static void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    // Wait for title
    public static void waitForTitleContains(String title) {
        wait.until(ExpectedConditions.titleContains(title));
    }

    // Wait for URL
    public static void waitForUrlContains(String url) {
        wait.until(ExpectedConditions.urlContains(url));
    }
    public static void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
