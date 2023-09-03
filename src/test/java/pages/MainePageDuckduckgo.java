package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainePageDuckduckgo extends BasePage {
    private static final String SITE_URL = "https://duckduckgo.com/";
    private static final String TITLE = "ОТУС";
    @FindBy(xpath = "//input[@name='q']")
    private WebElement fieldInput;

    @FindBy(xpath = "//input[@tabindex='2']")
    private WebElement clickElement;

    public MainePageDuckduckgo(WebDriver driver) {
        super(driver);
    }

    // переход на сайт
    public MainePageDuckduckgo goTo(){
        driver.get(SITE_URL);
        return this;
    }

    // ввод в поле
    public MainePageDuckduckgo setInputText(){
        fieldInput.clear();
        fieldInput.sendKeys(TITLE);
        return this;
    }

    // кликнуть по кнопки
    public MainePageDuckduckgo clickElement (){
        clickElement.click();
        return this;
    }
}
