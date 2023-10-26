import org.openqa.selenium.By;

public class CheckBox extends BaseElement {
    public CheckBox(By locator, String name) {
        super(locator, name);
    }

    public void check(){
        if(!isChecked()) {
            findElement().click();
        }
    }

    public void uncheck(){
        if(isChecked()){
            findElement().click();
        }
    }
    public boolean isChecked(){
        return findElement().isSelected();
    }
}
