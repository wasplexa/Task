package YandexMarket.framework.brawser.elemets;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractElement {
        private static ConfigFileReader config = ConfigFileReader.configFileReader;
        private By locator;
        private String name;
        private WebDriver driver;
        private WebDriverWait wait;
        private WebElement element;

        public AbstractElement(By locator, String name) {
            this.locator = locator;
            this.name = name;
            driver = Browser.BROWSER.getDriver();
            this.element = driver.findElement(locator);
            wait = new WebDriverWait(driver, Duration.ofSeconds(config.getTimeWait()));
        }

        public void click() {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                element.click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void sendKeys(String text) {
            try {
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
                element.sendKeys(text);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String getText() {
            try {
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
                return element.getText();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public String getAttribute(String name) {
            try {
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
                return element.getAttribute(name);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public String getHref() {
            return getAttribute("href");
        }
    public void clear( ) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            element.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

