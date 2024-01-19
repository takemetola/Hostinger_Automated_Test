package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.hostinger.LoginPage;
import pom.pages.hostinger.UpdateProfileInfoPage;
import pom.tests.TestBase;

public class UpdateProfileInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UpdateProfileInfoPage.openUrl("https://www.hostinger.com");
        LoginPage.clickCookiesDecline();
    }
    @Test
    public void testUpdateProfileInfo() throws InterruptedException {

        String email = "desire2work4hostinger@gmail.com";
        String password = "Testas123!";
        String firstName = "John";
        String lastName = "Wick";
        String phoneNumber = "123123";
        String text = "I hope you're having a great day so far! Cheers.";

        UpdateProfileInfoPage.clickOnButtonLogin();
        UpdateProfileInfoPage.inputEmail(email);
        UpdateProfileInfoPage.inoutPassword(password);
        UpdateProfileInfoPage.clickOnButtonLoginAccount();

        UpdateProfileInfoPage.clickOnAccountIcon();
        UpdateProfileInfoPage.clickonAccountInfomation();
        UpdateProfileInfoPage.clickonNameGroup();
        UpdateProfileInfoPage.addTextFirstName(firstName);
        UpdateProfileInfoPage.addTextLastName(lastName);
        UpdateProfileInfoPage.clickonButtonContinue();
        UpdateProfileInfoPage.addTextConfirmPassword(password);
        UpdateProfileInfoPage.clickOnConfirmButton();

        Thread.sleep(5000);
        UpdateProfileInfoPage.clickOnPhoneNumberGroup();
        UpdateProfileInfoPage.addPhoneNumber(phoneNumber);
        UpdateProfileInfoPage.clickOnContinueButton();
        UpdateProfileInfoPage.addTextConfirmPassword(password);
        UpdateProfileInfoPage.clickOnConfirmButton();

        Thread.sleep(5000);
        UpdateProfileInfoPage.clickOnAdditionalDetailsGroup();
        UpdateProfileInfoPage.addTextToTextBox(text);
        UpdateProfileInfoPage.clickOnContinueButtonAdditionlInfoField();
        UpdateProfileInfoPage.addTextConfirmPassword(password);
        UpdateProfileInfoPage.clickOnConfirmButton();




        String expectedResult = "";
        String actualResult;
        actualResult = "";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
