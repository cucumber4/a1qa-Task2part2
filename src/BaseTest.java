import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    UserMainPage userMainPage = new UserMainPage("Main page", By.xpath("//div[@class=\"start view view--center\"]"),Browser.getDriver());
    UserGamePage userGamePage = new UserGamePage("Game page", By.xpath("//div[@class=\"game view\"]"), Browser.getDriver());

    @AfterTest
    public void close(){
        Browser.getDriver().quit();
    }

}
