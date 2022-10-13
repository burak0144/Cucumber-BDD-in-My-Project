package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class PracticeAmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }
    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
      actions.moveToElement(amazonPage.signinMoveTo).
     click(amazonPage.signinAnasayfa).perform();

    }
    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
      amazonPage.emailBox.sendKeys(faker.internet().emailAddress());
    }
    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshot("amazonHataliEmail");

    }
    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {
        actions.click(amazonPage.continueButton).perform();

    }
    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
        String expectedText="There was a problem";
        String actualText=amazonPage.girisYapilamadi.getText();
        Assert.assertEquals("Problem mesaji esit degil",expectedText,actualText);

    }
    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
        amazonPage.needHelpButton.click();

    }
    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
        amazonPage.fogetButton.click();

    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(amazonPage.assistanWE.isDisplayed());

    }
    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        amazonPage.createButton.click();

    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
        Assert.assertTrue(amazonPage.createButton.isDisplayed());

    }

}
