package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaStepDefinitions {
    MedunnaPage medunnaPage=new MedunnaPage();
    @When("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {
        ReusableMethods.waitForVisibility(medunnaPage.signinSymbol,5);
        medunnaPage.signinSymbol.click();
        medunnaPage.signinButton.click();

    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String userName) {
        userName= Faker.instance().name().username();
        medunnaPage.username.sendKeys(userName);
    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {
        password=Faker.instance().internet().password();
        medunnaPage.password.sendKeys(password);
    }

    @And("signine tiklar")
    public void signineTiklar() {
        medunnaPage.signinWithCredentials.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
        //contains text() olayı tum web elementleri icinde, icerisinde text olarak 'şu'  text i iceren locateleri bul diyor.
        // bunu baska bir text icerigi ile aranan metni değistirerek te kullanabiliriz

        ReusableMethods.waitForVisibility(medunnaPage.popUpMessage,5);
        Assert.assertTrue(medunnaPage.popUpMessage.isDisplayed());
    }

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }
}
