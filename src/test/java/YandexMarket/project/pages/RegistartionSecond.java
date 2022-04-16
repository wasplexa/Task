package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegistartionSecond {

    private Browser browser = Browser.BROWSER;
    private Text clear = new Text(By.xpath("//label[@for='interest_unselectall']"), "clear");
    private Text choose = new Text(By.xpath("//div[@class='avatar-and-interests__interests-list__item']"), "choose");
    private Text clickInterst = new Text(By.xpath("//span[@class='checkbox__box']"), "clickInterst");

    private Text upload = new Text(By.xpath("//a[@class='avatar-and-interests__upload-button']"), "upload");
    private Text goToThird = new Text(By.xpath("//button[@name='button']"), "goToThird");


    public void chooseInterest() {
        clear.click();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(21);
            WebElement choos = choose.findElements().get(number);
            WebElement element = clickInterst.findElements().get(number);
            element.click();
            if (choos.getText().equals("Select all")) {
                if (choos.getText().equals("Unselect all")) {
                    --i;
                } else if (choos.getText().equals("Unselect all")) {
                    --i;
                }
            } else {
                choose.findElements().get(number).click();
            }
        }
    }

    public void uploadImage() throws IOException, InterruptedException {
        upload.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("L:\\project\\es\\final\\First\\AutoITScript.exe");

    }

    public void goThird() {

        for (int i = 0; i < goToThird.findElements().size(); i++) {
            if (goToThird.findElements().get(i).getText().equals("Next")) goToThird.findElements().get(i).click();
            break;
        }

    }
}
