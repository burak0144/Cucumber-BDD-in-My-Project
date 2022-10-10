package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ObjectInputFilter;
import java.util.ArrayList;

public class WebUniversityStepDefinitions {
    WebUniversityPage webUniversityPage=new WebUniversityPage();
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
    String anasayfa=null;
    @Given("Kullanici {string} adresine gidin")
    public void kullaniciAdresineGidin(String adres) {
        Driver.getDriver().get(ConfigReader.getProperty(adres));
        anasayfa=Driver.getDriver().getWindowHandle();
    }

    @And("Kullanici Login Portal a kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiInin() {

        jse.executeScript("arguments[0].scrollIntoView(true);",webUniversityPage.loginPortal);
    }

    @Then("Kullanici Login Portal a tiklar")
    public void kullaniciLoginPortalaTiklayin() {
        //ReusableMethods.waitForClickablility(webUniversityPage.loginPortal,15);
        jse.executeScript("arguments[0].click();",webUniversityPage.loginPortal);
    }

    @Then("Kullanici Diger window'a gecin")
    public void kullaniciDigerWindowAGecin() {

        ArrayList<String>windowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowHandles.get(1));
    }

    @And("Kullanici {string} ve {string} kutularina deger yazdirin")
    public void kullaniciVeKutularinaDegerYazdirin(String username, String password) {
        webUniversityPage.usernameBox.sendKeys("Berk");
        webUniversityPage.passwordBox.sendKeys("Karanfil");
    }

    @And("Kullanici login butonuna basar")
    public void kullaniciButonunaBasin() {
        webUniversityPage.loginButton.click();
    }

    @Then("Kullanici Popup'ta cikan yazinin {string} oldugunu test edin")
    public void kullaniciPopupTaCikanYazininOldugunuTestEdin(String cikanYazi) {
        String actualText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(cikanYazi, actualText);

    }

    @And("Kullanici Ok diyerek Popup'i kapatin")
    public void kullaniciOkDiyerekPopupIKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Kullanici Ilk sayfaya geri donun")
    public void kullaniciIlkSayfayaGeriDonun() {

        Driver.getDriver().switchTo().window(anasayfa);
    }

    @Then("Kullanici Ilk sayfaya donuldugunu test edin")
    public void kullaniciIlkSayfayaDonuldugunuTestEdin() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty("WebUniversityUrl");
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
