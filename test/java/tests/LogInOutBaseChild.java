package tests;

import helpers.ScreenshotListener;
import helpers.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;
import pages.ChildDashboard;
import pages.MainPage;
import pages.ParentDashboard;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
@Listeners({ScreenshotListener.class})
public class LogInOutBaseChild {
    protected WebDriver driver = WebDriverContainer.initDriver();
    protected String baseUrl = "https://arcadia.study/de/";

    @BeforeTest
    public void logIn(){
        WebDriverContainer.getDriver().get(baseUrl);
        System.out.println(WebDriverContainer.getDriver().getCurrentUrl());
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer.getDriver(),
                TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgroup.eu", "zmxncbv12344321");
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),
                ParentDashboard.class);
        String dashboardLoggedIn = parentDashboard.getDashboardTitle().getText();
        assertEquals(dashboardLoggedIn, "Dashboard");
        parentDashboard.getLinkToKristinaKidsAccount().click();
    }

    @AfterTest
    public void logOutAndTearDown(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer.getDriver(), ChildDashboard.class);
        childDashboard.getLogOutButtonChildDashboard().click();
        MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);

        Assert.assertTrue(mainPage.getPictureWithChildren().isDisplayed());

        WebDriverContainer.closeDriver();
    }

}
