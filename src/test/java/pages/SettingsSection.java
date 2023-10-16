package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {
    public Button settingsButton = new Button(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_PanelHeaderButtons\"]/a[1]"));
    public TextBox fullNameTextBox = new TextBox(By.xpath("//*[@id=\"FullNameInput\"]"));
    public Button okButton = new Button(By.xpath("/html/body/div[9]/div[2]/div/button[1]/span"));

}
