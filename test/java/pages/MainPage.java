package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(css  = "a.navbar-brand.p-0.mr-5 .logo")
    private WebElement headerLogo;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-header/nav/div[1]/div[1]/app-top-menu/div/ul/li[1]/a")
    private WebElement aboutUsHeaderLink;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-header/nav/div[1]/div[1]/app-top-menu/div/ul/li[2]")
    private WebElement myAccountHeaderLink;

    @FindBy(css = ".create-account > a")
    private WebElement createAccountHeaderButton;

    @FindBy(css = "a[href='#learn-more']")
    private WebElement learnMoreButton;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-layout/section[5]/div/div[2]/a")
    private WebElement createAccountFooterButton;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-layout/section[1]/div[1]/h1")
    private WebElement titleTextMainPage;

    @FindBy(css = "section.login > mat-card > mat-card-title")
    private WebElement loginCardTitle;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-create/section/app-private-create/mat-card/div/div[2]/div/" +
            "div[2]/mat-card-title")
    private WebElement registrationCardTitle;

    @FindBy(css = "div.social-network.d-xl-block > a")
    private WebElement instagramFooterIcon;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-footer-front/section/div/div/div[4]/div/a")
    private WebElement subscribeToInstagramButton;

    @FindBy(xpath = "/html/body/app-root/app-layout/app-footer-front/footer/div/div/div[2]/ul/li[1]/a")
    private WebElement impressum;//from datenschutz

    @FindBy(css = "div:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement datenschutz;

    @FindBy(css = "body > app-root > app-layout > div > app-imprint > div > h1")
    private WebElement impressumPageTitle;

    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-data-protection/div/h1")
    private WebElement datenschutzPageTitle;

    @FindBy(css = " app-localization > button > span.mat-button-wrapper")
    private WebElement languageSwitcher;

    @FindBy(css = "#mat-menu-panel-1 > div > button:nth-child(1)")
    private WebElement languageSwitcherToDE;

    @FindBy(css = "#mat-menu-panel-1 > div > button:nth-child(2)")
    private WebElement languageSwitcherToEN;//from impressum

    @FindBy(css = "img[alt='Arcadia'].d-none.d-xl-inline.h-100.w-auto")
    private WebElement pictureWithChildren;

    public WebElement getHeaderLogo(){
        return headerLogo;
    }
    public WebElement getAboutUsHeaderLink(){
        return aboutUsHeaderLink;
    }
    public WebElement getMyAccountHeaderLink(){
        return myAccountHeaderLink;
    }
    public WebElement getCreateAccountHeaderButton(){
        return createAccountHeaderButton;
    }
    public WebElement getLearnMoreButton(){
        return learnMoreButton;
    }
    public WebElement getCreateAccountFooterButton(){
        return createAccountFooterButton;
    }
    public WebElement getTitleTextMainPage(){
        return titleTextMainPage;
    }
    public WebElement getLoginCardTitle(){
        return loginCardTitle;
    }
    public WebElement getRegistrationCardTitle(){
        return registrationCardTitle;
    }
    public WebElement getInstagramFooterIcon(){
        return instagramFooterIcon;
    }
    public WebElement getSubscribeToInstagramButton() {
        return subscribeToInstagramButton;
    }
    public WebElement getDatenschutz() {
        return datenschutz;
    }
    public WebElement getImpressum() {
        return impressum;
    }
    public WebElement getImpressumPageTitle(){
        return impressumPageTitle;
    }
    public WebElement getDatenschutzPageTitle() {
        return datenschutzPageTitle;
    }
    public WebElement getLanguageSwitcher() {
        return languageSwitcher;
    }
    public WebElement getLanguageSwitcherToDE() {
        return languageSwitcherToDE;
    }
    public WebElement getLanguageSwitcherToEN() {
        return languageSwitcherToEN;
    }
    public WebElement getPictureWithChildren() {
        return pictureWithChildren;
    }
}
