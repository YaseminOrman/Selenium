package tests_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class ExplicitWait extends TestBase {

    @Test
    public void test(){
        //        Go to https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        // When user clicks on the Start button
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        //        Then verify the ‘Hello World!’ Shows up on the screen
//        WebElement expectedText = driver.findElement(By.id("finish"));
//        waitForVisibility(expectedText,10);
//        Assert.assertTrue(expectedText.isDisplayed());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        Assert.assertEquals("Hello World!",helloElement.getText());
        }
    @Test
    public void ReusableExplicit(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        waitForVisibility(By.id("finish"),10);
        Assert.assertTrue(driver.findElement(By.id("finish")).isDisplayed());
    }
    /*
    //Dynamic selenium wait
    //1.method
    public static WebElement waitForVisibility(WebElement element,int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    //2.method
    public static WebElement waitForVisibility(By locator ,int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    //3.method
    public static WebElement waitForClickable(WebElement element , int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    //4.method
    public static WebElement waitForClickable(By locator , int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
     */


}
