package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day07_Alerts extends TestBase {
    @Test
    public void acceptAlert() throws InterruptedException {
//        acceptAlert() => click on the first alert,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Thread.sleep(2000);
//         verify the text "I am a JS Alert" ,
       String alertAlert= driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Alert",alertAlert);
//        click OK ,
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
//        and Verify "You successfully clicked an alert"
        Thread.sleep(2000);
        String actualResult= driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You successfully clicked an alert",actualResult);
    }
    @Test
    public void dismissAlert() throws InterruptedException {
//        dismissAlert()=> click on the second alert,
        Thread.sleep(2000);
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//         verify text "I am a JS Confirm”,
        Thread.sleep(2000);
        String actualAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Confirm",actualAlertText);
//        click cancel,
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
//        and Verify “You clicked: Cancel”
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You clicked: Cancel",actualResult);
        Thread.sleep(2000);
    }
    @Test
    public void sendKeysAlerts(){
//        sendKeysAlert()=> click on the third alert,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//                verify text “I am a JS prompt”,
       String actualAlertText= driver.switchTo().alert().getText();
       Assert.assertEquals("I am a JS prompt",actualAlertText);
//        type “Hello World”,
        driver.switchTo().alert().sendKeys("Hello World");
//        click OK,
        driver.switchTo().alert().accept();
//        and Verify “You entered: Hello World”
         String actualRes =driver.findElement(By.id("result")).getText();
         Assert.assertEquals("You entered: Hello World",actualRes);
    }
    /*
                            What is an alert?
                        Alerts are a pop up that is generated by javascript.
                        When there is an alerts, we must handle the alerts.
                        Otherwise, we cannot continue to the test execution
                        How do you handle alert?
                        First we cannot inspect js alerts. We should first switch
                        to the alert and use accept() to click ok, dismiss() to
                        click cancel, sendKeys() to type, getText() to get the
                        text from the alert

     */
}
