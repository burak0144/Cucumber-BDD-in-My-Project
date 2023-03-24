package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TestPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageDefs {
    TestPage testPage=new TestPage();
    Actions actions = new Actions(Driver.getDriver());
    int down32Toplam;
    int clickToplam;
    int sonuc;
    @Given("{string} adresine gidin")
    public void adresine_gidin(String url) {
        Driver.getDriver().get(url);

    }
    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(int clickSayisi) {
        for (int i = 1; i <=clickSayisi ; i++) {
         testPage.clickButonu.click();
        }

    }
    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer spaceSayisi) {
        for (int i = 1; i <=spaceSayisi ; i++) {
            actions.sendKeys(Keys.SPACE).perform();
        }
    }
    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        List<WebElement> downList=testPage.downButton;

        for (WebElement w:downList
             ) {
           down32Toplam+=Integer.parseInt(w.getText().replaceAll("\\D",""));
            // downList.forEach(t->t.getText().replaceAll("^[0-9]",""));
        }

        System.out.println(down32Toplam);


    }
    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
        List<WebElement>clickList=testPage.clickText;
        for (WebElement w:clickList
             ) {
           clickToplam+= w.getText().length();
        }
        sonuc=down32Toplam-clickToplam;

    }
    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(int expsonuc) {
        Assert.assertEquals(expsonuc,sonuc);
    }

}
