package tests;

import helpers.WebDriverContainer1;
import org.openqa.selenium.support.PageFactory;
import pages.ChildDashboard;
import pages.ParentDashboard;

import static org.testng.Assert.assertEquals;

public class TestChildDashboard extends LogInOutBaseChild{
  //  @Test(groups = {"ChildTest"})
    public void goToParentsAccount(){
        ChildDashboard childDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(), ChildDashboard.class);
        childDashboard.getGoToParentDashboardButton().click();
        childDashboard.getParentPassword().sendKeys("zmxncbv12344321");
        childDashboard.getSubmitPasswordToParent().click();
        ParentDashboard parentDashboard = PageFactory.initElements(WebDriverContainer1.getDriver(),ParentDashboard.class);
        String dashboardTitle = parentDashboard.getDashboardTitle().getText();
        assertEquals(dashboardTitle, "Dashboard");
    }
}
