//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.mainPage;

import helpers.ScreenshotListener1;
import helpers.TestBase;
import helpers.WebDriverContainer1;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;

@Listeners({ScreenshotListener1.class})
public class TestMainPageHeader extends TestBase {
    public TestMainPageHeader() {
    }

    @Test
    public void goToMainPageViaLogo() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        mainPage.getHeaderLogo().click();
        String title = mainPage.getTitleTextMainPage().getText();
        Assert.assertEquals(title, "Hol dir das Beste\naus digitalem Lernen");
    }

    @Test
    public void goToAboutUsBlockViaHeader() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        mainPage.getAboutUsHeaderLink().click();
        String currentUrl = WebDriverContainer1.getDriver().getCurrentUrl();

        String newUrl;
        do {
            newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        } while(newUrl.contentEquals(currentUrl + "#about-us"));


    }

    @Test
    public void goToMyAccountPageViaHeader() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String loginCardTitle = mainPage.getLoginCardTitle().getText();
        Assert.assertEquals(loginCardTitle, "Willkommen bei Arcadia!");
    }

    @Test
    public void goToCreateAccountPageViaHeader() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(), MainPage.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getCreateAccountHeaderButton()));
        ((JavascriptExecutor)WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);
        mainPage.getHeaderLogo().click();
        mainPage.getCreateAccountHeaderButton().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
        String registrationCardTitle = mainPage.getRegistrationCardTitle().getText();
        Assert.assertEquals(registrationCardTitle, "Schritt 1:");
    }
}
