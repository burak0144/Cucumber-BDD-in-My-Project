package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;



public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }

    @And("iPhone icin arama yapar")
    public void iphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iPhone", Keys.ENTER);
    }

    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
       String sonucYazisi=amazonPage.aramaSonucElementi.getText();
       Assert.assertTrue(sonucYazisi.contains("iPhone"));
    }

    @And("tea pot icin arama yapar")
    public void teaPotIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("tea pot", Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarinTeaPotIcerdiginiTestEder() {
        String sonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(sonucYazisi.contains("tea pot"));
    }

    @And("flower icin arama yapar")
    public void flowerIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("flower", Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarinFlowerIcerdiginiTestEder() {
        String sonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(sonucYazisi.contains("flower"));
    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatin() {
        Driver.quitDriver();
    }



    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String sonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(sonucYazisi.contains(arananKelime));
    }


}
