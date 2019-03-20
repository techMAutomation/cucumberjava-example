package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private String driverPath = "./drivers/";
    public static WebDriver driver;

    @Before
    public void initializeTest() {
        DOMConfigurator.configure("log4j.xml");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://daaz.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void quitDriver() {
        if (driver != null)
            driver.quit();
    }

}
