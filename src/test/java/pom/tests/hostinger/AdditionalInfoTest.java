package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.hostinger.AdditionalInfoPage;
import pom.pages.hostinger.UpdateProfileNamePage;
import pom.tests.TestBase;

public class AdditionalInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AdditionalInfoPage.openUrl("https://www.hostinger.com/");

        String email = "desire2work4hostinger@gmail.com";
        String password = "Testas123!";

        UpdateProfileNamePage.clickOnButtonLogin();
        UpdateProfileNamePage.inputEmail(email);
        UpdateProfileNamePage.inoutPassword(password);
        UpdateProfileNamePage.clickOnButtonLoginAccount();

        UpdateProfileNamePage.clickOnAccountIcon();
        UpdateProfileNamePage.clickonAccountInfomation();
    }

    @Test
    public void testAddingMoreInfoToProfile() throws InterruptedException {

        String text = "Why did the candidate bring a ladder to the job interview?\n" +
                "\n" + "Because they heard the job description said \"" +
                "looking for someone who can take things to the next level\"!";
        String password = "Testas123!";
        String expectedResult =
                "Why did the candidate bring a ladder to the job interview? " +
                        "Because they heard the job description said " +
                        "\"looking for someone who can take things to the next level\"!";
        String actualResult;

        AdditionalInfoPage.clickOnAdditionalDetailsGroup();
        AdditionalInfoPage.addTextToTextBox(text);
        AdditionalInfoPage.clickOnContinueButtonAdditionlInfoField();
        AdditionalInfoPage.addTextConfirmPassword(password);
        AdditionalInfoPage.clickOnConfirmButton();

        Thread.sleep(2000);
        actualResult = AdditionalInfoPage.readTextMessage();

        Assert.assertEquals(actualResult, expectedResult);

        System.out.println("Actual result: %s \nExpected result: %s".formatted(actualResult,expectedResult));
    }
}
