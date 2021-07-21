package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    public WebDriver driver;


    @BeforeMethod
    public void Setup() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/niuni/Downloads/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://staging.billionthings.io/");
        Thread.sleep(5000);

    }

    @AfterMethod
    public void Close() throws InterruptedException {
        driver.quit();
    }

}
