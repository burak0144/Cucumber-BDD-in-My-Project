package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {
    public AutoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy (xpath = "(//input[@type='email'])[1]")
    public WebElement autoUsernameBox;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement autoPasswordBox;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement loginSubmit;

    @FindBy (xpath = "//b[text()='Berk01']")
    public WebElement basariliLogin;

    @FindBy (xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement basarisizLogin;
}
