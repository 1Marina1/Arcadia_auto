package tests;

import helpers.WebDriverContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ParentDashboard;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestLogInOutToParent extends TestBase{
    @FindBy(css = "#mat-input-0")
    private WebElement emailInputLocator;

    @FindBy(css = "#mat-input-1")
    private WebElement passwordInputLocator;

    @FindBy(css = "button[type='submit']")
    private WebElement logInButton;

    @FindBy(css = ".cdk-overlay-container")
    private WebElement logInErrorMessage;


    public WebElement getEmailInputLocator() {
        return emailInputLocator;
    }

    public WebElement getPasswordInputLocator() {
        return passwordInputLocator;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getLogInErrorMessage(){
        return logInErrorMessage;
    }


    public void attemptLogin(String email, String password){
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer.getDriver(),
                TestLogInOutToParent.class);
        logInToParent.getEmailInputLocator().sendKeys(email);
        logInToParent.getPasswordInputLocator().sendKeys(password);
        logInToParent.getLogInButton().click();

    }
    @Test
    public void invalidLogIn(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer.getDriver(),
                TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgr", "zmxncbv12344321");
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String errorMessage = logInToParent.getLogInErrorMessage().getText();
        assertEquals(errorMessage, "Falsches Login oder Passwort.\nclose");
        WebDriverContainer.getDriver().navigate().refresh();

    }
    @Test
    public void testLogInProcess(){
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer.getDriver(),
                TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgroup.eu", "zmxncbv12344321");
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),
                ParentDashboard.class);
        String dashboardLoggedIn = parentDashboard.getDashboardTitle().getText();
        assertEquals(dashboardLoggedIn, "Dashboard");
    }
    @Test//run together as class
    public void testLogOutProcess(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),
                ParentDashboard.class);
        parentDashboard.getLogoutButton().click();
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        Assert.assertTrue(mainPage.getPictureWithChildren().isDisplayed());

        WebDriverContainer.closeDriver();
    }


}
