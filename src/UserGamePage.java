import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class UserGamePage extends BaseForm{

    private Button helpButton = new Button(By.xpath("//a[text()='Help']"), "HELP button");

    private Label helpLabel = new Label(By.xpath("//div[@class='help-form__response']"), "HELP form");

    private Label timer = new Label(By.xpath("//div[@class='timer timer--white timer--center']"), "Timer");

    TextBox password = new TextBox(By.xpath("//input[@placeholder='Choose Password']"),"Password field", "Samplepassword1н");

    TextBox emailName = new TextBox(By.xpath("//input[@placeholder='Your email']"), "Email name field", "gogoreferenc");

    private TextBox domainName = new TextBox(By.xpath("//input[@placeholder='Domain']"), "Domain name field","stu.sdu.edu.kz");

    private Label menu = new Label(By.xpath("//div[@class='dropdown__field']"), "Dropdown Menu");

    private Label menuSelect = new Label(By.xpath("//div[text()='.org']"), "Top level Domain");

    private CheckBox agreement = new CheckBox(By.xpath("//span[@class='icon icon-check checkbox__check']"), "Agreement accept");

    private Button nextButton = new Button(By.xpath("//a[@class='button--secondary']"), "Next button");

    private Label firstForm = new Label(By.xpath("//input[@placeholder='Domain']"), "first fill form");

    private Label secondForm = new Label(By.xpath("//div[@class='avatar-and-interests-page']"), "Second fill form");

    public UserGamePage(String name,By uniqueLocator, WebDriver driver) {
        super(name, uniqueLocator, driver);
    }

    public void inputPassword(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(password);
        password.click();
        password.clear();
        password.type();
        Logger.logger.info("Password was entered");

    }

    public void inputEmailName(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(emailName);
        emailName.click();
        emailName.clear();
        emailName.type();
        Logger.logger.info("email was entered");
    }

    public void inputDomainName(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(domainName);
        domainName.click();
        domainName.clear();
        domainName.type();
        Logger.logger.info("Domain was name entered");
    }

    public void chooseTopLevelDomain(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForToBeClickable(menu);
        menu.click();
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForToBeClickable(menuSelect);
        menuSelect.click();
        Logger.logger.info("Top level domain chosen");

    }

    public void acceptAgreement(){
        agreement.check();
        Logger.logger.info("agreement accepted");
    }

    public void clickNextButton(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForToBeClickable(nextButton);
        nextButton.click();
        Logger.logger.info("Next button clicked");
    }

    public boolean isSecondFormOpened(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(secondForm);
        return secondForm.isDisplayed();
    }

    public boolean isFirstFormStillOpen(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(firstForm);
        return firstForm.isDisplayed();
    }

    public void clickHelpButton(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForToBeClickable(helpButton);
        Logger.logger.info("Help button clicked");
        helpButton.click();
    }

    public String getTime(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(timer);
        return timer.getText();
    }

    public boolean getHelpResponce(){
        new ConditionalWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(5)).WaitForDisplayed(helpLabel);
        return helpLabel.isDisplayed();
    }
}
