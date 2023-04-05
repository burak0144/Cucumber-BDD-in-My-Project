package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.sql.DriverManager;
import java.time.Duration;

public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String anasayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(anasayfa));
    }
    @Then("kullanici “Add Element” butona basar")
    public void kullaniciAddElementButonaBasar() {
        herokuappPage.addElement.click();
    }

    @Then("kullanici “Delete” butonu gorunur oluncaya kadar bekleyin")
    public void kullaniciDeleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));

    }

    @And("kullanici “Delete” butonunun gorunur oldugunu test edin")
    public void kullaniciDeleteButonununGorunurOldugunuTestEdin() {

        Assert.assertTrue(herokuappPage.deleteElement.isDisplayed());
    }

    @And("kullanici Delete butonuna basarak butonu silin")
    public void kullaniciDeleteButonunaBasarakButonuSilin() {
        herokuappPage.deleteElementList.forEach(WebElement::click);
    }

    @And("kullanici Delete butonunun gorunmedigini test edin")
    public void kullaniciDeleteButonununGorunmediginiTestEdin() {
        Assert.assertEquals(0, herokuappPage.deleteElementList.size());
    }
}
