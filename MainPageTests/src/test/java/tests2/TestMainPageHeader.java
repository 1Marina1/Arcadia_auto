package tests2;

import helpers2.ScreenshotListener;
import helpers2.WebDriverContainer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import pages2.MainPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

@Listeners({ScreenshotListener.class})
public class TestMainPageHeader extends TestBase {

    @Test
    public void goToMainPageViaLogo(){

        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getHeaderLogo().click();
        String title = mainPage.getTitleTextMainPage().getText();
        assertEquals(title, "Hol dir das Beste" + "\naus digitalem Lernen");
    }

    @Test
    public void goToAboutUsBlockViaHeader() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getAboutUsHeaderLink().click();
        String currentUrl = WebDriverContainer.getDriver().getCurrentUrl();
        String newUrl;
        do {
            newUrl = WebDriverContainer.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals(currentUrl + "#about-us"));
    }
    @Test
    public void goToMyAccountPageViaHeader(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String loginCardTitle = mainPage.getLoginCardTitle().getText();
        assertEquals(loginCardTitle, "Willkommen bei Arcadia!");
    }
    @Test
    public void goToCreateAccountPageViaHeader(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getOverlay2().click();
        WebDriverWait wait = new WebDriverWait(WebDriverContainer.getDriver(), java.time.Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getCreateAccountHeaderButton()));
        ((JavascriptExecutor) WebDriverContainer.getDriver()).executeScript("arguments[0].click();", element);
        mainPage.getCreateAccountHeaderButton().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String registrationCardTitle = mainPage.getRegistrationCardTitle().getText();
        assertEquals(registrationCardTitle, "Schritt 1:");
    }


}
