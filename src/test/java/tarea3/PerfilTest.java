package tarea3;

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

public class PerfilTest {
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

    public void login(){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("tuerto@tuerto.com");
        loginSection.pwdTextBox.setText("12345");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR: No se pudo iniciar sesion");
    }

    public void changeName() throws InterruptedException {
        String newName = "Guado"+new Date().getTime();
        settingsSection.settingsButton.click();
        settingsSection.fullNameTextBox.clearSetText(newName);
        settingsSection.okButton.click();
        settingsSection.settingsButton.click();
        Thread.sleep(2000);Assertions.assertEquals(newName, settingsSection.fullNameTextBox.getControl().getAttribute("value"), "ERROR: No se actualiza el nombre correctamente");

    }

    @Test
    public void tarea3Test() throws InterruptedException {
        login();
        changeName();
    }
}
