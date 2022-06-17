package tests;

import helpers.WebDriverContainer1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.ParentDashboard;
import pages.StatisticsPage;


import static org.testng.Assert.assertEquals;

public class TestStatisticsPage extends LogInOutBase{
 //   @Test
    public void switchBetweenChildren(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),StatisticsPage.class);

        parentDashboard.getStatistikLeftMenu().click();
        statisticsPage.getKristinaChoosingChild().click();
        String kristinaIsChosenColor = statisticsPage.getKristinaChoosingChild().getCssValue("background-color");
        assertEquals(kristinaIsChosenColor, "rgba(255, 255, 255, 1)");
        statisticsPage.getValentinChoosingChild().click();
        String valentinIsChosenColor = statisticsPage.getValentinChoosingChild().getCssValue("background-color");
        assertEquals(valentinIsChosenColor, "rgba(255, 255, 255, 1)");
        statisticsPage.getMarkChoosingChild().click();
        String markIsChosenColor = statisticsPage.getMarkChoosingChild().getCssValue("background-color");
        assertEquals(markIsChosenColor,"rgba(255, 255, 255, 1)");
    }

  //  @Test
    public void switchBetweenTimeTabs() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),StatisticsPage.class);
        parentDashboard.getStatistikLeftMenu().click();

        statisticsPage.getDayTabButton().click();
        String valueDay = statisticsPage.getDayTabButton().getAttribute("class");
        Assert.assertEquals(valueDay, "mat-button-toggle w-100 active mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused mat-button-toggle-checked");
        statisticsPage.getWeekTabButton().click();
        String valueWeek = statisticsPage.getWeekTabButton().getAttribute("class");
        Assert.assertEquals(valueWeek, "mat-button-toggle w-100 mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused active mat-button-toggle-checked");
        statisticsPage.getMonthTabButton().click();
        String valueMonth = statisticsPage.getMonthTabButton().getAttribute("class");
        Assert.assertEquals(valueMonth, "mat-button-toggle w-100 mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused active mat-button-toggle-checked");
        statisticsPage.getAllTabButton().click();
        String valueAll = statisticsPage.getAllTabButton().getAttribute("class");
        Assert.assertEquals(valueAll,"mat-button-toggle w-100 mat-button-toggle-appearance-standard cdk-focused cdk-mouse-focused active mat-button-toggle-checked");

        String script = "return window.getComputedStyle(document.querySelector('mat-button-toggle.active'),':before').getPropertyValue('background-color')";
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) WebDriverContainer1.getDriver();
        String barColorDay = (String) js.executeScript(script);
        assertEquals(barColorDay,"rgb(255, 255, 255)");
    }

  //  @Test
    public void switchBetweenStatisticsScopes() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),StatisticsPage.class);

        parentDashboard.getStatistikLeftMenu().click();

        statisticsPage.getTasksChoosingStatistics().click();
        String newUrl;
        do {
            newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals("https://arcadia.study/en/parent/statistics/tasks"));

        statisticsPage.getUnitChoosingStatistics().click();
        String newUrl1;
        do {
            newUrl1 = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl1.contentEquals("https://arcadia.study/en/parent/statistics/units"));

        statisticsPage.getSubjectChoosingStatistics().click();
        String newUrl2;
        do {
            newUrl2 = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl2.contentEquals("https://arcadia.study/en/parent/statistics/subject"));

        statisticsPage.getClassChoosingStatistics().click();
        String newUrl3;
        do {
            newUrl3 = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl3.contentEquals("https://arcadia.study/en/parent/statistics/class"));
    }

  //  @Test
    public void switchTasksGermanMath(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),StatisticsPage.class);

        parentDashboard.getStatistikLeftMenu().click();

        statisticsPage.getMathTab().click();
        String classValueMathTab = statisticsPage.getMathTab().getAttribute("class");
        assertEquals(classValueMathTab, "btn-math btn-subjects cursor-pointer text-decoration-none active");

        statisticsPage.getGermanTab().click();
        String classValueGermanTab = statisticsPage.getGermanTab().getAttribute("class");
        assertEquals(classValueGermanTab, "btn-german btn-subjects cursor-pointer text-decoration-none active");

    }

 //   @Test
    public void chooseClassForKidStatistics(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),StatisticsPage.class);

        parentDashboard.getStatistikLeftMenu().click();

        statisticsPage.getKristinaClassDropDown().click();
        statisticsPage.getFirstClassKristinaFromDropDown().click();
        String classDropDownText = statisticsPage.getKristinaClassDropDown().getText();
        assertEquals(classDropDownText, "Klasse 1");

        statisticsPage.getValentinChoosingChild().click();
        statisticsPage.getValentinClassDropDown().click();
        statisticsPage.getFirstClassValentinFromDropDown().click();
        String classDropDownTextV = statisticsPage.getValentinClassDropDown().getText();
        assertEquals(classDropDownTextV, "Klasse 1");
    }

   // @Test // TODO: 20.04.22
    public void checkColorsOfProgressBars() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        StatisticsPage statisticsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),StatisticsPage.class);

        parentDashboard.getStatistikLeftMenu().click();

        statisticsPage.getAllTabButton().click();
        statisticsPage.getUnitFromStatistics().click();
        String rightAnswers = statisticsPage.getRightAnswers().getText();
        String wrongAnswers = statisticsPage.getWrongAnswers().getText();

        int rightAnswersValue = Integer.parseInt(rightAnswers);
        int wrongAnswersValue = Integer.parseInt(wrongAnswers);

        if (rightAnswersValue > wrongAnswersValue || wrongAnswersValue == 0){
            String script = "return window.getComputedStyle(document.querySelector('#cdk-accordion-child-3 > div > table > tbody > tr:nth-child(1) > td.mat-cell.cdk-cell.cdk-column-q_true.mat-column-q_true.ng-star-inserted > div > mat-progress-bar > div > div.mat-progress-bar-primary.mat-progress-bar-fill.mat-progress-bar-element'),':after').getPropertyValue('background-color')";
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) WebDriverContainer1.getDriver();
            String barColor = (String) js.executeScript(script);
            assertEquals(barColor, "rgb(46, 212, 122)");
        }



    }

}
