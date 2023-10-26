import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConditionalWait {
    private WebDriverWait wait;

    public ConditionalWait(WebDriver driver, Duration timeoutInSeconds, Duration pollingIntervalSeconds) {
        wait = new WebDriverWait(driver, timeoutInSeconds, pollingIntervalSeconds);
    }

    public BaseElement WaitForDisplayed(BaseElement element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element.locator));
        return element;
    }

    public BaseElement WaitForToBeClickable(BaseElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element.locator));
        return element;
    }

}