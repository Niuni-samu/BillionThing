package TestCases;

import Base.BaseClass;
import Pages.HeaderPage;
import Pages.RegisterPage;
import Utility.ExcelUtilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends BaseClass {

    @Test(dataProvider = "registerData")
    public void loginTest(String name_user, String username_user, String email_user, String telephone_user, String password_user, String re_password_user, String expected_result) throws InterruptedException {


        RegisterPage registerPage = new RegisterPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);

        headerPage.clickSignUpBtn();
        Thread.sleep(1000);

        registerPage.EnterName(name_user);

        registerPage.EnterUserName(username_user);

        registerPage.EnterEmail(email_user);

        registerPage.EnterTelephone(telephone_user);

        registerPage.EnterPassword(password_user);

        registerPage.EnterConfirmPassword(re_password_user);

        registerPage.clickCheckbox();

        registerPage.clickRegisterBtn();
        Thread.sleep(1000);

        registerPage.clickCancelBtn();

        registerPage.validateRegistration(expected_result);

        System.out.println(expected_result);

    }

    @DataProvider(name = "registerData")
    public Object[][] getData() throws IOException {


        String path = "/home/niuni/Documents/BillionThingJ15/src/main/java/Data/LoginRegister.xlsx";


        ExcelUtilities excelUtilities = new ExcelUtilities(path);

        int totalRows = excelUtilities.getRowCount("Sheet2");
        int totalColumns = excelUtilities.getCellCount("Sheet2", 1);

        String loginData[][] = new String[totalRows][totalColumns];

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {

                loginData[i - 1][j] = excelUtilities.getCellData("Sheet2", i, j);

            }

        }

        return loginData;
    }
}
