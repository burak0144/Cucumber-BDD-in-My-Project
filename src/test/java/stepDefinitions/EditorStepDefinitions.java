package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {
    EditorPage editorPage=new EditorPage();
    @When("kullanici editor adresine gider")
    public void kullaniciEditorAdresineGider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorPage.newButonu.click();
    }

    @And("firstname olarak {string} yazar")
    public void firstnameOlarakYazar(String firstname) {
        editorPage.firstNameBox.sendKeys(firstname);
    }

    @And("lastname olarak {string} yazar")
    public void lastnameOlarakYazar(String lastname) {
        editorPage.lastNameBox.sendKeys(lastname);
    }

    @And("Position olarak {string} yazar")
    public void positionOlarakYazar(String position) {
        editorPage.possitionBox.sendKeys(position);
    }

    @And("Office olarak {string} yazar")
    public void officeOlarakYazar(String office) {
        editorPage.officeBox.sendKeys(office);
    }

    @And("Extension olarak {string} yazar")
    public void extensionOlarakYazar(String extension) {
        editorPage.extensionBox.sendKeys(extension);

    }

    @And("{int} saniye bekler")
    public void startOlarakYazar(int sure) {
        try {
            Thread.sleep(sure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Start olarak {string} yazar")
    public void startOlarakYazar(String startDate) {
        editorPage.dateBox.sendKeys(startDate);
    }

    @And("Salary olarak {string} yazar")
    public void salaryOlarakYazar(String salary) {
        editorPage.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorPage.createButonElement.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIlkIsimIleAramaYapar(String firstname) {
        editorPage.searchBoxElement.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrula(String firstname) {
        String sonucStr=editorPage.aramasonucuElement.getText();

      Assert.assertTrue(sonucStr.contains(firstname));
    }


}
