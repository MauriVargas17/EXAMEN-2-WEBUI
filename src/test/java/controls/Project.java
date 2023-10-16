package controls;

import org.openqa.selenium.By;

public class Project extends Control {

    public Project(By locator) {
        super(locator);
    }

    public String getText() {
        return getControl().getText();
    }
}