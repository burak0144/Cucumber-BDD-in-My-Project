package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestPage {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//p[.='click']")
    public List<WebElement> clickText;

    @FindBy(xpath = "//input[@value=\"click me\"]")
    public WebElement clickButonu;

    @FindBy(xpath = "//p[text()=' down 32']")
    public List<WebElement> downButton;
}


