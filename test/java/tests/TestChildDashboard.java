package tests;

import helpers.WebDriverContainer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ChildDashboard;
import pages.ParentDashboard;

import static org.testng.Assert.assertEquals;

public class TestChildDashboard extends LogInOutBaseChild{
    @Test
    public void goToParentsAccount(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer.getDriver(), ChildDashboard.class);
        childDashboard.getGoToParentDashboardButton().click();
        childDashboard.getParentPassword().sendKeys("zmxncbv12344321");
        childDashboard.getSubmitPasswordToParent().click();
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer.getDriver(),ParentDashboard.class);
        String dashboardTitle = parentDashboard.getDashboardTitle().getText();
        assertEquals(dashboardTitle, "Dashboard");
    }
}
