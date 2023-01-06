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

public class Practice4 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
    }
    @Test
    public void test04(){
        //verify that homepage is visible
        WebElement logoElement = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed());
        //click on 'Signup / Login' button
       WebElement signUpButton = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
       signUpButton.click();
       //verify the Login to your account  is visible
        WebElement loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginText.isDisplayed());
        //enter the correct email and password
       // WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
       // email.sendKeys("ahmet@naber.com");
       // WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
      //  password.sendKeys("12345");
        //click login button
       // WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
      // loginButton.click();
        //verify that
    }
}
