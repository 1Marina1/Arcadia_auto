package tests;

import helpers.WebDriverContainer1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.CartPage;
import pages.ParentDashboard;
import pages.SettingsPage;


import static org.testng.Assert.assertEquals;

public class TestSettingsPage extends LogInOutBase{
   // @Test
    public void changeParentName(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getNameChangeButton().click();

        String newName = "a";
        settingsPage.getParentNameInput().sendKeys(newName);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");

        String newNameCheck = settingsPage.getParentName().getText();
        assertEquals(newNameCheck, "Marinaa");

    }
  //  @Test
    public void changeParentSurname(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSurnameChangeButton().click();

        String newSurname = "a";
        settingsPage.getParentSurnameInput().sendKeys(newSurname);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newSurnameCheck = settingsPage.getParentSurname().getText();
        assertEquals(newSurnameCheck, "Testera");

    }
//    @Test
    public void changeParentEmail(){//request to new email happens
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getEmailChangeButton().click();

        String newEmail = "a";
        settingsPage.getParentEmailInput().sendKeys(newEmail);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newEmailCheck = settingsPage.getParentEmail().getText();
        assertEquals(newEmailCheck, "marina.veremchuk@northitgroup.eu");
        settingsPage.getNewEmailDeclineButton().click();
    }
   // @Test
    public void changeParentPassword(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getPasswordChangeButton().click();
        String newPassword = "zmxncbv12344321";
        settingsPage.getParentPasswordInput().sendKeys(newPassword);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessage().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newPasswordCheck = settingsPage.getParentPassword().getText();
        assertEquals(newPasswordCheck, "...........");
    }
   // @Test
    public void changeKidName(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getKidsTab().click();
        settingsPage.getFirstKidNameChangeButton().click();

        String newName = "a";
        settingsPage.getFirstKidNameInput().sendKeys(newName);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessageKidTab().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newNameCheck = settingsPage.getFirstKidName().getText();
        assertEquals(newNameCheck, "Kristinaa");

    }
   // @Test
    public void changeKidSurname(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getKidsTab().click();
        settingsPage.getFirstKidSurnameChangeButton().click();

        String newSurname = "a";
        settingsPage.getFirstKidSurnameInput().sendKeys(newSurname);
        settingsPage.getSubmitButton().click();
        String successMessage = settingsPage.getSuccessMessageKidTab().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newSurnameCheck = settingsPage.getFirstKidSurname().getText();
        assertEquals(newSurnameCheck, "a");
    }
   // @Test
    public void changeKidClass(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getKidsTab().click();
        settingsPage.getFirstKidClassChangeButton().click();
        settingsPage.getClassDropDown().click();
        settingsPage.getSecondClassFromDropDown().click();
        settingsPage.getSubmitButton().click();

        String successMessage = settingsPage.getSuccessMessageKidTab().getText();
        assertEquals(successMessage, "Die Änderungen wurden gespeichert.");
        String newKidClass = settingsPage.getFirstKidClass().getText();
        assertEquals(newKidClass, "2");

    }
   // @Test
    public void addSubscriptionToCart() throws InterruptedException {
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer1.getDriver(),CartPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();
        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        assertEquals(addedToCartMessage, "in den Warenkorb gelegt.");
        settingsPage.getToCartButton().click();
        String newUrl;
        do {
            newUrl = WebDriverContainer1.getDriver().getCurrentUrl();
            Thread.sleep(5);
        }while(newUrl.contentEquals("https://arcadia.study/de/parent/cart"));
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());

    }
}
