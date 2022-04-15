package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegistartionSecond {

    private Browser browser = Browser.BROWSER;
private Text clear = new Text(By.xpath("//label[@for='interest_unselectall']"),"clear");
private Text choose = new Text(By.xpath("//label[@class='interest_tires']"),"choose");
private Text upload = new Text(By.xpath("//a[@class='avatar-and-interests__upload-button']"),"upload");


    public void chooseInterest() {
        clear.click();


    }

   public void uploadImage() {
        upload.click();
    }
}
