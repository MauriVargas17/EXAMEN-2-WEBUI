package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TodoistRegisterSection {
    public TextBox email = new TextBox(By.xpath("//input[@placeholder=\"Introduce tu email...\"]"));
    public TextBox password = new TextBox(By.xpath("//input[@placeholder=\"Introduce tu contraseña...\"]"));
    public Button submit = new Button(By.xpath("//button[@data-gtm-id=\"start-email-signup\"]"));
    public Button register = new Button(By.xpath("//a[text()=\"Regístrate\"]"));
}
