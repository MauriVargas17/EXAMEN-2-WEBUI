package controls;

import org.openqa.selenium.By;

public class Item extends Control {

    public Item(By locator) {
        super(locator);
    }

    public String getText() {
        return getControl().getText();
    }
}