package tarea1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import session.Session;

import java.util.Date;

public class ProjectAndItemTest {

    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    ProjectSection projectSection = new ProjectSection();
    ItemSection itemSection = new ItemSection();
    String itemid = "";

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

    public void createProject() throws InterruptedException {
        String nameProject = projectSection.nameProject;
        projectSection.addNewProjectButton.click();
        projectSection.projectNameTextBox.setText(nameProject);
        projectSection.addProjectButton.click();
        Thread.sleep(2000);
        String actual = projectSection.newProjectById.getText();
        Assertions.assertEquals(nameProject,actual,"ERROR: El proyecto no se creo");
    }

    public void updateProject() throws InterruptedException {
        String nameProject = "Updated-"+new Date().getTime();
        projectSection.newProjectByXpath.click();
        projectSection.optionButton.click();
        projectSection.editButton.click();
        projectSection.editProjectNameTextBox.clearSetText(nameProject);
        projectSection.setNameProject(nameProject);
        projectSection.saveButton.click();
        Thread.sleep(2000);
        boolean actual = projectSection.newProjectByXpath.getControl().isDisplayed();
        Assertions.assertTrue(actual,"ERROR: El proyecto no se actualizó");

    }

    public void createItem() throws InterruptedException {
        itemSection.setNameItem("Mauri-"+new Date().getTime());
        itemSection.addNewItemTextBox.setText(itemSection.nameItem);
        itemSection.addNewItemButton.click();
        boolean actual = itemSection.newItemByXpath.getControl().isDisplayed();
        itemid = itemSection.newItemByXpath.getControl().getAttribute("itemid");
        itemSection.setItemid(itemid);
        Thread.sleep(2000);
        Assertions.assertTrue(actual,"ERROR: El item no se creó");
    }

    public void updateItem() throws InterruptedException {
        String nameItem = "UpdatedItem-"+new Date().getTime();
        itemSection.newItemByXpath.click();
        Thread.sleep(1000);
        itemSection.editItemTextBox.clearSetText(nameItem);


        itemSection.setNameItem(nameItem);
        itemSection.currentProjectTitleById.click();
        Thread.sleep(2000);
        boolean actual = itemSection.newItemByXpath.getControl().isDisplayed();
        Assertions.assertTrue(actual,"ERROR: El item no se actualizó");


    }

    @Test
    public void tarea1Test() throws InterruptedException {
        login();
        createProject();
        updateProject();
        createItem();
        updateItem();
    }




}
