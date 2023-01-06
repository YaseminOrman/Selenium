package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class KeyboardAction extends TestBase {
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/key_presses");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.SPACE).perform();
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://text-compare.com/");
        WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        input1.sendKeys("welcome to selenium");

        Actions actions = new Actions(driver);
        //control + A
        actions.keyDown(Keys.COMMAND);
        actions.sendKeys("a");
        actions.keyUp(Keys.COMMAND);
        actions.perform();
        //control +C
        actions.keyDown(Keys.COMMAND);
        actions.sendKeys("c");
        actions.keyUp(Keys.COMMAND);
        actions.perform();
        //tab-shift to input2
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB);
        actions.perform();
        //control v
        Thread.sleep(3000);
        actions.keyDown(Keys.COMMAND);
        actions.sendKeys("v");
        actions.keyUp(Keys.COMMAND);
        actions.perform();
        Thread.sleep(3000);
        //compare texts
        if(input1.getAttribute("value").equals(input2.getAttribute("value"))){
            System.out.println("Text copied");
        }else{
            System.out.println("Text Not copied");
        }


    }
}
