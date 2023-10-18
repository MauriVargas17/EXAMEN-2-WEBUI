package pages;
import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TodoistProjectSection {
    public Button addButton = new Button(By.xpath("//button[@aria-label=\"Añadir un proyecto\"]"));
    public TextBox name = new TextBox(By.xpath("//input[@id=\"edit_project_modal_field_name\"]"));
    public Button submitButton = new Button(By.xpath("//button[@type=\"submit\"]"));
    public
}
