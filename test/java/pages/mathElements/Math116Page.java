
package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math116Page {
    @FindBy(
            css = "div.body-question > img"
    )
    private WebElement taskDiv;

    public Math116Page() {
    }

    public WebElement getTaskDiv() {
        return this.taskDiv;
    }
}