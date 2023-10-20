package filac.e4;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import session.Session;

import javax.xml.crypto.Data;
import java.util.Date;

public class CreateDeleteUserTest {

    String email = "tuertazoo"+new Date().getTime()+"@tuerto.com";
    String password = "estoycansadojefe1234";

    TodoistLoginSection todoistLoginSection = new TodoistLoginSection();
    TodoistMenuSection todoistMenuSection = new TodoistMenuSection();
    TodoistSettingsSection todoistSettingsSection = new TodoistSettingsSection();
    TodoistRegisterSection todoistRegisterSection = new TodoistRegisterSection();
    TodoistProjectSection todoistProjectSection = new TodoistProjectSection();
    TodoistTaskSection todoistTaskSection = new TodoistTaskSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    public void deleteUser(){
        todoistMenuSection.profile.click();
        todoistMenuSection.settings.click();
        todoistSettingsSection.deleteAccount.click();
        todoistSettingsSection.reason.clearSetText("fsdasdf");
        todoistSettingsSection.inputDeletePassword.clearSetText(password);
        todoistSettingsSection.confirmDelete.click();

        Assertions.assertTrue(todoistSettingsSection.deleteNotification.isControlDisplayed(), "ERROR: No se pudo borrar cuenta");


    }

    public void changeName() throws InterruptedException {
        String name = "Josefin2"+ new Date().getTime();
        todoistMenuSection.profile.click();
        todoistMenuSection.settings.click();
        todoistSettingsSection.name.clearSetText(name);
        Thread.sleep(1000);
        todoistSettingsSection.update.click();
        todoistSettingsSection.exitButton.click();
        todoistMenuSection.profile.click();
        todoistMenuSection.logout.click();
        todoistMenuSection.confirmLogOut.click();

        //todoistMenuSection.outsideOptions.click();
        todoistMenuSection.outsideLogIn.click();

        login();
        //todoistMenuSection.profile.click();
        //todoistMenuSection.settings.click();
        todoistMenuSection.setNewName(name);

        Assertions.assertEquals( name, todoistMenuSection.name.getControl().getText(),"ERROR: No se pudo cambiar nombre");

    }

    public void createTask(){
        String task = "Holaa";
        todoistTaskSection.setTaskName(task);
        todoistTaskSection.addTask.click();
        todoistTaskSection.name.clearSetText(task);
        todoistTaskSection.add.click();
        Assertions.assertTrue(todoistTaskSection.task.isControlDisplayed(), "ERROR: No se pudo crear proyecto");
    }

    public void login(){
        todoistLoginSection.email.setText(email);
        todoistLoginSection.password.setText(password);
        todoistLoginSection.login.click();

        Assertions.assertTrue(todoistMenuSection.profile.isControlDisplayed(), "ERROR: No se pudo ingresar");
    }


    public void createUser(){
        todoistRegisterSection.register.click();
        todoistRegisterSection.email.clearSetText(email);
        todoistRegisterSection.password.clearSetText(password);
        todoistRegisterSection.submit.click();

        Assertions.assertTrue(todoistMenuSection.profile.isControlDisplayed(), "ERROR: No se pudo crear usuario");
    }

    public void createProject() throws InterruptedException {
        todoistProjectSection.addButton.click();
        String projectName = "heno";
        todoistProjectSection.setProjectName(projectName);
        todoistProjectSection.name.clearSetText(projectName);
        todoistProjectSection.submitButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(todoistProjectSection.project.isControlDisplayed(), "ERROR: No se pudo crear proyecto");
    }



    @Test
    public void e3Test() throws InterruptedException {
        createUser();
        Thread.sleep(1000);
        deleteUser();


    }

}
