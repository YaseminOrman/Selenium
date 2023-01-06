package testcaseshw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class HW2_GoogleSearchTest extends TestBase {
    /*
    Create a new class : GoogleSearchTest
    Create Test method and complete the following task.
    When user goes to https://www.google.com/
    Search for “porcelain teapot”
    And print how many related results displayed on Google
     */
    @Test
    public void test(){
       // When user goes to https://www.google.com/
        driver.get("https://www.google.com/");
       // Search for “porcelain teapot”
       WebElement dropDown= driver.findElement(By.xpath("//input[@class='gLFyf']"));
       dropDown.sendKeys("porcelain teapot");
       // And print how many related results displayed on Google
        System.out.println(driver.findElements(By.xpath("//ul[@class='G43f7e']//li")).size());
    }
    /*
    HW3
    Then create 3 different test methods using the following names. And Go to google.
    titleTest =>Verify if google title = “Google”
    imageTest => Verify if google image displays or not
    gmailLinkTest => Verify if the Gmail link is displayed or not
     */
    @Test
    public void titleTest(){
        //Verify if google title = “Google”
        driver.get("https://www.google.com/");
        Assert.assertEquals("Google",driver.getTitle());
    }
    @Test
    public void imageTest(){
        //Verify if google image displays or not
        driver.get("https://www.google.com/");
        WebElement imgOfGoogle=driver.findElement(By.id("hplogo"));
        Assert.assertTrue(imgOfGoogle.isDisplayed());
    }
    @Test
    public void gmailLinkTest(){
        //Verify if the Gmail link is displayed or not
        driver.get("https://www.google.com/");
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
        Assert.assertTrue(gmailLink.isDisplayed());
        gmailLink.click();
    }

}

