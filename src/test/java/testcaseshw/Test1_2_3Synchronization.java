package testcaseshw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Test1_2_3Synchronization extends TestBase {

    @Test
    public void test1(){
//        Go to https://the-internet.herokuapp.com/dynamic_loading/2
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
//        When user clicks on the Start button
        driver.findElement(By.xpath("//*[@id='start']/button")).click();
//        Then verify the ‘Hello World!’ Shows up on the screen
       WebElement expected = driver.findElement(By.xpath("//div[@id='finish']//h4"));
       waitForVisibility(expected,10);
       Assert.assertTrue(expected.isDisplayed());
    }
    @Test
    public void test2(){
//        Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        Click on remove button
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
//        And verify the message is equal to “It's gone!”
        WebElement expected1 = driver.findElement(By.xpath("//p[@id='message']"));
        waitForVisibility(expected1,10);
        Assert.assertEquals("It's gone!",expected1.getText());
//        Then click on Add button
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        //        And verify the message is equal to “It's back!”
        WebElement expected2 = driver.findElement(By.xpath("//p[@id='message']"));
        waitForVisibility(expected2,10);
        Assert.assertEquals("It's back!",expected2.getText());

    }
    @Test
    public void test3(){
//        Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        Click enable Button
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
//        And verify the message is equal to “It's enabled!”
        WebElement expected1 = driver.findElement(By.xpath("//p[@id='message']"));
        waitForVisibility(expected1,10);
        Assert.assertEquals("It's enabled!",expected1.getText());
//        And verify the textbox is enabled (I can type in the box)
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
//        And click on Disable button
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
//        And verify the message is equal to “It's disabled!”
        WebElement expected2 = driver.findElement(By.xpath("//p[@id='message']"));
        waitForVisibility(expected2,10);
        Assert.assertEquals("It's disabled!",expected2.getText());
//        And verify the textbox is disabled (I cannot type in the box)
        Assert.assertFalse(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());

    }
}
