package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice1 {
    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //go to amazon page
        driver.get("https://www.amazon.com/");
        //search Nutella
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella");
        //click enter
        driver.findElement(By.id("twotabsearchtextbox")).submit();
        //print the final number of element
        WebElement finalElement=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(finalElement);


    }
}
