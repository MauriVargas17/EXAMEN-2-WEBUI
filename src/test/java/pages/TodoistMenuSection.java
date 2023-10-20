package pages;

import controls.Button;
import controls.Option;
import org.openqa.selenium.By;

public class TodoistMenuSection {
    String newName;
    public Button name = new Button(By.xpath("//span[text()=\""+newName+"\"]"));
    public Button profile = new Button(By.xpath("//button[@aria-label=\"Settings\"]"));
    public Button logout = new Button(By.xpath("//span[text()=\"Log out\"]"));
    public Button settings = new Button(By.xpath("//*[@id=\"user_menu_settings_menuitem\"]"));
    public Button outsideOptions = new Button(By.xpath("//button[@aria-label=\"Open menu\"]"));
    public Button outsideLogIn = new Button(By.xpath("//li/a[text()=\"Log in\"]"));
    public Button confirmLogOut = new Button(By.xpath("//button[@data-autofocus=\"true\"]"));

    public void setNewName(String name){
        newName = name;
        this.name = new Button(By.xpath("//span[text()=\""+newName+"\"]"));
    }

}
