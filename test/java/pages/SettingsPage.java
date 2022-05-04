package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-settings/div[1]/h1")
    private WebElement settingsTitle;

    @FindBy(xpath = "//app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/div/ul/li[1]/a")
    private WebElement generalTab;

    @FindBy(xpath = "//app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/div/ul/li[2]/a")
    private WebElement kidsTab;

    @FindBy(xpath = "//app-layout-parent/div/div[2]/main/app-parent-settings/div[2]/div/ul/li[3]/a")
    private WebElement subscriptionsTab;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[1]/div[3]/a")
    private WebElement nameChangeButton;

    @FindBy(id = "mat-input-0")
    private WebElement parentNameInput;

    @FindBy(xpath = "//app-parent-settings-general/div/form/div[1]/div[2]")
    private WebElement parentName;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[2]/div[3]/a")
    private WebElement surnameChangeButton;

    @FindBy(id = "mat-input-0")
    private WebElement parentSurnameInput;

    @FindBy(xpath = "//app-parent-settings-general/div/form/div[2]/div[2]")
    private WebElement parentSurname;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[3]/div[3]/a")
    private WebElement emailChangeButton;

    @FindBy(id = "mat-input-0")
    private WebElement parentEmailInput;

    @FindBy(xpath = "//app-parent-settings-general/div/form/div[3]/div[2]")
    private WebElement parentEmail;

    @FindBy(xpath = "//app-parent-settings-general/div/form/div[3]/div[4]/p/a[2]")
    private WebElement newEmailDeclineButton;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[4]/div[3]/a")
    private WebElement passwordChangeButton;

    @FindBy(id = "mat-input-0")
    private WebElement parentPasswordInput;

    @FindBy(xpath = "//div[2]/app-parent-settings-general/div/form/div[4]/div[2]")
    private WebElement parentPassword;

    @FindBy(css = "form > button")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='0name']/div[3]/a")
    private WebElement firstKidNameChangeButton;

    @FindBy(xpath = "//*[@id='0name']/div[2]")
    private WebElement firstKidName;

    @FindBy(xpath = "//*[@id='0surname']/div[3]/a")
    private WebElement firstKidSurnameChangeButton;

    @FindBy(xpath = "//*[@id='0surname']/div[2]")
    private WebElement firstKidSurname;

    @FindBy(xpath = "//*[@id='0class']/div[3]/a")
    private WebElement firstKidClassChangeButton;

    @FindBy(xpath = "//app-parent-settings-subscription/div/div[3]/div[2]/div/div/div[1]/div/div[3]/a")
    private WebElement subscriptionForMark;

    @FindBy(xpath = "//app-parent-settings-kids/div/form/div[2]/div/p/a")
    private WebElement createNewKidButton;

    @FindBy(xpath = "//form/ngb-alert/strong")
    private WebElement successMessage;

    @FindBy(xpath = "//*[@id='alert']/ngb-alert/strong")
    private WebElement successMessageKidTab;

    @FindBy(css = "#mat-input-1")
    private WebElement firstKidSurnameInput;

    @FindBy(xpath = "//*[@id='0class']/mat-form-field/div/div[1]/div")
    private WebElement classDropDown;

    @FindBy(xpath = "//*[@id='mat-option-1']")
    private WebElement secondClassFromDropDown;

    @FindBy(xpath = "//*[@id='0class']/div[2]")
    private WebElement firstKidClass;

    @FindBy(xpath = "//*[@id='mat-radio-2']/label/span[2]")
    private WebElement oneMonthRadioButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div/div[2]/a")
    private WebElement addToCartButtonOnPopUp;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div/div[2]/a")
    private WebElement addedToCartMessage;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/button")
    private WebElement toCartButton;


    public WebElement getSettingsTitle() {
        return settingsTitle;
    }
    public WebElement getGeneralTab() {
        return generalTab;
    }
    public WebElement getKidsTab() {
        return kidsTab;
    }
    public WebElement getSubscriptionsTab() {
        return subscriptionsTab;
    }
    public WebElement getNameChangeButton() {
        return nameChangeButton;
    }
    public WebElement getSurnameChangeButton() {
        return surnameChangeButton;
    }
    public WebElement getEmailChangeButton() {
        return emailChangeButton;
    }
    public WebElement getPasswordChangeButton() {
        return passwordChangeButton;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
    public WebElement getFirstKidClassChangeButton() {
        return firstKidClassChangeButton;
    }
    public WebElement getFirstKidNameChangeButton() {
        return firstKidNameChangeButton;
    }
    public WebElement getFirstKidSurnameChangeButton() {
        return firstKidSurnameChangeButton;
    }
    public WebElement getSubscriptionForMark() {
        return subscriptionForMark;//1 usage available
    }
    public WebElement getCreateNewKidButton() {
        return createNewKidButton;//2 usages available
    }
    public WebElement getParentEmailInput() {
        return parentEmailInput;
    }
    public WebElement getParentNameInput() {
        return parentNameInput;
    }
    public WebElement getParentPasswordInput() {
        return parentPasswordInput;
    }
    public WebElement getParentSurnameInput() {
        return parentSurnameInput;
    }
    public WebElement getSuccessMessage() {
        return successMessage;
    }
    public WebElement getParentName() {
        return parentName;
    }
    public WebElement getParentSurname() {
        return parentSurname;
    }
    public WebElement getParentEmail() {
        return parentEmail;
    }
    public WebElement getNewEmailDeclineButton() {
        return newEmailDeclineButton;
    }
    public WebElement getParentPassword() {
        return parentPassword;
    }
    public WebElement getFirstKidName() {
        return firstKidName;
    }
    public WebElement getFirstKidSurname() {
        return firstKidSurname;
    }
    public WebElement getSuccessMessageKidTab() {
        return successMessageKidTab;
    }
    public WebElement getFirstKidSurnameInput() {
        return firstKidSurnameInput;
    }
    public WebElement getClassDropDown() {
        return classDropDown;
    }
    public WebElement getSecondClassFromDropDown() {
        return secondClassFromDropDown;
    }
    public WebElement getFirstKidClass() {
        return firstKidClass;
    }
    public WebElement getOneMonthRadioButton() {
        return oneMonthRadioButton;
    }
    public WebElement getAddToCartButtonOnPopUp() {
        return addToCartButtonOnPopUp;
    }
    public WebElement getAddedToCartMessage() {
        return addedToCartMessage;
    }
    public WebElement getToCartButton() {
        return toCartButton;
    }
}
