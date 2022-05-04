package tests;

import helpers.ScreenshotListener;
import helpers.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

    @Listeners({ScreenshotListener.class})
    public class TestBase {
        protected WebDriver driver = WebDriverContainer.initDriver();
        protected String baseUrl = "https://arcadia.study/de/";

        @BeforeTest
        public void setup() {
            WebDriverContainer.getDriver().get(baseUrl);
            System.out.println(WebDriverContainer.getDriver().getCurrentUrl());
        }

        @AfterTest
        public void tearDown(){
            WebDriverContainer.closeDriver();
        }

}
