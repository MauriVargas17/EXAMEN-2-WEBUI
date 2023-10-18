package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TodoistSettingsSection {
    public Button changePasswordButton = new Button(By.xpath("//a[@href=\"/app/settings/account/password\"]"));
    public TextBox oldPasswordTextBox = new TextBox(By.xpath("//input[@type=\"password\" and @autocomplete=\"off\"]"));
    public TextBox newPasswordTextBox = new TextBox(By.xpath("//input[@type=\"password\" and @autocomplete=\"new-password\"]"));
    public TextBox newPasswordConfirmTextBox = new TextBox(By.xpath("//span[text()=\"Confirmar nueva contraseña\"]/../following::input[@type=\"password\" and @autocomplete=\"new-password\"]"));
    public Button submitButton = new Button(By.xpath("//button[@type=\"submit\"]"));
    public Button exitButton = new Button(By.xpath("//button[@aria-label=\"Cerrar configuración\"]"));

}
