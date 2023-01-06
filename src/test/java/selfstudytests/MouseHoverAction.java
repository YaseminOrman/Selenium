package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class MouseHoverAction extends TestBase {
    @Test
    public void test(){
        driver.get("https://demo.opencart.com/");
       WebElement desktopButton= driver.findElement(By.xpath("//a[text()='Desktops']"));
       WebElement macButton= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
       Actions actions = new Actions(driver);
       actions.moveToElement(desktopButton).moveToElement(macButton).click().perform();
       //find the MP3 player
       WebElement mp3Button= driver.findElement(By.xpath("//a[text()='MP3 Players']"));
       WebElement test24 = driver.findElement(By.xpath("//a[text()='test 24 (0)']"));
       actions.moveToElement(mp3Button).moveToElement(test24).click().perform();
    }
}
