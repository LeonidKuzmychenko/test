package tests.parent;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractTest {

    protected WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void after() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        driver = null;
    }

    public void init(Object o){
        PageFactory.initElements(driver, o);
    }

    public void init(Object ...objects){
        for (Object o :objects) {
            PageFactory.initElements(driver, o);
        }
    }

}
