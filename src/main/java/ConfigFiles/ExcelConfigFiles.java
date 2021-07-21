package ConfigFiles;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ExcelConfigFiles {

    Properties properties = new Properties();

    WebDriver driver;

    public ExcelConfigFiles(WebDriver driver) {

        this.driver = driver;

    }

    public void readExcelFile() {


        try {
            InputStream input = new FileInputStream("/home/niuni/Documents/BillionThingJ15/src/main/java/Data/LoginRegister.xlsx");
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
