import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class UserMainPage extends BaseForm{
    private Button hereButton = new Button(By.xpath("//a[@class='start__link']"), "HERE button");

    public UserMainPage(String name, By uniqueLocator, WebDriver driver) {
        super(name, uniqueLocator, driver);
    }

    public void clickHereButton(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForToBeClickable(hereButton);
        Logger.logger.info("Here button clicked");
        hereButton.click();
    }
}
