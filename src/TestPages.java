import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestPages extends BaseTest{

    @Test
    @Parameters("url")
    public void HelpFormTest(String url){
        userMainPage.openPage(url);

        Assert.assertTrue(userMainPage.isPageOpen());

        userMainPage.clickHereButton();
        Assert.assertTrue(userGamePage.isPageOpen());

        userGamePage.clickHelpButton();
        Assert.assertTrue(userGamePage.getHelpResponce());
    }

    @Test
    @Parameters("url")
    public void timerTest(String url){
        userMainPage.openPage(url);

        userMainPage.clickHereButton();
        Assert.assertEquals(userGamePage.getTime(), "00:00:00");
    }

    @Test
    @Parameters("url")
    public void validPasswordTest(String url){
        userGamePage.password = new TextBox(By.xpath("//input[@placeholder='Choose Password']"),"Password field", new RandomUtils().getRandomValidPassword());
        userGamePage.emailName = new TextBox(By.xpath("//input[@placeholder='Your email']"), "Email name field", new RandomUtils().getRandomValidEmail());

        userMainPage.openPage(url);

        userMainPage.clickHereButton();

        userGamePage.inputPassword();
        userGamePage.inputEmailName();
        userGamePage.inputDomainName();
        userGamePage.chooseTopLevelDomain();
        userGamePage.acceptAgreement();
        userGamePage.clickNextButton();
        Assert.assertTrue(userGamePage.isSecondFormOpened());

    }

    @Test
    @Parameters("url")
    public void invalidPasswordTest(String url){
        userGamePage.password = new TextBox(By.xpath("//input[@placeholder='Choose Password']"),"Password field", new RandomUtils().getRandomInvalidPassword());
        userGamePage.emailName = new TextBox(By.xpath("//input[@placeholder='Your email']"), "Email name field", new RandomUtils().getRandomValidEmail());

        userMainPage.openPage(url);

        userMainPage.clickHereButton();

        userGamePage.inputPassword();
        userGamePage.inputEmailName();
        userGamePage.inputDomainName();
        userGamePage.chooseTopLevelDomain();
        userGamePage.acceptAgreement();
        userGamePage.clickNextButton();
        Assert.assertTrue(userGamePage.isFirstFormStillOpen());

    }
}
