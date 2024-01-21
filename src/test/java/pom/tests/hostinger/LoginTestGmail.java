package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.hostinger.LoginPage;
import pom.tests.TestBase;

public class LoginTestGmail extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.hostinger.com/");
        LoginPage.clickCookiesDecline();
    }
    @DataProvider(name = "testLogin")
    public static Object[][] provideDataForTestLogin() {
        return new Object[][]{
                {"desire2work4hostinger@gmail.com", "testas123", "desire2work4hostinger@gmail.com"}
        };
    }

    @Test(dataProvider = "testLogin")
    public void testLogin(String email, String password, String expectedResult){
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
