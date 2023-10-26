import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Browser{
    static WebDriver driver = new ChromeDriver();;
    public static WebDriver getDriver(){
        return driver;
    }
    public void goToUrl(String host_url){
        driver.get(host_url);
    }
    public void closeBrowser(){
        driver.close();
    }
    public JavascriptExecutor getJsExecutor(){
        return (JavascriptExecutor) driver;
    }
    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }

}
