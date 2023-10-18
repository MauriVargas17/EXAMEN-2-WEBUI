package filab.e3;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.TodoistLoginSection;
import pages.TodoistMenuSection;
import pages.TodoistSettingsSection;
import session.Session;

public class UsuarioTest {

    String email = "tuertazo@tuerto.com";
    String password = "estoycansadojefe1234";

    TodoistLoginSection todoistLoginSection = new TodoistLoginSection();
    TodoistMenuSection todoistMenuSection = new TodoistMenuSection();
    TodoistSettingsSection todoistSettingsSection = new TodoistSettingsSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    public void login(){
        todoistLoginSection.email.setText(email);
        todoistLoginSection.password.setText(password);
        todoistLoginSection.login.click();

        Assertions.assertTrue(todoistMenuSection.profile.isControlDisplayed(), "ERROR: No se pudo ingresar");
    }

    public void changePassword() throws InterruptedException {
        todoistMenuSection.profile.click();
        todoistMenuSection.settings.click();
        Thread.sleep(2000);
        todoistSettingsSection.changePasswordButton.click();
        todoistSettingsSection.oldPasswordTextBox.clearSetText(password);
        password = password + "0";
        todoistSettingsSection.newPasswordTextBox.clearSetText(password);
        todoistSettingsSection.newPasswordConfirmTextBox.clearSetText(password);

        todoistSettingsSection.submitButton.click();
        Thread.sleep(1000);
        todoistSettingsSection.exitButton.click();

        todoistMenuSection.profile.click();
        Thread.sleep(1000);
        todoistMenuSection.logout.click();

        login();


        //Assertions.assertTrue(todoistSettingsSection.changePasswordButton.isControlDisplayed(), "ERROR: No se pudo cambiar contrasenia");

    }



    @Test
    public void tarea2Test() throws InterruptedException {
        login();

        changePassword();

    }

}
