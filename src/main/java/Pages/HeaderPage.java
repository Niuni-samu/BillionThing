package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage {

    WebDriver driver;

    By signInBtn = By.xpath("//a[normalize-space()='Sign In']");
    By SignUpBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
    By RegisterBusinessBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]");
    By LanguageDrpDwn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]");



    public HeaderPage(WebDriver driver) {

        this.driver = driver;

    }


    public void clickSignInBtn() {


        driver.findElement(signInBtn).click();


    }

    public void clickSignUpBtn() {


        driver.findElement(SignUpBtn).click();


    }

    public void clickRegisterBusinessBtn() {


        driver.findElement(RegisterBusinessBtn).click();


    }

    public void clickLanguageDrpDwn() {

        driver.findElement(LanguageDrpDwn).click();
        Select select = new Select(driver.findElement(LanguageDrpDwn));
        select.selectByIndex(1);


    }


}
