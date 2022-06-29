//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math111Page {
    @FindBy(
            xpath = "//app-counting-fingers/form/div/div[2]/div[1]"
    )
    private WebElement firstSummand;
    @FindBy(
            xpath = "//app-counting-fingers/form/div/div[2]/div[2]"
    )
    private WebElement secondSummand;
    @FindBy(
            css = "#forautofocus"
    )
    private WebElement answerFieldInput;
    @FindBy(
            css = "button.btn-question"
    )
    private WebElement submitButton;

    public Math111Page() {
    }

    public WebElement getAnswerFieldInput() {
        return this.answerFieldInput;
    }

    public WebElement getFirstSummand() {
        return this.firstSummand;
    }

    public WebElement getSecondSummand() {
        return this.secondSummand;
    }

    public WebElement getSubmitButton() {
        return this.submitButton;
    }
}