package yandex.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Catalog {
    private WebDriver driver;

    public Catalog(WebDriver driver) {
        this.driver = driver;
    }
    private By catalogClick = By.xpath("//*[@id=\"catalogPopupButton\"]");
    public void catalogClickButton(){
        driver.findElement(catalogClick).click();
    }
    private By catalog = By.xpath("//*[@id=\"catalogPopup\"]/div/div/div/div/div/div/div[1]/div/ul/li");
    public void catalogCountprint(){
      int count= driver.findElements(catalog).size();
        System.out.println(count);
    }
    public void sectionRandom(){
        List<WebElement> catalogAll = driver.findElements(catalog);
        Random random = new Random();
        int numberOfSection = random.nextInt(catalogAll.size());
        catalogAll.get(numberOfSection).click();
    }
}
