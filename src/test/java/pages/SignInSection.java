package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SignInSection {
    public Button signUpFreeButton = new Button(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]"));
    public TextBox fullNameTextBox = new TextBox(By.xpath("//input[@name=\"ctl00$MainContent$SignupControl1$TextBoxFullName\"]"));
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@name=\"ctl00$MainContent$SignupControl1$TextBoxEmail\"]"));
    public TextBox pwdTextBox = new TextBox(By.xpath("//input[@name=\"ctl00$MainContent$SignupControl1$TextBoxPassword\"]"));
    public Button check = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
