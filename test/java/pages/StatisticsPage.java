package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatisticsPage {
    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[1]/h1")
    private WebElement statisticsTitle;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[1]")
    private WebElement kristinaChoosingChild;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[2]")
    private WebElement valentinChoosingChild;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[3]")
    private WebElement markChoosingChild;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[1]/a/p")
    private WebElement kristinaClassDropDown;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/ul/li[2]/a/p")
    private WebElement valentinClassDropDown;

    @FindBy(css = "#mat-button-toggle-1")
    private WebElement dayTabButton;

    @FindBy(css = "#mat-button-toggle-2")
    private WebElement weekTabButton;

    @FindBy(css = "#mat-button-toggle-3")
    private WebElement monthTabButton;

    @FindBy(css = "#mat-button-toggle-4")
    private WebElement allTabButton;

    @FindBy(xpath = "//*[@id='mat-menu-panel-2']/div/button[1]")
    private WebElement firstClassKristinaFromDropDown;

    @FindBy(xpath = "//*[@id='mat-menu-panel-3']/div/button[1]")
    private WebElement firstClassValentinFromDropDown;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[1]")
    private WebElement tasksChoosingStatistics;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[2]")
    private WebElement unitChoosingStatistics;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[3]")
    private WebElement subjectChoosingStatistics;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[1]/ul/li[4]")
    private WebElement classChoosingStatistics;

    @FindBy(css = "a.btn-math")
    private WebElement mathTab;

    @FindBy(css = "a.btn-german")
    private WebElement germanTab;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-0']/span[1]/mat-panel-description")
    private WebElement unitFromStatistics;

    @FindBy(xpath = "//*[@id='cdk-accordion-child-0']/div/table/tbody/tr[1]/td[3]/div/span[1]")
    private WebElement rightAnswers;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-statistics/div[2]/div[2]/app-parent-statistics-tasks/div/mat-accordion[1]/mat-expansion-panel/div/div/table/tbody/tr[1]/td[3]/div/span[2]")
    private WebElement wrongAnswers;



    public WebElement getStatisticsTitle() {
        return statisticsTitle;
    }
    public WebElement getKristinaChoosingChild() {
        return kristinaChoosingChild;
    }
    public WebElement getValentinChoosingChild() {
        return valentinChoosingChild;
    }
    public WebElement getMarkChoosingChild() {
        return markChoosingChild;
    }
    public WebElement getKristinaClassDropDown() {
        return kristinaClassDropDown;
    }
    public WebElement getValentinClassDropDown() {
        return valentinClassDropDown;
    }
    public WebElement getDayTabButton() {
        return dayTabButton;
    }
    public WebElement getWeekTabButton() {
        return weekTabButton;
    }
    public WebElement getMonthTabButton() {
        return monthTabButton;
    }
    public WebElement getFirstClassKristinaFromDropDown() {
        return firstClassKristinaFromDropDown;
    }
    public WebElement getFirstClassValentinFromDropDown() {
        return firstClassValentinFromDropDown;
    }
    public WebElement getAllTabButton() {
        return allTabButton;
    }
    public WebElement getClassChoosingStatistics() {
        return classChoosingStatistics;
    }
    public WebElement getSubjectChoosingStatistics() {
        return subjectChoosingStatistics;
    }
    public WebElement getTasksChoosingStatistics() {
        return tasksChoosingStatistics;
    }
    public WebElement getUnitChoosingStatistics() {
        return unitChoosingStatistics;
    }
    public WebElement getMathTab(){return mathTab;}
    public WebElement getGermanTab() {
        return germanTab;
    }
    public WebElement getUnitFromStatistics() {
        return unitFromStatistics;
    }
    public WebElement getRightAnswers() {
        return rightAnswers;
    }
    public WebElement getWrongAnswers() {
        return wrongAnswers;
    }
}
