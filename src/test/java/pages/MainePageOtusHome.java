package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainePageOtusHome extends BasePage {
    String SITE_URL = "https://otus.home.kartushin.su/lesson/index.htm";
    
    @FindBy(xpath = "//*[@data-id='id-3']")
    private WebElement clickElement;

    public MainePageOtusHome(WebDriver driver) {
        super(driver);
    }
    
    // переход на сайт
    public MainePageOtusHome goTo(){
        driver.get(SITE_URL);
        return this;
    }
    
    // размер экрана
    public MainePageOtusHome fullscreen(){
        driver.manage().window().fullscreen();
        return this;
    }
    
    // размер экрана 
    public MainePageOtusHome getSize(){
        System.out.println(driver.manage().window().getSize());
        return this;
    }

    // кликнуть по элементу
    public MainePageOtusHome clickElement (){
        clickElement.click();
        return this;
    }

    // ожидание элемента
    public MainePageOtusHome elementLoadTimeout(){
        waitVisibility(By.xpath("//*[@data-id='id-3']"));
        return this;
    }
    
    

}
