package YandexMarket.project.test;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.BeforeClass;

/**
 * Created by st on 30.03.2022.
 */
public class BaseTest {
    private Browser browser;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeClass

    public void before(){
        System.setProperty(config.getDriverAdapter(),config.getDriverPath());
       // browser.getDriver().manage().window().maximize();
           }
}
