package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {
    public Button settingsButton = new Button(By.xpath("//a[text()=\"Settings\"]"));
    public TextBox fullNameTextBox = new TextBox(By.xpath("//*[@id=\"FullNameInput\"]"));
    public Button okButton = new Button(By.xpath("//span[text()=\"Ok\"]"));
    public TextBox oldP = new TextBox(By.xpath("//input[@id=\"TextPwOld\"]"));
    public TextBox newP = new TextBox(By.xpath("//input[@id=\"TextPwNew\"]"));
}
