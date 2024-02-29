package pom.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static boolean waitForElementToBeVisible(int seconds, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator) {

        return getElement(locator).getText();
    }

    public static void doubleClickOnElementByActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .doubleClick(getElement(locator))
                .perform();
    }

    public static void ctrlAAndDelete(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = getElement(locator);
        actions.moveToElement(element).keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND);

        actions.sendKeys(Keys.BACK_SPACE);

        actions.perform();
    }

    public static void scrollWindowByActionsPlus3500Y2() {
        WebDriver driver = Driver.getDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 1800);");
    }
}
