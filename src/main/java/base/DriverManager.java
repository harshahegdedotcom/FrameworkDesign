package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;

    // Prevent direct Instaniation
    private DriverManager() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.createDriver(System.getProperty("browser", "chrome"));
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
