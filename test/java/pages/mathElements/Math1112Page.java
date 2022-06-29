//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math1112Page {
    @FindBy(
            css = "input[formcontrolname = 'one']"
    )
    private WebElement firstInput;
    @FindBy(
            css = "form > div > div:nth-child(2) > svg > text"
    )
    private WebElement firstNumber;
    @FindBy(
            css = "input[formcontrolname = 'two']"
    )
    private WebElement secondInput;
    @FindBy(
            css = "form > div > div:nth-child(4) > svg:nth-child(1) > text"
    )
    private WebElement secondNumber;
    @FindBy(
            css = "input[formcontrolname = 'three']"
    )
    private WebElement thirdInput;
    @FindBy(
            css = "input[formcontrolname = 'four']"
    )
    private WebElement fourthInput;
    @FindBy(
            css = "input[formcontrolname = 'five']"
    )
    private WebElement fifthInput;
    @FindBy(
            css = "form > div > div:nth-child(6) > svg > text"
    )
    private WebElement fourthNumber;
    @FindBy(
            css = "button.btn-question"
    )
    private WebElement submitButton;

    public Math1112Page() {
    }

    public WebElement getFirstInput() {
        return this.firstInput;
    }

    public WebElement getFirstNumber() {
        return this.firstNumber;
    }

    public WebElement getSecondInput() {
        return this.secondInput;
    }

    public WebElement getSecondNumber() {
        return this.secondNumber;
    }

    public WebElement getThirdInput() {
        return this.thirdInput;
    }

    public WebElement getFifthInput() {
        return this.fifthInput;
    }

    public WebElement getFourthInput() {
        return this.fourthInput;
    }

    public WebElement getFourthNumber() {
        return this.fourthNumber;
    }

    public WebElement getSubmitButton() {
        return this.submitButton;
    }
}
