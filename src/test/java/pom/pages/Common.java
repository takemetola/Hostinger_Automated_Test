package pom.pages;

import pom.utils.Driver;

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

    public static void setUpChrome(int durationOfSeconds) {
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }
}
