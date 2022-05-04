package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-cart/div[1]/h1")
    private WebElement cartTitle;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-cart/div[2]/div/mat-card")
    private WebElement subscriptionDiv;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-cart/div[2]/div/mat-card/a")
    private WebElement deleteSubscriptionButton;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-cart/div[2]/button")
    private WebElement goToPaymentButton;

    @FindBy(xpath = "/html/body/app-root/app-layout-parent/div/div[2]/main/app-parent-cart/div[2]/div/h1")
    private WebElement cartIsEmpty;

    @FindBy(xpath = "//*[@id='card-form']/button")
    private WebElement paymentSubmitButton;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-modal-pay-stripe/div[2]/p")
    private WebElement errorMessage;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-modal-pay-stripe/div[1]/a")
    private WebElement crossOnPopUp;

    public WebElement getCartTitle() {
        return cartTitle;
    }
    public WebElement getSubscriptionDiv() {
        return subscriptionDiv;
    }
    public WebElement getDeleteSubscriptionButton() {
        return deleteSubscriptionButton;
    }
    public WebElement getGoToPaymentButton() {
        return goToPaymentButton;
    }
    public WebElement getCartIsEmpty() {
        return cartIsEmpty;
    }
    public WebElement getPaymentSubmitButton() {
        return paymentSubmitButton;
    }
    public WebElement getErrorMessage() {
        return errorMessage;
    }
    public WebElement getCrossOnPopUp() {
        return crossOnPopUp;
    }
}
