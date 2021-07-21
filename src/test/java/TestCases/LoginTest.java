package TestCases;

import Base.BaseClass;
import ConfigFiles.ExcelConfigFiles;
import Pages.HeaderPage;
import Pages.LoginPage;
import Utility.ExcelUtilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseClass {


    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, String expect_result) throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);

        headerPage.clickSignInBtn();

        loginPage.EnterUserName(username);

        loginPage.EnterPassword(password);

        loginPage.clickLoginBtn();
        Thread.sleep(1000);

        loginPage.validateExpectResult(expect_result);

    }


    @DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {


        String path = "/home/niuni/Documents/BillionThingJ15/src/main/java/Data/LoginRegister.xlsx";

        ExcelUtilities excelUtilities = new ExcelUtilities(path);

        int totalRows = excelUtilities.getRowCount("Sheet3");
        int totalColumns = excelUtilities.getCellCount("Sheet3", 1);

        String loginData[][] = new String[totalRows][totalColumns];

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {

                loginData[i - 1][j] = excelUtilities.getCellData("Sheet3", i, j);

            }

        }

        return loginData;
    }
}
