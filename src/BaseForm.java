import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseForm {
    WebDriver driver;
    By uniqueLocator;
    String name;
    public BaseForm(String name,By uniqueLocator, WebDriver driver){
        this.uniqueLocator = uniqueLocator;
        this.driver = driver;
        this.name = name;
    }

    public void openPage(String url){
        Browser.getDriver().get(url);
    }
    public boolean isPageOpen(){
        try {
            return driver.findElement(uniqueLocator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}

