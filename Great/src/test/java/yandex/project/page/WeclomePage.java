package yandex.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeclomePage {
    private WebDriver driver;

    private By signIn = By.xpath("/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/a");
    public WeclomePage(WebDriver driver) {
        this.driver = driver;
    }
public void clickSignIn(){
        driver.findElement(signIn).click();
}
}
