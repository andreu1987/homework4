package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainePageOtus extends BasePage {

    public MainePageOtus(WebDriver driver) {
        super(driver);
    }
    private static final String SITE_URL = "https://otus.ru";
    private static final String EMAIL = "mahinom955@touchend.com";
    private static final String PASSWORD = "!Qwerty123";

    @FindBy(css = ".sc-mrx253-0")
    private WebElement clickElementEnter;

    @FindBy(xpath = "//input[@name = 'email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type = 'password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class = 'sc-9a4spb-0 gYNtqF sc-11ptd2v-2-Component cElCrZ']")
    private WebElement clickElementEnterEnter;

    // переход на сайт
    public MainePageOtus goTo(){
        driver.get(SITE_URL);
        return this;
    }

    // размер экрана
    public MainePageOtus maximize(){
        driver.manage().window().maximize();
        return this;
    }
    // размер экрана
    public MainePageOtus getSize(){
        System.out.println(driver.manage().window().getSize());
        return this;
    }

    // кликнуть по кнопки
    public MainePageOtus clickElementEnter(){
        clickElementEnter.click();
        return this;
    }

    // ввод в поле
    public MainePageOtus authorizationEmail(){
       emailInput.clear();
       emailInput.sendKeys(EMAIL);
       return this;
    }
    // ввод в поле
    public MainePageOtus authorizationPassword(){
        passwordInput.clear();
        passwordInput.sendKeys(PASSWORD);
        return this;
    }

    // кликнуть по кнопки
    public MainePageOtus clickElementEnterEnter(){
        clickElementEnterEnter.click();
        return this;
    }

    // Вывести в лог куки
    public MainePageOtus getCookies(){
        System.out.println(driver.manage().getCookies());
        return this;
    }


}
