package pages;
import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TodoistProjectSection {
    public String projectName = "heno";
    public Button addButton = new Button(By.xpath("//button[@aria-label=\"Add project\"]"));
    public TextBox name = new TextBox(By.xpath("//input[@id=\"edit_project_modal_field_name\"]"));
    public Button submitButton = new Button(By.xpath("//button[@type=\"submit\"]"));
    public Button project = new Button(By.xpath("//div[text()=\"heno\"]"));

    public void setProjectName(String name){
        projectName = name;
        Button project = new Button(By.xpath("//div[text()=\""+name+"\"]"));
    }
}
