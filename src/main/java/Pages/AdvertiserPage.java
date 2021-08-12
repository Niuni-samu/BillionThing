package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdvertiserPage {

    //Advertising info

    WebDriver driver;

    By selectRole = By.xpath("//input[@id='advertiser']");
    By submitBtn = By.xpath("//button[normalize-space()='Submit']");
    By userId = By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By title = By.xpath("//input[@formcontrolname='title']");
    By category = By.xpath("//select[@id='category']");
    By description = By.xpath("//textarea[@name='productDescription']");
    By NextBtn = By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[2]/ul[1]/li[2]/button[1]");
    By fileUpload = By.xpath("//input[@id='image']");
    By NextBtn2 = By.xpath("//i[@class='fas fa-angle-right']");
    By addressNo = By.xpath("//input[@id='addressNo']");
    By addressLine1 = By.xpath("//input[@id='addressLine1']");
    By addressLine2 = By.xpath("//input[@id='addressLine2']");
    By province = By.xpath("//input[@id='province']");
    By postalCode = By.xpath("//input[@id='postalCode']");
    By telePhone1 = By.xpath("//input[@id='telephone_one']");
    By telePhone2 = By.xpath("//input[@id='telephone_two']");
    By email = By.xpath("//input[@id='email']");
    By NextBtn3 = By.xpath("//button[normalize-space()='Next']");


    public AdvertiserPage(WebDriver driver) {

        this.driver = driver;

    }

    public void SelectRole() {

        driver.findElement(selectRole).click();


    }

    public void ClickSubmitBtn() {


        driver.findElement(submitBtn).click();

    }

    public void EnterUserId(String id) {

        driver.findElement(userId).click();
        driver.findElement(userId).sendKeys(id);


    }

    public void validUserId() {

        WebElement validUserID = driver.findElement(By.xpath(""));
        System.out.println(validUserID.getText());
        String validationMessage = validUserID.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {

            System.out.println("UserId is not valid ");
            Assert.assertTrue(false);

        }

    }

    public void EnterTitle(String Title) {


        driver.findElement(title).sendKeys(Title);


    }

    public void validTitle() {

        WebElement validTitle = driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-validation-message[1]"));
        System.out.println(validTitle.getText());
        String validationMessage = validTitle.getText();


        String actualResult1 = "Maximum length of this field is 30.";
        String actualResult2 = "Alpha numeric characters only and should not be entirely numeric.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {

            System.out.println("Title not valid ");
            Assert.assertTrue(false);

        }


    }

    public void selectCategoryDrpDwn(String value) {

        driver.findElement(category).click();
        Select select = new Select(driver.findElement(category));
        select.selectByIndex(Integer.parseInt(value));


    }


    public void enterDescription(String desc) {


        driver.findElement(description).sendKeys(desc);

    }

    public void clickNextBtn1() {


        driver.findElement(NextBtn).click();

    }

    public void fileUpload() {


        driver.findElement(fileUpload).sendKeys("/home/chamika/Pictures/profile.jpeg");


    }

    public void ClickNextBtn2() {


        driver.findElement(NextBtn2).click();


    }

    public void enterAddressNo(String no) {

        driver.findElement(addressNo).sendKeys(no);

    }

    public void validAddressNo() {

        WebElement validAddressNO = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-validation-message[1]"));
        System.out.println(validAddressNO.getText());
        String validationMessage = validAddressNO.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Alpha numeric characters only and should not be entirely numeric.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {

            System.out.println("Address Number not Valid");
            Assert.assertTrue(false);

        }

    }


    public void enterAddressLine1(String Address) {

        driver.findElement(addressLine1).sendKeys(Address);

    }

    public void validateAddressLine1() {

        WebElement validAddressLine1 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/app-validation-message[1]"));
        System.out.println(validAddressLine1.getText());
        String validationMessage = validAddressLine1.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Alpha numeric characters only and should not be entirely numeric.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("AddressLine1 is not valid");
            Assert.assertTrue(false);


        }

    }

    public void enterAddressLine2(String Address2) {

        driver.findElement(addressLine2).sendKeys(Address2);

    }

    public void validateAddressLine2() {

        WebElement validAddressLine2 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[3]/div[1]/app-validation-message[1]"));
        System.out.println(validAddressLine2.getText());
        String validationMessage = validAddressLine2.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Alpha numeric characters only and should not be entirely numeric.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("AddressLine2 is  not valid ");
            Assert.assertTrue(false);


        }

    }

    public void enterProvince(String prov) {

        driver.findElement(province).sendKeys(prov);

    }

    public void validateProvince() {

        WebElement validProvince = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[4]/div[1]/app-validation-message[1]"));
        System.out.println(validProvince.getText());
        String validationMessage = validProvince.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Alpha numeric characters only and should not be entirely numeric.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("Province  is  not valid ");
            Assert.assertTrue(false);


        }

    }

    public void enterPostalCode(String code) {

        driver.findElement(postalCode).sendKeys(code);

    }

    public void validatePostalCOde() {

        WebElement validProvince = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[5]/div[1]/app-validation-message[1]"));
        System.out.println(validProvince.getText());
        String validationMessage = validProvince.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "This field should be only numeric";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("Province  is  not valid ");
            Assert.assertTrue(false);


        }

    }

    public void enterTelephone1(String phone1) {

        driver.findElement(telePhone1).sendKeys(phone1);

    }

    public void validateTelePhoneNumber1() {

        WebElement validTelephonePhone1 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[6]/div[1]/app-validation-message[1]"));
        System.out.println(validTelephonePhone1.getText());
        String validationMessage = validTelephonePhone1.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Please enter a valid telephone number, between 7 and 15 numbers.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("Province  is  not valid ");
            Assert.assertTrue(false);


        }

    }

    public void enterTelephone2(String phone2) {

        driver.findElement(telePhone2).sendKeys(phone2);

    }

    public void validateTelePhoneNumber2() {

        WebElement validTelephonePhone2 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/app-validation-message[1]"));
        System.out.println(validTelephonePhone2.getText());
        String validationMessage = validTelephonePhone2.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Please enter a valid telephone number, between 7 and 15 numbers.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("TelephoneNumber2  is  not valid ");
            Assert.assertTrue(false);


        }

    }

    public void enterEmail(String mail) {

        driver.findElement(email).sendKeys(mail);

    }

    public void validateEmail() {

        WebElement validEmail = driver.findElement(By.xpath("//body/app-root[1]/div[1]/section[1]/div[1]/app-ads-layout[1]/app-ad-profile-create[1]/div[1]/div[1]/section[2]/form[1]/div[1]/div[1]/div[2]/div[7]/div[1]/app-validation-message[1]"));
        System.out.println(validEmail.getText());
        String validationMessage = validEmail.getText();


        String actualResult1 = "Maximum length of this field is 12.";
        String actualResult2 = "Please enter a valid telephone number, between 7 and 15 numbers.";


        if (validationMessage.equals(actualResult1)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");

        } else if (validationMessage.equals(actualResult2)) {

            Assert.assertTrue(true);
            System.out.println("Validation message is correct");


        } else {
            System.out.println("Email  is  not valid ");
            Assert.assertTrue(false);


        }

    }

    public void ClickNextBtn3() {

        driver.findElement(NextBtn3).click();

    }


}