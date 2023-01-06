package tests_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day4LinkText {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");
    }
    @Test
    public void LMSPage(){
        //Click on LMS - LOGIN
       driver.findElement(By.linkText("LMS LOGIN")).click();
       String expectedURL = "https://lms.techproeducation.com/";
       String actualURL = driver.getCurrentUrl();
       Assert.assertEquals("lms login page is not displayed",expectedURL,actualURL);
       Assert.assertTrue(driver.findElement(By.linkText("Login/Register")).isDisplayed());
    }

}
