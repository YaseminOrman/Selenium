package selfstudytests;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShots extends TestBase {
    @Test
    public void test() throws IOException {
        driver.get("https://demo.nopcommerce.com/");
        //Full screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("./screenshots/homepage.png");
        FileUtils.copyFile(src,trg);

        //ScreenShot of section of the page
//        WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//        File src = section.getScreenshotAs(OutputType.FILE);
//        File trg = new File("./screenshots/featuredproducts.png");
//        FileUtils.copyFile(src,trg);

        //ScreenShot of section of the page
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//        File src = logo.getScreenshotAs(OutputType.FILE);
//        File trg = new File("./screenshots/logo.png");
//        FileUtils.copyFile(src,trg);


        driver.close();
    }
}
