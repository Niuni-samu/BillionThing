package TestCases.AdvetisingTest;

import Base.BaseClass;
import Base.WaitingTime;
import Pages.AdvertiserPage;
import Pages.HeaderPage;
import Pages.LoginPage;
import Utility.ExcelUtilities;
import io.ous.jtoml.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import java.io.FileReader;
import java.io.IOException;



public class PositiveTest extends BaseClass {


    @Test(dataProvider = "AdvertiserData")
    public void loginTest(String data) throws InterruptedException {

        HeaderPage header = new HeaderPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AdvertiserPage advertiserPage = new AdvertiserPage(driver);
        WaitingTime waitingTime = new WaitingTime(driver);

        String[] advertiser =data.split(",");

        // Admin Login
        header.clickSignInBtn();
        loginPage.EnterUserName("qaadmin");
        loginPage.EnterPassword("1234");
        loginPage.clickLoginBtn();
        waitingTime.Wait2();

        header.clickRegisterBusinessBtn();
        waitingTime.Wait2();


        //Advertising Info Page
        advertiserPage.SelectRole();
        advertiserPage.ClickSubmitBtn();
        waitingTime.Wait2();
        advertiserPage.EnterUserId(advertiser[0]);


        advertiserPage.EnterTitle(advertiser[1]);
        waitingTime.Wait2();
        advertiserPage.selectCategoryDrpDwn(advertiser[2]);
        waitingTime.Wait2();
        advertiserPage.enterDescription(advertiser[3]);
        waitingTime.Wait2();
        advertiserPage.clickNextBtn1();
        waitingTime.Wait2();

        //File Upload
        advertiserPage.fileUpload();
        waitingTime.Wait2();
        advertiserPage.ClickNextBtn2();
        waitingTime.Wait2();


        // Advertising Address
        advertiserPage.enterAddressNo(advertiser[4]);
        waitingTime.Wait2();
        advertiserPage.enterAddressLine1(advertiser[5]);
        waitingTime.Wait2();
        advertiserPage.enterAddressLine2(advertiser[6]);
        waitingTime.Wait2();
        advertiserPage.enterProvince(advertiser[7]);
        waitingTime.Wait2();
        advertiserPage.enterPostalCode(advertiser[8]);
        waitingTime.Wait2();
        advertiserPage.enterTelephone1(advertiser[9]);
        waitingTime.Wait2();
        advertiserPage.enterTelephone2(advertiser[10]);
        waitingTime.Wait2();
        advertiserPage.enterEmail(advertiser[11]);
        waitingTime.Wait2();


    }


    /*@DataProvider(name = "AdvertiserData")
    public Object[][] getData2() throws IOException {


        String path = "/home/chamika/BillionThing/src/main/java/Data/AdvertiserData.xlsx";

        ExcelUtilities excelUtilities = new ExcelUtilities(path);

        int totalRows = excelUtilities.getRowCount("Sheet1");
        int totalColumns = excelUtilities.getCellCount("Sheet1", 1);

        String[][] AdvertiserData = new String[totalRows][totalColumns];

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 0; j < totalColumns; j++) {

                AdvertiserData[i - 1][j] = excelUtilities.getCellData("Sheet1", i, j);

            }

        }

        return AdvertiserData;
    }*/

    @DataProvider(name = "AdvertiserData")
    public Object[] readJson() throws IOException, ParseException {

        JsonParser jsonParser = new JsonParser();
        FileReader reader = new FileReader("/home/chamika/BillionThing/src/main/java/Data/Advertiser.json");
        Object obj = jsonParser.parse(reader);
        JsonObject userLoginJsonObj = (JsonObject) obj;
        JsonArray userLoginArray = (JsonArray) userLoginJsonObj.get("AdvertiserData");

        String[] arr = new String[userLoginArray.size()];

        for (int i = 0; i <userLoginArray.size(); i++) {

            JsonObject users = (JsonObject) userLoginArray.get(i);
            String userid = users.get("userid").getAsString();
            String title= users.get("Title").getAsString();
            String category = users.get("Category").getAsString();
            String description = users.get("Description").getAsString();
            String no = users.get("No").getAsString();
            String addressLine1 = users.get("Address Line 1").getAsString();
            String addressLine2 = users.get("Address Line 2").getAsString();
            String province = users.get("Province").getAsString();
            String postalCode = users.get("PostalCode").getAsString();
            String tele1 = users.get("telephone1").getAsString();
            String tele2= users.get("telephone2").getAsString();
            String email = users.get("Email").getAsString();






            arr[i] = userid+","+title+","+category+","+description+","+no+","+addressLine1+","+addressLine2+","+province+","+postalCode+","+tele1+","+tele2+","+email;



        }
        return arr;

    }




}
