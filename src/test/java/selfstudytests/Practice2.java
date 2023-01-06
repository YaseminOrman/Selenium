package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice2 {
    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //Type any email in the email box
        driver.findElement(By.xpath("//input[@id='email']"));
        //Type any password
        driver.findElement(By.xpath("//input[@id='pass']"));
        //click login button
        driver.findElement(By.xpath("//button[@name='login']")).click();

        WebElement finalSentence = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSentence = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
        String actualSentence = finalSentence.getText();
        Assert.assertEquals(expectedSentence,actualSentence);

    }
}
