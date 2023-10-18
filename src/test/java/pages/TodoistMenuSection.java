package pages;

import controls.Button;
import controls.Option;
import org.openqa.selenium.By;

public class TodoistMenuSection {

    public Option profile = new Option(By.xpath("//img[@src=\"https://d1nbslm0j6pual.cloudfront.net?text=T&size=50\"]"));
    public Button logout = new Button(By.xpath("//span[text()='Cerrar sesión']"));
    public Button settings = new Button(By.xpath("//*[@id=\"user_menu_settings_menuitem\"]"));

}
