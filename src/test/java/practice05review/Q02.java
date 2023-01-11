package practice05review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.IOException;

public class Q02 extends TestBase {
    /*
     Given
         Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
     When
         Click on Ajax Loader
     And
         Click on "Click Me!" button
     Then
         Assert that button is clicked
     And
         Take screenshot after each step
  */
    @Test
    public void test() throws IOException {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        takeScreenshotOfPage();
        driver.findElement(By.id("button3")).click();
        takeScreenshotOfPage();
        driver.findElement(By.id("button1")).click();
        takeScreenshotOfPage();
        waitForVisibility(By.xpath("//h4[text()='Well Done For Waiting....!!!']"),10);
        Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Well Done For Waiting....!!!']")).isDisplayed());





    }
}
