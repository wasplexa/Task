package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


/**
 * Created by st on 30.03.2022.
 */
public class WelcomPage {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private WebDriverWait wait;
    private By JSAlert = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By JSConfirm = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By JSPrompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");

    public WelcomPage() {
        this.wait = new WebDriverWait(browser.getDriver(), Duration.ofSeconds(10));
    }

    public void open() {
        browser.goTo(config.getApplicationUrl());
    }

    public void clickJSAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(JSAlert));
        browser.findElement(JSAlert).click();
    }

    public void clickJSConfirm() {
        browser.findElement(JSConfirm).click();
    }

    public void clickJSPrompt() {
        browser.findElement(JSPrompt).click();
    }

}
