package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {
   public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy( xpath="//thead//tr//th")
    public List<WebElement> headList;

   @FindBy( xpath="//table[@class='dataTable']/tbody/tr")
    public List<WebElement> rowList;

   @FindBy( xpath="//table[@class='dataTable']/tbody/tr/td")
    public List<WebElement> cell;

   public void istenenCell(int istenenCellNumber){
       String dinamikXpath;
       int rowNumber=rowList.size();
       for (int i = 1; i <=rowNumber ; i++) {
           dinamikXpath="(//table[@class='dataTable']/tbody/tr["+i+"]/td["+istenenCellNumber+"])";
            WebElement istenenDeger=Driver.getDriver().findElement(By.xpath(dinamikXpath));
           System.out.println(istenenDeger.getText());
       }
   }

}
