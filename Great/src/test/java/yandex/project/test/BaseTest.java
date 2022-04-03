package yandex.project.test;

import org.testng.annotations.BeforeClass;
import yandex.framework.Browser;

public class BaseTest {
@BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver","L:\\aasd\\chromedriver.exe");
        Browser.getDriver().manage().window().maximize();
    }

}
