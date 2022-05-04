package tests;

import helpers.WebDriverContainer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Configuration.pageLoadTimeout;
import static org.testng.Assert.assertEquals;

public class TestParentDashboard extends LogInOutBase{
    @Test
    public void goToDashboardViaLeftMenu(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getDashboardLeftMenu().click();
        String dashboardTitle = parentDashboard.getDashboardTitle().getText();
        assertEquals(dashboardTitle, "Dashboard");
    }
    @Test
    public void goToStatisticsViaLeftMenu(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getStatistikLeftMenu().click();

        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer.getDriver(), StatisticsPage.class);
        String statisticsTitle = statisticsPage.getStatisticsTitle().getText();
        assertEquals(statisticsTitle, "Statistik");
    }

    //@Test
    public void checkProgressBarColors() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getStatistikLeftMenu().click();
        parentDashboard.getDashboardLeftMenu().click();
        parentDashboard.getStatistikLeftMenu().click();
        parentDashboard.getDashboardLeftMenu().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String script = "return window.getComputedStyle(document.querySelector('body > app-root > app-layout-parent > div > div:nth-child(2) > main > app-parent-dashboard > div.pr-3.pl-3.pl-md-0.pr-md-0.ng-star-inserted > div:nth-child(1) > div > div.col-md-6.col-7.p-0 > div:nth-child(2) > div > div:nth-child(2) > mat-progress-bar > div > div.mat-progress-bar-primary.mat-progress-bar-fill.mat-progress-bar-element'),':after').getPropertyValue('background-color')";
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) WebDriverContainer.getDriver();
        String barColor = (String) js.executeScript(script);
            assertEquals(barColor, "rgb(63, 81, 181)");// change color here

    }
    @Test
    public void goToDashboardViaLogo(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getDashboardLogo().click();
        String title = parentDashboard.getDashboardTitle().getText();
        assertEquals(title, "Dashboard");
    }
    @Test
    public void goToSettingsRightMenu(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getSettingRightMenu().click();
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer.getDriver(), SettingsPage.class);
        String title = settingsPage.getSettingsTitle().getText();
        assertEquals(title, "Einstellungen");
    }
    @Test
    public void goToCartRightMenu(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getCartRightMenu().click();
        CartPage cartPage = PageFactory.initElements(WebDriverContainer.getDriver(), CartPage.class);
        String title = cartPage.getCartTitle().getText();
        assertEquals(title,"Warenkorb");
    }
    //@Test
    public void checkAvatarsWhenDropDown(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        parentDashboard.getParentNameContainingKids().click();
        parentDashboard.getParentNameContainingKids().click();
        Assert.assertTrue(parentDashboard.getSvgKristinaAvatar().isDisplayed()); //svg of children is not yet displayed
    }
    @Test
    public void translateMainPageToEN(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToEN().click();

        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);

        String title = parentDashboard.getLogoutButton().getText();
        assertEquals(title, "Logout");
        String switcherText = mainPage.getLanguageSwitcher().getText();
        assertEquals(switcherText,"EN");
    }
    @Test
    public void translateMainPageToDE(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getLanguageSwitcher().click();
        mainPage.getLanguageSwitcherToDE().click();
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);

        String title = parentDashboard.getLogoutButton().getText();
        assertEquals(title, "Abmelden");
        String switcherText = mainPage.getLanguageSwitcher().getText();
        assertEquals(switcherText,"DE");
    }
}
