package tests;

import helpers.ScreenshotListener1;
import helpers.WebDriverContainer1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.ChildDashboard;
import pages.MainPage;
import pages.ParentDashboard;
import tests.TestLogInOutToParent;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
@Listeners({ScreenshotListener1.class})
public class LogInOutBaseChild {
    protected WebDriver driver = WebDriverContainer1.initDriver();
    protected String baseUrl = "https://arcadia.study/de/";

    @BeforeTest
    public void logIn(){
        WebDriverContainer1.getDriver().switchTo().newWindow(WindowType.WINDOW);
        WebDriverContainer1.getDriver().get(baseUrl);

        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
        //mainPage.getHeaderLogo().click();
        mainPage.getMyAccountHeaderLink().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        TestLogInOutToParent logInToParent = PageFactory.initElements(WebDriverContainer1.getDriver(),
                TestLogInOutToParent.class);
        logInToParent.attemptLogin("marina.veremchuk@northitgroup.eu", "zmxncbv12344321");
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(),
                ParentDashboard.class);
        String dashboardLoggedIn = parentDashboard.getDashboardTitle().getText();
        assertEquals(dashboardLoggedIn, "Dashboard");
        parentDashboard.getLinkToKristinaKidsAccount().click();
    }

    @AfterTest
    public void logOutAndTearDown(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        childDashboard.getLogOutButtonChildDashboard().click();
        MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);

        Assert.assertTrue(mainPage.getPictureWithChildren().isDisplayed());

        WebDriverContainer1.closeDriver();
    }

}
