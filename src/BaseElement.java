import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseElement{
    protected By locator;
    protected String name;
    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }
    public WebElement findElement(){
        return Browser.getDriver().findElement(locator);
    }

    public  void click(){
        findElement().click();
    }

    public String getText() {
        return findElement().getText();
    }

    public boolean isDisplayed(){
        return findElement().isDisplayed();
    }

    public String getAttribute(){
        return findElement().getAttribute(name);
    }
}
