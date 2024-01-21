package pom.pages.hostinger;

public class LoginInfo {
    public static void login(String email, String password) {
        UpdateProfileNamePage.clickOnButtonLogin();
        UpdateProfileNamePage.inputEmail(email);
        UpdateProfileNamePage.inoutPassword(password);
        UpdateProfileNamePage.clickOnButtonLoginAccount();
    }
}
