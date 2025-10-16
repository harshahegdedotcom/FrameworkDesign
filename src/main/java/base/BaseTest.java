package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;
import utils.JSONTestDataReader;

public class BaseTest {
    protected WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        String env = System.getProperty("environment", "qa"); // default to QA
        ConfigReader.loadConfig(env);
        JSONTestDataReader.loadData(env);
        driver.get(ConfigReader.get("base.url"));
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
