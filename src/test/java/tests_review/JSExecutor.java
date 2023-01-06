package tests_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.TestBase;

public class JSExecutor extends TestBase {

    @Test
    public void test(){
        driver.get("https://techproeducation.com/");
        waitFor(3);
        //        1. create js executor object
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //        scrolling We Offer element
        waitFor(3);
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[.='we offer']")));

        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));

        waitFor(3);

        scrollIntoViewJS(driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
    }

}
