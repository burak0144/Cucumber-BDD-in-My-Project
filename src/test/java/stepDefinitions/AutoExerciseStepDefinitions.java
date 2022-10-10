package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoExerciseStepDefinitions {
    AutoExercisePage autoExercisePage=new AutoExercisePage();
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String gidilecekSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekSayfa));
    }

    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        autoExercisePage.loginButton.click();
    }

    @And("gecerli username {string} girer")
    public void gecerliUsername(String username) {
        autoExercisePage.autoUsernameBox.sendKeys(ConfigReader.getProperty(username));
    }

    @And("gecerli password {string} girer")
    public void gecerliPassword(String password) {
        autoExercisePage.autoPasswordBox.sendKeys(ConfigReader.getProperty(password));
    }


    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        autoExercisePage.loginSubmit.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
      Assert.assertTrue(autoExercisePage.basariliLogin.isDisplayed());
    }
    @Then("sayfaya giris yapilmadigini kontrol eder")
    public void sayfayaGirisYapilmadiginiKontrolEder() {
    Assert.assertTrue(autoExercisePage.basarisizLogin.isDisplayed());
    }

    @And("gecersiz username {string} girer")
    public void gecersizUsernameGirer(String username) {
        autoExercisePage.autoUsernameBox.sendKeys(ConfigReader.getProperty(username));
    }

    @And("gecersiz password {string} girer")
    public void gecersizPasswordGirer(String password) {
        autoExercisePage.autoPasswordBox.sendKeys(ConfigReader.getProperty(password));
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    //yukardaki notasyonlari kullanmama sebebimiz onlar ConfigReader.getProperty den valuelari alirlar
    //asagida biz outline ile .features'da Example ile username ve password'u kendimiz orda olusturduk
    @And("scanario outline'dan username {string} girer")
        public void scenarioOutlineDanPasswordOlarakYazar(String username) {
            autoExercisePage.autoUsernameBox.sendKeys(username);
        }

    @And("scanario outline'dan password {string} girer")
    public void scanarioOutlineDanPasswordGirer(String password) {
        autoExercisePage.autoPasswordBox.sendKeys(password);
    }
}
