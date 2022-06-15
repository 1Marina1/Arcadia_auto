package tests2;

import helpers2.ScreenshotListener;
import helpers2.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages2.MainPage;

@Listeners({ScreenshotListener.class})
    public class TestBase {
        protected WebDriver driver = WebDriverContainer.initDriver();
        protected String baseUrl = "https://arcadia.study/de/";

       @BeforeTest
        public void setup() {
            WebDriverContainer.getDriver().switchTo().newWindow(WindowType.WINDOW);
            WebDriverContainer.getDriver().get(baseUrl);
            System.out.println(WebDriverContainer.getDriver().getCurrentUrl());
            MainPage mainPage = PageFactory.initElements(WebDriverContainer.getDriver(),MainPage.class);
            mainPage.getHeaderLogo().click();
        }
        @AfterTest
        public void tearDown(){
            WebDriverContainer.closeDriver();
        }

}
