package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.Text;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class RegistrationFirst {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Text passwordIn = new Text(By.xpath("//input[@placeholder='Choose Password']"), "passwordIn");
    private Text emailIn = new Text(By.xpath("//input[@placeholder='Your email']"), "emailIn");
    private Text domainIn = new Text(By.xpath("//input[@placeholder='Domain']"), "domainIn");
    private Text clickToSecond = new Text(By.xpath("//a[@class='button--secondary']"), "clickToSecond");
    private Text domainClick = new Text(By.xpath("//div[@class='dropdown__field']"), "domainClick");
    private Text domainDrop = new Text(By.xpath("//div[@class='dropdown__list-item']"), "domainDrop");
    private Text clickAccept = new Text(By.xpath("//span[@class='checkbox']"), "clickAccept");
    private Browser browser = Browser.BROWSER;

    public void inputPassword() {
        passwordIn.clear();
        passwordIn.sendKeys(config.getPassword());
    }

    public void inputEmail() {
        emailIn.clear();
        emailIn.sendKeys(config.getEmailName());
    }

    public void inputDomain() {
        domainIn.clear();
        domainIn.sendKeys(config.getDomainName());
    }

    public void chooseDomain() {
        domainClick.click();
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            int item = random.nextInt(11);
            if(domainDrop.findElements().get(item).getText().equals("other")){
                i--;
                continue;
            }else domainDrop.findElements().get(item).click();
        }
        browser.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void acceptTerms() {
        clickAccept.click();
    }

    public void goTosecond() {
        clickToSecond.click();
    }
}
