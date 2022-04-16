package YandexMarket.project.test;


import YandexMarket.project.pages.RegistartionSecond;
import YandexMarket.project.pages.RegistrationFirst;
import YandexMarket.project.pages.WelcomPage;
import YandexMarket.utils.ConfigFileReader;
import YandexMarket.utils.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by st on 30.03.2022.
 */
public class MyTest extends BaseTest {
    RegistrationFirst registrationFirst = new RegistrationFirst();
    RegistartionSecond registartionSecond = new RegistartionSecond();
    WelcomPage welcomPage = new WelcomPage();
    private ConfigFileReader config = ConfigFileReader.configFileReader;


    @Test
    public void firstTest() throws IOException, InterruptedException {
        welcomPage.open();
        welcomPage.clickButtonHERE();

        registrationFirst.inputPassword();
        registrationFirst.inputEmail();
        registrationFirst.inputDomain();
        registrationFirst.chooseDomain();
        registrationFirst.acceptTerms();
        registrationFirst.goTosecond();

        registartionSecond.chooseInterest();
        registartionSecond.uploadImage();
        registartionSecond.goThird();
    }


}


