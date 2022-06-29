
package pages.mathElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Math118Page {
    @FindBy(
            css = "app-header-tasks > div > div > p > span"
    )
    private WebElement taskParameter;
    @FindBy(
            css = "div#todo"
    )
    private WebElement taskBody;
    @FindBy(
            css = "div.body-question > div.flex-wrap.justify-content-center"
    )
    private WebElement taskSectionsDiv;

    public Math118Page() {
    }

    public WebElement getTaskParameter() {
        return this.taskParameter;
    }

    public WebElement getTaskBody() {
        return this.taskBody;
    }

    public WebElement getTaskSectionsDiv() {
        return this.taskSectionsDiv;
    }
}