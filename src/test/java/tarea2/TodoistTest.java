package tarea2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.TodoistLoginSection;
import pages.TodoistMenuSection;
import session.Session;

public class TodoistTest {

    TodoistLoginSection todoistLoginSection = new TodoistLoginSection();
    TodoistMenuSection todoistMenuSection = new TodoistMenuSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    public void login(){
        todoistLoginSection.email.setText("tuerto@tuerto.com");
        todoistLoginSection.password.setText("estoycansadojefe123");
        todoistLoginSection.login.click();

        Assertions.assertTrue(todoistMenuSection.profile.isControlDisplayed(), "ERROR: No se pudo ingresar");
    }
    @Test
    public void tarea2Test(){
        login();
    }


}
