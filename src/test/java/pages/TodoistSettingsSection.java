package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

public class TodoistSettingsSection {
    public Button changePasswordButton = new Button(By.xpath("//a[@href=\"/app/settings/account/password\"]"));
    public TextBox oldPasswordTextBox = new TextBox(By.xpath("//input[@type=\"password\" and @autocomplete=\"off\"]"));
    public TextBox newPasswordTextBox = new TextBox(By.xpath("//input[@type=\"password\" and @autocomplete=\"new-password\"]"));
    public TextBox newPasswordConfirmTextBox = new TextBox(By.xpath("//span[text()=\"Confirmar nueva contraseña\"]/../following::input[@type=\"password\" and @autocomplete=\"new-password\"]"));
    public Button submitButton = new Button(By.xpath("//button[@type=\"submit\"]"));
    public Button exitButton = new Button(By.xpath("//button[@aria-label=\"Close settings\"]"));
    public TextBox name = new TextBox(By.xpath("//*[@name=\"name\"]"));
    public Button update = new Button(By.xpath("//button[@type=\"submit\"]"));
    public Button deleteAccount = new Button(By.xpath("//a[@aria-describedby=\"delete-account-info\"]"));
    public TextBox reason = new TextBox(By.xpath("//*[@name=\"reason\"]"));
    public TextBox inputDeletePassword = new TextBox(By.xpath("//*[@name=\"password\"]"));
    public Button confirmDelete = new Button(By.xpath("//button[@type=\"submit\"]"));
    public TextBox deleteNotification = new TextBox(By.xpath("//div[text()=\"Your account has been deleted.\"]"));
}
