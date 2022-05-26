package step_impl;

import com.thoughtworks.gauge.*;
import driver.*;
import org.junit.*;
import page.*;

public class HomePageStepImpl {

    private final HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Step("Input text on ToDo text box <text>")
    public void inputTodo(String text) {
        homePage.inputTaskName(text);
    }

    @Step("Press Enter key")
    public void pressEnter() {
        homePage.pressEnter();
    }

    @Step("<taskName> task is visible")
    public void checkTaskIsVisible(String taskName) {
        Assert.assertTrue(homePage.isTaskVisible(taskName));
    }

    @Step("Select a task <taskName>")
    public void selectTask(String taskName) {
        homePage.selectItem(taskName);
    }

    @Step("Remaining items count is <itemCount>")
    public void checkItemCount(String itemCount) {
        Assert.assertEquals(itemCount, homePage.getRemainingItemsCount());
    }

    @Step("Click on the Completed button")
    public void clickOnCompletedButton() {
        homePage.clickOnCompletedButton();
    }

    @Step("Click on the Active button")
    public void clickOnActiveButton() {
        homePage.clickOnActiveButton();

    }
    @Step("Click on the Clear Completed Icon")
    public void clickOnClearCompletedIcon() {
        homePage.clickOnClearCompletedIcon();

    }
}
