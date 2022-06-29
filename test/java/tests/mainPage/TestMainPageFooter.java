
package tests.mainPage;

import helpers.ScreenshotListener1;
import helpers.TestBase;
import helpers.WebDriverContainer1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;

@Listeners({ScreenshotListener1.class})
public class TestMainPageFooter extends TestBase{
    @Test
    public void goToCreateAccountPageViaFooter(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        mainPage.getCreateAccountFooterButton().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        String registrationCardTitle = mainPage.getRegistrationCardTitle().getText();
        Assert.assertEquals(registrationCardTitle, "Schritt 1:");

    }
    @Test
    public void goToInstagramViaFooterIcon() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        mainPage.getInstagramFooterIcon().click();
        String newUrl;
        do {
            newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals("https://www.instagram.com/arcadia.study/"));
    }
    @Test
    public void goToInstagramViaSubscribeToInstagramButton() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        mainPage.getSubscribeToInstagramButton().click();
        String newUrl;
        do {
            newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals("https://www.instagram.com/arcadia.study/"));
    }
    @Test
    public void goToImpressum(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        mainPage.getImpressum().click();
        String impressumPageTitle = mainPage.getImpressumPageTitle().getText();
        Assert.assertEquals(impressumPageTitle, "Impressum Arcadia");
    }
    @Test
    public void goToDatenschutz(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        mainPage.getDatenschutz().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String datenschutzPageTitle = mainPage.getDatenschutzPageTitle().getText();
        Assert.assertEquals(datenschutzPageTitle, "Datenschutz auf einen Blick");
    }
    @Test(priority = 1)
    public void translateMainPageToEN(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), java.time.Duration.ofSeconds(10));
        WebDriverWait wait2 = new WebDriverWait(WebDriverContainer1.getDriver(), java.time.Duration.ofSeconds(10));
        Actions action = new Actions(WebDriverContainer1.getDriver());
        mainPage.getLanguageSwitcher().click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getLanguageSwitcherToEN()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);

        String newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
        Assert.assertTrue(newUrl.contains("https://arcadia.study/en"));
        String switcherText = mainPage.getLanguageSwitcher().getText();
        Assert.assertEquals(switcherText,"EN");
        mainPage.getHeaderLogo().click();
    }
    @Test(priority = 2)
    public void translateMainPageToDE() {
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        mainPage.getLanguageSwitcher().click();
        WebDriverWait wait = new WebDriverWait(WebDriverContainer1.getDriver(), java.time.Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getLanguageSwitcherToDE()));
        ((JavascriptExecutor) WebDriverContainer1.getDriver()).executeScript("arguments[0].click();", element);
        String newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
        Assert.assertTrue(newUrl.contains("https://arcadia.study/de"));
        String switcherText = mainPage.getLanguageSwitcher().getText();
        Assert.assertEquals(switcherText,"DE");
        mainPage.getHeaderLogo().click();
        mainPage.getLanguageSwitcher().click();
    }
}