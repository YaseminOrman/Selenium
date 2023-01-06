package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class MouseDragAndDropAction extends TestBase {
    @Test
    public void test1(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement box1=driver.findElement(By.id("box1"));
        WebElement box101=driver.findElement(By.id("box101"));
        WebElement box2=driver.findElement(By.id("box2"));
        WebElement box102=driver.findElement(By.id("box102"));
        WebElement box3=driver.findElement(By.id("box3"));
        WebElement box103=driver.findElement(By.id("box103"));
        WebElement box4=driver.findElement(By.id("box4"));
        WebElement box104=driver.findElement(By.id("box104"));
        WebElement box5=driver.findElement(By.id("box5"));
        WebElement box105=driver.findElement(By.id("box105"));
        WebElement box6=driver.findElement(By.id("box6"));
        WebElement box106=driver.findElement(By.id("box106"));
        WebElement box7=driver.findElement(By.id("box7"));
        WebElement box107=driver.findElement(By.id("box107"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(box1,box101).
                dragAndDrop(box2,box102).
                dragAndDrop(box3,box103).
                dragAndDrop(box4,box104).
                dragAndDrop(box5,box105).
                dragAndDrop(box6,box106).
                dragAndDrop(box7,box107).perform();
    }
    @Test
    public void test2()  {
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
        WebElement img1=driver.findElement(By.xpath("//li[1]"));
        WebElement img2=driver.findElement(By.xpath("//ul[@id='gallery']//li[2]"));
        WebElement img3=driver.findElement(By.xpath("//li[3]"));
        WebElement img4=driver.findElement(By.xpath("//ul[@id='gallery']//li[4]"));
        WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(img1,trash).dragAndDrop(img2,trash).
                dragAndDrop(img3,trash).dragAndDrop(img4,trash).perform();


    }
}
