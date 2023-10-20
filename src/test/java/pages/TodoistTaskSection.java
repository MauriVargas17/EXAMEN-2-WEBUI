package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

public class TodoistTaskSection {
    public String taskName;
    public Button addTask = new Button(By.xpath("//button[@data-track=\"navigation|quick_add\"]"));
    public TextBox name = new TextBox(By.xpath("//p[@data-placeholder=\"Task name\"]"));
    public Button add = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));
    public Button task = new Button(By.xpath("//div[text()=\""+taskName+"\"]"));

    public void setTaskName(String name){
        taskName = name;
        task = new Button(By.xpath("//div[text()=\""+taskName+"\"]"));
    }

}
