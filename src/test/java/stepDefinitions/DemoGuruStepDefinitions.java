package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DemoGuruStepDefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String anaSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(anaSayfa));
    }


    @And("{string} sutunundaki tum degerleri yazdirir")
    public void istenenBasliktakiSutunlariYazdirma(String istenenBaslik) {
        switch (istenenBaslik) {
            case "Company":
                demoGuruPage.istenenCell(1);
            break;
            case "Group":
                demoGuruPage.istenenCell(2);
                break;
            case "Prev Close (Rs)":
                demoGuruPage.istenenCell(3);
                break;
            case "Current Price (Rs)":
                demoGuruPage.istenenCell(4);
                break;
            case "% Change":
                demoGuruPage.istenenCell(5);
                break;
            default:
                demoGuruPage.istenenCell(1);
        }


        }


}



