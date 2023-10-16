package pages;

import controls.*;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

import java.util.Date;

public class ItemSection {
    public String itemid = "";
    public String nameItem = "Mauri-"+new Date().getTime();
    public TextBox addNewItemTextBox = new TextBox(By.xpath("//textarea[@id=\"NewItemContentInput\"]"));
    public Button addNewItemButton = new Button(By.xpath("//input[@id=\"NewItemAddButton\"]"));
    public Item newItemByXpath = new Item(By.xpath("//div[@class=\"ItemContentDiv\" and text()='"+nameItem+"']"));
    public Project currentProjectTitleById = new Project(By.id("CurrentProjectTitle"));
    public TextBox editItemTextBox = new TextBox(By.xpath("//*[@id=\"ItemEditTextbox\"]"));
    public Option optionItem = new Option(By.xpath("//div[@style=\"display: block;\"]/img[@title='Options']"));
    public Button editButton = new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));

    public void setNameItem(String nameItem){
        this.nameItem = nameItem;
        newItemByXpath = new Item(By.xpath("//div[@class=\"ItemContentDiv\" and text()='"+nameItem+"']"));
    }

    public void setItemid(String itemid){
        this.itemid = itemid;
    }

}
