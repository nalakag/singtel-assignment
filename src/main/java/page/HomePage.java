package page;

import org.openqa.selenium.*;

public class HomePage {

    private final By taskNameTextBox = By.xpath("//input[@placeholder='What needs to be done?']");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputTaskName(String taskName) {
        driver.findElement(taskNameTextBox).sendKeys(taskName);
    }

    public void pressEnter() {
        driver.findElement(taskNameTextBox).sendKeys(Keys.ENTER);
    }

    public boolean isTaskVisible(String taskName) {
        boolean isTaskVisible = false;
        try {
            isTaskVisible = driver.findElement(By.xpath("//label[normalize-space()='" + taskName + "']"))
                    .isDisplayed();
        } catch (NoSuchElementException | TimeoutException ignored) {
        }
        return isTaskVisible;
    }

    public void selectItem(String taskName) {
        driver.findElement(By.xpath("//label[normalize-space()='" + taskName + "']" +
                "/preceding::input[@class='toggle'][1]")).click();
    }

    public String getRemainingItemsCount() {
        return driver.findElement(By.xpath("//span[@class='todo-count']//strong")).getText();
    }
}
