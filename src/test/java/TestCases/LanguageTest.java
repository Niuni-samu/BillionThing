package TestCases;

import Base.BaseClass;
import Pages.HeaderPage;

import org.testng.annotations.Test;


public class LanguageTest extends BaseClass {

    @Test()
    public void languageTest() throws InterruptedException {

        HeaderPage headerPage = new HeaderPage(driver);

        headerPage.clickLanguageDrpDwn();
        Thread.sleep(1000);

    }

}
