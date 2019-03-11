package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private String driverPath = "./drivers/";
    public static WebDriver driver;

    @Before
    public void initializeTest() {
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://nodal.com/contact");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
    }

    @After
    public void quitDriver() {
        if (driver != null)
            driver.quit();
    }

}
