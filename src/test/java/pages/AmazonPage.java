package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AmazonPage {
    public AmazonPage(){//Constructor olusturup public yapmamiz gerekir
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    public WebElement signinMoveTo;

    @FindBy(xpath = "(//span[text()='Sign in'])[1]")
            public WebElement signinAnasayfa;

    @FindBy(css = "#ap_email")
            public WebElement emailBox;

    @FindBy(xpath = "//h4")
            public WebElement girisYapilamadi;

    @FindBy(xpath = "//span[@id='continue']")
            public WebElement continueButton;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
            public WebElement needHelpButton;

    @FindBy(css = "#auth-fpp-link-bottom")
            public WebElement fogetButton;

    @FindBy(xpath = "//h1")
            public WebElement assistanWE;

    @FindBy(xpath = "//h1")
            public WebElement createButton;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement aramaSonucElementi;


}
