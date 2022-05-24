package step_impl;

import com.thoughtworks.gauge.*;
import driver.*;

public class ExecutionHooks {

    @BeforeScenario
    public void openBrowser() {
        DriverFactory.setDriver();
    }

    @AfterScenario
    public void closeBrowser() {
        DriverFactory.getDriver().quit();
    }
}
