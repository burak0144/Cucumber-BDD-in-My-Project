package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Add Element']")
    public WebElement addElement;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteElement;

    @FindBy(xpath = "//button[text()='Delete']")
    public List<WebElement> deleteElementList;
}
