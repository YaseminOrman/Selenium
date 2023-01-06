package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test06(){
        driver.get("https://admin-demo.nopcommerce.com/login");
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@id='Email']"));
        emailInputBox.clear();
        emailInputBox.sendKeys("adm123@gmail.com");
       // System.out.println(emailInputBox.getAttribute("value"));

        //login button
//       WebElement button= driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
//        System.out.println(button.getAttribute("type"));
//        System.out.println(button.getAttribute("class"));
//        button.getText();

       driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
       //passwordBox
       WebElement passwordBox = driver.findElement(By.xpath("//input[@id='Password']"));
       passwordBox.clear();
       passwordBox.sendKeys("abcdefghyui");
       WebElement rememberMeBox = driver.findElement(By.xpath("//input[@id='RememberMe']"));
       rememberMeBox.click();
        WebElement button= driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        button.click();


    }
}
