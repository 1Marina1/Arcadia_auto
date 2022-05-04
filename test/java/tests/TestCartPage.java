package tests;

import helpers.WebDriverContainer;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ParentDashboard;
import pages.SettingsPage;

import static org.testng.Assert.assertEquals;

public class TestCartPage extends LogInOutBase{
    @Test
    public void deleteSubscription(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer.getDriver(),SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer.getDriver(),CartPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();
        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        assertEquals(addedToCartMessage, "in den Warenkorb gelegt.");
        settingsPage.getToCartButton().click();
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());
        cartPage.getDeleteSubscriptionButton().click();
        String cartIsEmptyMessage = cartPage.getCartIsEmpty().getText();
        assertEquals(cartIsEmptyMessage, "Der Warenkorb ist leer");
    }
    @Test
    public void goToPayment(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer.getDriver(),SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer.getDriver(),CartPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();
        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        assertEquals(addedToCartMessage, "in den Warenkorb gelegt.");
        settingsPage.getToCartButton().click();
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());
        cartPage.getGoToPaymentButton().click();
        cartPage.getPaymentSubmitButton().click();
        String errorMessage = cartPage.getErrorMessage().getText();
        assertEquals(errorMessage, "Ihre Kartennummer ist unvollständig.");
        cartPage.getCrossOnPopUp().click();
    }
}
