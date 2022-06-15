package tests2;

import helpers2.ScreenshotListener;
import helpers2.WebDriverContainer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages2.MainPage;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

@Listeners({ScreenshotListener.class})
public class TestMainPageFooter extends TestBase{
    @Test
    public void goToCreateAccountPageViaFooter(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getCreateAccountFooterButton().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        String registrationCardTitle = mainPage.getRegistrationCardTitle().getText();
        assertEquals(registrationCardTitle, "Schritt 1:");

    }
    @Test
    public void goToInstagramViaFooterIcon() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getInstagramFooterIcon().click();
        String newUrl;
        do {
            newUrl = WebDriverContainer.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals("https://www.instagram.com/arcadia.study/"));
    }
    @Test
    public void goToInstagramViaSubscribeToInstagramButton() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getSubscribeToInstagramButton().click();
        String newUrl;
        do {
            newUrl = WebDriverContainer.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals("https://www.instagram.com/arcadia.study/"));
    }
    @Test
    public void goToImpressum(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getImpressum().click();
        String impressumPageTitle = mainPage.getImpressumPageTitle().getText();
        assertEquals(impressumPageTitle, "Impressum Arcadia");
    }
    @Test
    public void goToDatenschutz(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getDatenschutz().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String datenschutzPageTitle = mainPage.getDatenschutzPageTitle().getText();
        assertEquals(datenschutzPageTitle, "Datenschutz auf einen Blick");
    }
    @Test
    public void translateMainPageToEN(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);

        WebDriverWait wait = new WebDriverWait(WebDriverContainer.getDriver(), java.time.Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getLanguageSwitcherToEN()));
        ((JavascriptExecutor) WebDriverContainer.getDriver()).executeScript("arguments[0].click();", element);
        String newUrl = WebDriverContainer.getDriver().getCurrentUrl();
        Assert.assertTrue(newUrl.contains("https://arcadia.study/en"));
        String switcherText = mainPage.getLanguageSwitcher().getText();
        assertEquals(switcherText,"EN");
        mainPage.getLanguageSwitcher().click();
        ((JavascriptExecutor) WebDriverContainer.getDriver()).executeScript("arguments[0].click();",
                mainPage.getLanguageSwitcherToDE());
        WebDriverWait wait2 = new WebDriverWait(WebDriverContainer.getDriver(), java.time.Duration.ofSeconds(10));
        WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(mainPage.getLanguageSwitcher()));
        ((JavascriptExecutor) WebDriverContainer.getDriver()).executeScript("arguments[0].click();",
                mainPage.getLanguageSwitcher());
        Actions action = new Actions(WebDriverContainer.getDriver());
        action.moveToElement(mainPage.getLanguageSwitcher()).doubleClick().perform();
        mainPage.getOverlay().click();
        mainPage.getHeaderLogo().click();
    }
   @Test
    public void translateMainPageToDE() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getLanguageSwitcher().click();
        WebDriverWait wait = new WebDriverWait(WebDriverContainer.getDriver(), java.time.Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getLanguageSwitcherToDE()));
        ((JavascriptExecutor) WebDriverContainer.getDriver()).executeScript("arguments[0].click();", element);
        String newUrl = WebDriverContainer.getDriver().getCurrentUrl();
        Assert.assertTrue(newUrl.contains("https://arcadia.study/de"));
        String switcherText = mainPage.getLanguageSwitcher().getText();
        assertEquals(switcherText,"DE");
        mainPage.getHeaderLogo().click();
        mainPage.getLanguageSwitcher().click();
    }
}
