package pages;

import controls.Button;
import controls.Option;
import controls.Project;
import controls.TextBox;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

import java.util.Date;

public class ProjectSection {
    public String nameProject = "Mauri-"+new Date().getTime();
    public Button addNewProjectButton = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox projectNameTextBox = new TextBox(By.id("NewProjNameInput"));
    public Button addProjectButton = new Button(By.id("NewProjNameButton"));
    public Project newProjectById = new Project(By.xpath("//td[text()=\""+nameProject+"\"]"));
    public Project newProjectByXpath = new Project(By.xpath("//li[last()]//td[text()='"+nameProject+"']"));
    public Option optionButton = new Option(By.xpath("//div[@style=\"display: block;\"]/img[@title='Options']"));
    public Button editButton = new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public TextBox editProjectNameTextBox = new TextBox(By.xpath("//td/div/input[@id=\"ItemEditTextbox\"]"));
    public Button saveButton = new Button(By.xpath("//td/div/img[@id=\"ItemEditSubmit\"]"));

    public void setNameProject(String nameProject){
        this.nameProject = nameProject;
        newProjectByXpath = new Project(By.xpath("//li[last()]//td[text()='"+nameProject+"']"));
    }
}
