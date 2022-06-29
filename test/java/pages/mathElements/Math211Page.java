
package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math211Page {
    @FindBy(
            css = "app-adding-tens > form > div > div > div:nth-child(1)"
    )
    private WebElement firstSummand;
    @FindBy(
            css = "app-adding-tens > form > div > div > div:nth-child(3)"
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

    public Math211Page() {
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
