package login;

import base.BaseTest;
import model.User;
import model.User1;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void verifyValidLogin() {
        User1 user = new User1("admin", "password123");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open("https://example.com/login");
        loginPage.login(user.username(), user.password());

        System.out.println("Login test executed successfully for user: " + user.username());
    }

}
