package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class HandleIFrame extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        //find element in the 1.frame
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();//go back to the main page
        //find element in the 2.frame
        Thread.sleep(3000);
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
        driver.switchTo().defaultContent();//go back to the main page
        //find element in the 3.frame
        Thread.sleep(3000);
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//div[@class='topNav']//a[text()='Help']")).click();



    }
}
