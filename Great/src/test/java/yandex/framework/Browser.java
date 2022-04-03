package yandex.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver DRIVER;

    public static WebDriver getDriver(){
        if(DRIVER==null) DRIVER = new ChromeDriver();
        return DRIVER;
    }

}
