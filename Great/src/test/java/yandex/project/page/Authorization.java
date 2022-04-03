package yandex.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authorization {
    private WebDriver driver;

    public Authorization(WebDriver driver) {
        this.driver = driver;
    }

    private By loginIn = By.xpath("//*[@id=\"passp-field-login\"]");
     public void loginInput(){
         driver.findElement(loginIn).sendKeys("po4tatestmail@yandex.by");
     }
     private By loginClick = By.xpath("//*[@id=\"passp:sign-in\"]");
     public void loginClickButton(){
         driver.findElement(loginClick).click();
     }
     private By passwordIn = By.xpath("//*[@id=\"passp-field-passwd\"]");
     public void passwordInput(){
driver.findElement(passwordIn).sendKeys("mailtest123");
     }
    private By passwordClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void passwordClickButton(){
driver.findElement(passwordClick).click();
    }
}
