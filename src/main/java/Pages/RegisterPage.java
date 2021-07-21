package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {

    WebDriver driver;

    By NameField = By.id("name");
    By UserNameField = By.id("signupusername");
    By EmailField = By.id("email");
    By TelephoneField = By.id("telephone");
    By PasswordField = By.id("singup-password");
    By ConfirmPasswordField = By.id("password2");
    By CheckBoxAgreed = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[3]/div[1]/div[1]/div[2]/app-signup[1]/form[1]/div[8]/div[1]/div[1]/label[1]");
    By RegisterBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[3]/div[1]/div[1]/div[2]/app-signup[1]/form[1]/div[8]/div[2]/input[1]");
    By CancelBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-navbar[1]/div[3]/div[1]/div[1]/div[3]/button[1]");

    public RegisterPage(WebDriver driver) {

        this.driver = driver;

    }

    public void EnterName(String name_user) {

        driver.findElement(NameField).sendKeys(name_user);

    }

    public void EnterUserName(String username_user) {

        driver.findElement(UserNameField).sendKeys(username_user);

    }

    public void EnterEmail(String email_user) {

        driver.findElement(EmailField).sendKeys(email_user);

    }

    public void EnterTelephone(String telephone_user) {

        driver.findElement(TelephoneField).sendKeys(telephone_user);

    }

    public void EnterPassword(String password_user) {

        driver.findElement(PasswordField).sendKeys(password_user);

    }

    public void EnterConfirmPassword(String re_password_user) {

        driver.findElement(ConfirmPasswordField).sendKeys(re_password_user);

    }

    public void clickCheckbox() {

        driver.findElement(CheckBoxAgreed).click();

    }

    public void clickRegisterBtn() {

        driver.findElement(RegisterBtn).click();

    }

    public void clickCancelBtn() {

        driver.findElement(CancelBtn).click();

    }

    public void validateRegistration(String expected_result) {

        String expect_title = "good-day";
        String actual_title = driver.getTitle();

        if (expected_result.equals("Valid")) {
            if (expect_title.equals(actual_title)) {

                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        } else if (expected_result.equals("Invalid")) {
            if (expect_title.equals(actual_title)) {

                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }

    }

}
