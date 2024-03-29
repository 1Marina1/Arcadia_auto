package helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverContainer {

    private static WebDriver driver;

    public static WebDriver initDriver(){
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return null;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
    }
}
