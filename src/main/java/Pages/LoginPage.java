package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    By UserNameField = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-signin[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By PassWordField = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-signin[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By LoginBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-signin[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]");
    By CancelLoginBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]");
    By GreetingGoodDay = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/h4[1]");
    By AlertErrorLogin = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-signin[1]/div[1]/div[1]/div[1]/div[1]/alert[1]/div[1]/span[1]");

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    public void EnterUserName(String username) {


        driver.findElement(UserNameField).sendKeys(username);

    }

    public void EnterPassword(String password) {

        driver.findElement(PassWordField).sendKeys(password);

    }

    public void clickLoginBtn() {


        driver.findElement(LoginBtn).click();


    }

    public void clickCancelLoginBtn() {


        driver.findElement(CancelLoginBtn).click();


    }


    public void validateExpectResult(String expect_result) {


        if (expect_result.equals("Valid")) {

            String expect_greeting = "Good Day, Chethi!";
            String actual_greeting = driver.findElement(GreetingGoodDay).getText();


            if (expect_greeting.equals(actual_greeting)) {

                Assert.assertTrue(true);
                System.out.println("Successfully login");
            } else {
                Assert.assertTrue(false);

            }


        } else if (expect_result.equals("Invalid")) {

            String expect_error = "Please enter correct username / password";
            String actual_error = driver.findElement(AlertErrorLogin).getText();

            driver.findElement(CancelLoginBtn).click();
            if (expect_error.equals(actual_error)) {
                Assert.assertTrue(true);
                System.out.println("login cancelled");
            } else {
                Assert.assertTrue(false);
                System.out.println("login cancelled");
            }

        }


    }


}
