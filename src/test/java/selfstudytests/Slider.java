package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Slider extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        WebElement minSlider = driver.findElement(By.xpath("//span[@style='left: 0%;']"));
        System.out.println(minSlider.getLocation());
        System.out.println(minSlider.getSize());
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(minSlider,200,0).perform();
        System.out.println(minSlider.getLocation());
        System.out.println(minSlider.getSize());
        WebElement maxSlider = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
        actions.dragAndDropBy(maxSlider,-200,0).perform();

    }
}
