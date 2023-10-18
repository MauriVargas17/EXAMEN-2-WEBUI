package filab.e4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import pages.SettingsSection;
import session.Session;

import java.util.Date;

public class PasswordTest {
    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    SettingsSection settingsSection = new SettingsSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }

    public void login(String email, String password){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(email);
        loginSection.pwdTextBox.setText(password);
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR: No se pudo iniciar sesion");
    }

    public void changePassword() throws InterruptedException {
        String newP = "12345";
        String oldP = "holabola";
        settingsSection.settingsButton.click();
        settingsSection.oldP.clearSetText(oldP);
        settingsSection.newP.clearSetText(newP);
        settingsSection.okButton.click();
        menuSection.logoutButton.click();

        login("tuerto@tuerto.com", newP);


    }

    @Test
    public void ejercicio4Test() throws InterruptedException {
        login("tuerto@tuerto.com", "holabola");
        changePassword();
    }
}

