package yandex.project.test;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import yandex.framework.Browser;
import yandex.project.page.Authorization;
import yandex.project.page.Catalog;
import yandex.project.page.WeclomePage;

public class MyTest extends BaseTest {
    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver = Browser.getDriver();
        driver.get("https://market.yandex.ru/?lr=213");
        Thread.sleep(Long.parseLong(("30000")));
        WeclomePage weclomePage = new WeclomePage(driver);
        weclomePage.clickSignIn();
        Authorization authorization = new Authorization(driver);
        authorization.loginInput();
        authorization.loginClickButton();
        Thread.sleep(2000);
        authorization.passwordInput();
        authorization.passwordClickButton();
        Thread.sleep(2000);
        Catalog catalog = new Catalog(driver);
        catalog.catalogClickButton();
        Thread.sleep(2000);
        catalog.catalogCountprint();
        catalog.sectionRandom();
    }
}

