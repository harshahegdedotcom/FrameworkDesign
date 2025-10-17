package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ("//div[@id='search']//input"))
    private WebElement searchInput;

    @FindBy(xpath = "//div[@id='search']//button")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@title='Shopping Cart']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//div[contains(@class,'product-thumb')]")
    List<WebElement> productList;

    public void clickSearchButton(String productName) {
        searchInput.sendKeys(productName);
        searchButton.click();
    }

    public void AddToCart() {
        for (int i = 1; i <= productList.size(); i++) {

            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
            String addToCartXPath = "(//div[@class='product-thumb'])[" + i + "]//button[contains(@onclick,'cart.add')]";
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addToCartXPath)));
           ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);

        }
        shoppingCartLink.click();
    }

    public void NavigateToSearchPage(String url) {
        driver.get(url);
    }
}
