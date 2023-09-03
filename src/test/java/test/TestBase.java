package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.MainePageDuckduckgo;
import pages.MainePageOtus;
import pages.MainePageOtusHome;
import pages.TaskCheck;

import java.util.concurrent.TimeUnit;

public class TestBase  {
    private WebDriver driver;
    public MainePageDuckduckgo mainePageDuckduckgo;
    public TaskCheck taskOne;
    public MainePageOtusHome mainePageOtusHome;
    public MainePageOtus mainePageOtus;

    @BeforeAll
    public static void beforeALL(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    public void beforeEach(){
        WebDriverManager.firefoxdriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        mainePageDuckduckgo = PageFactory.initElements(driver, MainePageDuckduckgo.class);
        taskOne = PageFactory.initElements(driver, TaskCheck.class);
        mainePageOtusHome = PageFactory.initElements(driver,MainePageOtusHome.class);
        mainePageOtus = PageFactory.initElements(driver,MainePageOtus.class);
    }

    @AfterEach
    public  void finish(){
        driver.quit();
    }
}
