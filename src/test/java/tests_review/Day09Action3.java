package tests_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day09Action3 extends TestBase {

    @Test
    public void dragAndDropTest(){
        driver.get("https://jqueryui.com/droppable/");
        //      And user moves the target element(Drag me to my target) in to  destination(Drop here)
         //     Below elements are in the iframes so switch to iframe first
        driver.switchTo().frame(0);
       WebElement source = driver.findElement(By.id("draggable"));
       WebElement target = driver.findElement(By.id("droppable"));
        //        user Actions class to move source into target
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }
    @Test
    public void clickAndHold(){
        driver.get("https://jqueryui.com/droppable/");
        //      And user moves the target element(Drag me to my target) in to  destination(Drop here)
        //     Below elements are in the iframes so switch to iframe first
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        //        user Actions class to move source into target
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).build().perform();
    }


}
