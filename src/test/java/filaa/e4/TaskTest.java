package filaa.e4;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import session.Session;

public class TaskTest {

    String email = "tuertazoo24@tuerto.com";
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
    public void ejercicio3Test() throws InterruptedException {
        login();
        createTask();


    }

}
