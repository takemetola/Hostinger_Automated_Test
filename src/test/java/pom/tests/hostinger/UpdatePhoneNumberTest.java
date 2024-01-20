package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.hostinger.UpdatePhoneNumberPage;
import pom.pages.hostinger.UpdateProfileNamePage;
import pom.tests.TestBase;

public class UpdatePhoneNumberTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UpdatePhoneNumberPage.openUrl("https://www.hostinger.com/");
        UpdateProfileNamePage.clickOnButtonLogin();

        String email = "desire2work4hostinger@gmail.com";
        String password = "Testas123!";

        UpdateProfileNamePage.inputEmail(email);
        UpdateProfileNamePage.inoutPassword(password);
        UpdateProfileNamePage.clickOnButtonLoginAccount();

        UpdateProfileNamePage.clickOnAccountIcon();
        UpdateProfileNamePage.clickonAccountInfomation();
    }

    @DataProvider(name = "testUpdatePhoneNumber")
    public static Object[][] provideDataForTestUpdatePhoneNumber() {
        return new Object[][]{
                {"123123", "Testas123!", "+370 123123"}
        };
    }

    @Test(dataProvider = "testUpdatePhoneNumber")
    public void testUpdatePhoneNumber(String phoneNumber, String password, String expectedResult) throws InterruptedException {
        String actualResult;

        UpdatePhoneNumberPage.clickOnPhoneNumberGroup();
        Thread.sleep(3000);
        UpdatePhoneNumberPage.addPhoneNumber(phoneNumber);
        UpdatePhoneNumberPage.clickOnContinueButton();
        UpdatePhoneNumberPage.addTextConfirmPassword(password);
        UpdatePhoneNumberPage.clickOnConfirmButton();

        actualResult = UpdatePhoneNumberPage.readPhoneNumber();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
