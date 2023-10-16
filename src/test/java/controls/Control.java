package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class Control {
    protected By locator;
    protected WebElement control;

    public Control(By locator){
        this.locator = locator;
    }

    public WebElement getControl(){
        control = Session.getInstance().getBrowser().findElement(this.locator);
        return control;
    }

    public void click(){
        getControl();
        this.control.click();
    }

    public boolean isControlDisplayed(){
        try{
            getControl();
            return control.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }
}
