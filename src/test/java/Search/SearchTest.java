package Search;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.time.Duration;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchFunctionality() throws InterruptedException
    {
        String productName = "ip";

        SearchPage searchPage = new SearchPage(driver);
        searchPage.NavigateToSearchPage("https://tutorialsninja.com/demo/");
        searchPage.clickSearchButton(productName);
        searchPage.AddToCart();
        Thread.sleep(5000);
    }

}
