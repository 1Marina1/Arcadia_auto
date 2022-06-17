package tests;

import helpers.ScreenshotListener1;
import helpers.WebDriverContainer1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.MainPage;

@Listeners({ScreenshotListener1.class})
    public class TestBase {
        protected WebDriver driver = WebDriverContainer1.initDriver();
        protected String baseUrl = "https://arcadia.study/de/";

       @BeforeTest
        public void setup() {
            WebDriverContainer1.getDriver().switchTo().newWindow(WindowType.WINDOW);
            WebDriverContainer1.getDriver().get(baseUrl);
            System.out.println(WebDriverContainer1.getDriver().getCurrentUrl());
            MainPage mainPage = PageFactory.initElements(WebDriverContainer1.getDriver(),MainPage.class);
            mainPage.getHeaderLogo().click();
        }
        @AfterTest
        public void tearDown(){
            WebDriverContainer1.closeDriver();
        }

}
