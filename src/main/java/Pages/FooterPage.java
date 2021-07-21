package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage {

    WebDriver driver;

    By EmailSubscribeField = By.id("newsletterEmail");
    By EmailSubscribeBtn = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-footer[1]/footer[1]/div[1]/div[1]/div[4]/form[1]/div[2]/div[1]/button[1]");
    By FAQsLink = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-footer[1]/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]");
    By AboutUsLink = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-footer[1]/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
    By ContactusLink = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-footer[1]/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]");
    By PrivacyPolicyLink = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-footer[1]/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]");
    By SiteMapLink = By.xpath("/html[1]/body[1]/div[1]/app-root[1]/app-footer[1]/footer[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]");

    public FooterPage(WebDriver driver) {

        this.driver = driver;

    }

    public void EnterSubscribeEmail(String subscribe_email) {


        driver.findElement(EmailSubscribeField).sendKeys(subscribe_email);

    }

    public void clickEmailSubscribeBtn() {


        driver.findElement(EmailSubscribeBtn).click();


    }

    public void clickFAQsLink() {


        driver.findElement(FAQsLink).click();


    }

    public void clickAboutUsLink() {


        driver.findElement(AboutUsLink).click();


    }

    public void clickContactusLink() {


        driver.findElement(ContactusLink).click();


    }

    public void clickPrivacyPolicyLink() {


        driver.findElement(PrivacyPolicyLink).click();


    }

    public void clickSiteMapLink() {


        driver.findElement(SiteMapLink).click();


    }

}
