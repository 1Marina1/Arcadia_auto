//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math112Page {
    @FindBy(
            css = "div.body-question"
    )
    private WebElement taskBody;
    @FindBy(
            css = "div.footer-question> div:nth-child(1) > div"
    )
    private WebElement answerOne;
    @FindBy(
            css = "div.footer-question> div:nth-child(2) > div"
    )
    private WebElement answerTwo;
    @FindBy(
            css = "div.footer-question> div:nth-child(3) > div"
    )
    private WebElement answerThree;
    @FindBy(
            css = "div.footer-question> div:nth-child(4) > div"
    )
    private WebElement answerFour;
    @FindBy(
            css = "div.footer-question> div:nth-child(5) > div"
    )
    private WebElement answerFive;
    @FindBy(
            css = "button.btn-question"
    )
    private WebElement submitButton;

    public Math112Page() {
    }

    public WebElement getTaskBody() {
        return this.taskBody;
    }

    public WebElement getAnswerOne() {
        return this.answerOne;
    }

    public WebElement getAnswerTwo() {
        return this.answerTwo;
    }

    public WebElement getAnswerThree() {
        return this.answerThree;
    }

    public WebElement getAnswerFour() {
        return this.answerFour;
    }

    public WebElement getAnswerFive() {
        return this.answerFive;
    }

    public WebElement getSubmitButton() {
        return this.submitButton;
    }
}
