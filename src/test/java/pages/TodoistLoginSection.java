package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TodoistLoginSection {
    public TextBox email = new TextBox(By.xpath("//*[@id=\"element-0\"]"));
    public TextBox password = new TextBox(By.xpath("//*[@id=\"element-3\"]"));
    public Button login = new Button(By.xpath("//*[@id=\"todoist_app\"]/div/div/div[2]/div[1]/div/div/form/button"));
    public Button register = new Button(By.xpath("//a[text()=\"Regístrate\"]"));
}
