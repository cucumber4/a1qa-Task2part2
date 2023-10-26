import org.openqa.selenium.By;

public class TextBox extends BaseElement {
    String keys;
    public TextBox(By locator, String name, String keys) {
        super(locator, name);
        this.keys = keys;
    }

    public void type(){
        findElement().clear();
        findElement().sendKeys(keys);
    }
    public void clear(){
        findElement().clear();
    }
}
