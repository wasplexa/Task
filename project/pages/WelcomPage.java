package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
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



    public  void open() {
        browser.goTo(config.getApplicationUrl());
    }





}
