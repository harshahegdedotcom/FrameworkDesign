package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //private By username = By.xpath("//input[starts-with(@id,'username_')]");
    //private By loginButton = By.xpath("//button[contains(@id,'loginBtn_')]");
    @FindBy(id = "input-email")
    private WebElement usernameField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    public void open(String url) {
        driver.get(url);
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
//    private By productNames = By.cssSelector("h4.product-name");
//    private By addToCartButtons = By.cssSelector("button.add-to-cart");
    // Click Add to Cart for a specific product
//public List<WebElement> getAllProductNames() {
//    return driver.findElements(productNames);
//}

//    public void addProductToCart(String productName) {
//        List<WebElement> names = driver.findElements(productNames);
//        List<WebElement> buttons = driver.findElements(addToCartButtons);
//
//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i).getText().trim();
//            if (name.contains(productName)) {
//                buttons.get(i).click();
//                System.out.println("Added to cart: " + name);
//                break;
//            }
//        }
//    }
//
//    // Get total product count
//    public int getProductCount() {
//        return driver.findElements(productNames).size();
//    }

}
