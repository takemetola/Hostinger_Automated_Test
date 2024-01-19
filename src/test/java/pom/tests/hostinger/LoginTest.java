package pom.tests.hostinger;

import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.Locator;
import pom.pages.hostinger.LoginPage;
import pom.tests.TestBase;

public class LoginTest  extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.hostinger.com/");
        LoginPage.clickCookiesDecline();
    }
    @Test
    public void TestLogin(){
        String email = "desire2work4hostinger@gmail.com";
        String password = "testas123";
        String expectedResult = "desire2work4hostinger@gmail.com";
        String actualResult;

        LoginPage.clickOnButtonLogin();
        LoginPage.clickOnButtonLoginWithGmail();
        LoginPage.inputEmailTextbox(email);
        LoginPage.clickOnNext();
        LoginPage.inputPasswordTextbox(password);
        LoginPage.clickOnNext();
        LoginPage.clickOnAccountIcon();

        actualResult = LoginPage.readUserEmail();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
