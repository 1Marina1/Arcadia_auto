package tests;

import helpers.WebDriverContainer1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ParentDashboard;
import pages.SettingsPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestCartPage extends LogInOutBase{
    @Test
    public void deleteSubscription(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer1.getDriver(),CartPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();
        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        assertEquals(addedToCartMessage, "in den Warenkorb hinzugefügt.");
        settingsPage.getToCartButton().click();
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());
        cartPage.getDeleteSubscriptionButton().click();
        String cartIsEmptyMessage = cartPage.getCartIsEmpty().getText();
        assertEquals(cartIsEmptyMessage, "Der Warenkorb ist leer");
    }
   // @Test TODO 8.06
    public void goToPayment(){
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ParentDashboard.class);
        SettingsPage settingsPage = PageFactory.initElements(WebDriverContainer1.getDriver(),SettingsPage.class);
        CartPage cartPage = PageFactory.initElements(WebDriverContainer1.getDriver(),CartPage.class);

        parentDashboard.getSettingRightMenu().click();
        settingsPage.getSubscriptionsTab().click();
        settingsPage.getSubscriptionForMark().click();
        settingsPage.getOneMonthRadioButton().click();
        settingsPage.getAddToCartButtonOnPopUp().click();
        String addedToCartMessage = settingsPage.getAddedToCartMessage().getText();
        assertEquals(addedToCartMessage, "in den Warenkorb hinzugefügt.");
        settingsPage.getToCartButton().click();
        settingsPage.getToCartButton().click();
        Assert.assertTrue(cartPage.getSubscriptionDiv().isDisplayed());
        cartPage.getGoToPaymentButton().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        cartPage.getPaymentSubmitButton().click();
        WebDriverContainer1.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Assert.assertTrue(cartPage.getErrorMessage().isDisplayed());
        String errorMessage = cartPage.getErrorMessage().getText();
        assertEquals(errorMessage, "Ihre Kartennummer ist unvollständig.");
        cartPage.getCrossOnPopUp().click();
    }
}
