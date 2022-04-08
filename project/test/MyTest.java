package YandexMarket.project.test;

import YandexMarket.framework.brawser.allerts.MyAllerts;
import YandexMarket.project.pages.WelcomPage;
import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.Test;

/**
 * Created by st on 30.03.2022.
 */
public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @Test
    public void firstTest() {

        WelcomPage welcomPage = new WelcomPage();
        MyAllerts myAllerts = new MyAllerts();
        welcomPage.open();
        welcomPage.clickJSAlert();
        myAllerts.accept();
        welcomPage.clickJSConfirm();
        myAllerts.disimiss();
        welcomPage.clickJSPrompt();
        myAllerts.sendText();

    }
}


