package tests;

import helpers.WebDriverContainer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MainPage;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class TestMainPageFooter extends TestBase{
    @Test
    public void goToCreateAccountPageViaFooter(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getCreateAccountFooterButton().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToEN().click();

        String title = mainPage.getTitleTextMainPage().getText();
        assertEquals(title, "Digital learning\n" + "at it’s best");
        String switcherText = mainPage.getLanguageSwitcher().getText();
        assertEquals(switcherText,"EN");
    }
    @Test
    public void translateMainPageToDE(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToDE().click();

        String title = mainPage.getTitleTextMainPage().getText();
        assertEquals(title, "Hol dir das Beste" + "\naus digitalem Lernen");
        String switcherText = mainPage.getLanguageSwitcher().getText();
        assertEquals(switcherText,"DE");
    }
}
