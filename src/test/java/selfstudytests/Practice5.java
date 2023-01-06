package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice5 {
    WebDriver driver ;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
    }
    @Test
    public void test05(){
      //click on products button
      driver.findElement(By.xpath("//a[text()=' Products']")).click();
      //verify user is navigated to ALL PRODUCT page successfully
        String expectedUrl = "https://automationexercise.com/products";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("pants");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        //verify
        WebElement searchProductEl = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
        Assert.assertTrue(searchProductEl.isDisplayed());
        driver.close();

    }
}
