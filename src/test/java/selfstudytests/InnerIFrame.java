package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class InnerIFrame extends TestBase {
    @Test
    public void test(){
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

      WebElement outerFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
      driver.switchTo().frame(outerFrame);

      WebElement innerFrame = driver.findElement(By.xpath("//*[@class='iframe-container']/iframe"));
      driver.switchTo().frame(innerFrame);

      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selim ve Nilufer");
    }
    @Test
    public void test1(){
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//h1[.='This page is displayed in an iframe']")).getText());

        driver.switchTo().parentFrame();
        String outerText=driver.findElement(By.xpath("//p[contains(text(),'You can use the height')]")).getText();
        System.out.println(outerText);
    }
}
