package YandexMarket.project.test;


import YandexMarket.project.pages.RegistartionSecond;
import YandexMarket.project.pages.RegistrationFirst;
import YandexMarket.project.pages.WelcomPage;
import YandexMarket.utils.ConfigFileReader;
import YandexMarket.utils.Logger;
import org.testng.annotations.Test;

/**
 * Created by st on 30.03.2022.
 */
public class MyTest extends BaseTest {
    RegistrationFirst registrationFirst = new RegistrationFirst();
    RegistartionSecond registartionSecond = new RegistartionSecond();
    private ConfigFileReader config = ConfigFileReader.configFileReader;


    @Test
    public void firstTest()  {
        WelcomPage welcomPage = new WelcomPage();
        welcomPage.open();
        Logger.error("ff");
        registrationFirst.clickButtonHERE();
        registrationFirst.inputPassword();
        registrationFirst.inputEmail();
        registrationFirst.inputDomain();
        registrationFirst.chooseDomain();
        registrationFirst.acceptTerms();
        registrationFirst.goTosecond();
        registartionSecond.chooseInterest();
    }


}


