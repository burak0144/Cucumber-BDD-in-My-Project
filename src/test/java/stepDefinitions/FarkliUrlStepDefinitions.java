package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class FarkliUrlStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String gidilecekUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekUrl));
    }
    @And("{string} sayfasina gidildigini test et")
    public void sayfasinaGidildiginiTestEt(String gidilecekUrl) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertEquals(ConfigReader.getProperty(gidilecekUrl),Driver.getDriver().getCurrentUrl());
    }


}
