package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.UserCredentials;
import pom.pages.hostinger.LoginInfo;
import pom.pages.hostinger.LoginPage;
import pom.pages.hostinger.UpdateProfileNamePage;
import pom.tests.TestBase;

public class UpdateProfileNameTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UpdateProfileNamePage.openUrl("https://www.hostinger.com");
        LoginPage.clickCookiesDecline();

        String email = UserCredentials.getEmail();
        String password = UserCredentials.getPassword();

        LoginInfo.login(email, password);
    }

    @DataProvider(name = "testUpdateProfileInfo")
    public static Object[][] provideDataForTestUpdateProfileInfo() {
        return new Object[][]{
                {"Testas123!", "John", "Wick", "John Wick"}
        };
    }

    @Test(dataProvider = "testUpdateProfileInfo")
    public void testUpdateProfileInfo(String password, String firstName, String lastName, String expectedResult) {

        UpdateProfileNamePage.clickOnAccountIcon();
        UpdateProfileNamePage.clickonAccountInfomation();
        UpdateProfileNamePage.clickonNameGroup();
        UpdateProfileNamePage.addTextFirstName(firstName);
        UpdateProfileNamePage.addTextLastName(lastName);
        UpdateProfileNamePage.clickOnButtonContinue();
        UpdateProfileNamePage.addTextConfirmPassword(password);
        UpdateProfileNamePage.clickOnConfirmButton();

        String actualResult;
        actualResult = UpdateProfileNamePage.readTextFullName();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
