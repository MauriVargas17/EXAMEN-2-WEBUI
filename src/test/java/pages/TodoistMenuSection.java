package pages;

import controls.Button;
import controls.Option;
import org.openqa.selenium.By;

public class TodoistMenuSection {

    public Option profile = new Option(By.xpath("//*[@id=\":r3:\"]/img"));
    public Button logout = new Button(By.xpath("//span[text()='Cerrar sesión']"));

}
