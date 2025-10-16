package Tests.Login;

import base.BaseTest;
import model.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.JSONTestDataReader;

public class LoginTest extends BaseTest {
    @Test
    public void verifyValidLogin() throws InterruptedException {
        //Reading test data from JSON file
        //User user = new User(JSONTestDataReader.get("username"), JSONTestDataReader.get("password"));
        User user = new User(ConfigReader.get("username"), ConfigReader.get("password"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user.username(), user.password());

        System.out.println("Login test executed successfully for user: " + user.username());

        Thread.sleep(5000);
    }
}
