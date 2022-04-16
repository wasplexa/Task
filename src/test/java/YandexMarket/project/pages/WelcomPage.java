package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.Text;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




/**
 * Created by st on 30.03.2022.
 */
public class WelcomPage {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private Text clickToButtonHERE = new Text(By.xpath("//a[@class='start__link']"), "clickToButtonHERE");

    public  void open() {
        browser.goTo(config.getApplicationUrl());
    }
    public void clickButtonHERE() {
        clickToButtonHERE.click();
    }





}
