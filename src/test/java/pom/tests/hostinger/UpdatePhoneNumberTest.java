package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.hostinger.UpdatePhoneNumberPage;
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
    @Test
    public void testUpdatePhoneNumber() throws InterruptedException {
        String phoneNumber = "123123";
        String password = "Testas123!";
        String expectedResult = "+370 123123";
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
