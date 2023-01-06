package practice04review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q03 extends TestBase {
      /*
    Given
        Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    When
        Click all the buttons
    Then
        Assert all buttons clicked
     */
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        driver.findElement(By.id("onblur")).click();
        driver.findElement(By.id("onclick")).click();
        driver.findElement(By.id("onclick")).click();

        WebElement contextMenu = driver.findElement(By.id("oncontextmenu"));
        WebElement doubleClick = driver.findElement(By.id("ondoubleclick"));
        WebElement onFocus = driver.findElement(By.id("onfocus"));
        WebElement onKeyDown = driver.findElement(By.id("onkeydown"));
        WebElement onKeyUp = driver.findElement(By.id("onkeyup"));
        WebElement onKeyPress = driver.findElement(By.id("onkeypress"));
        WebElement onMouseOver = driver.findElement(By.id("onmouseover"));
        WebElement onMouseLeave = driver.findElement(By.id("onmouseleave"));
        WebElement onMouseDown = driver.findElement(By.id("onmousedown"));

        Actions actions = new Actions(driver);
        actions.contextClick(contextMenu).perform();
        waitFor(1);
        actions.doubleClick(doubleClick).perform();
        waitFor(1);
        actions.click(onFocus).perform();
        waitFor(1);
        actions.sendKeys(onKeyDown, Keys.ARROW_DOWN).perform();
        waitFor(1);
        actions.sendKeys(onKeyUp, Keys.ARROW_UP).perform();
        waitFor(1);
        actions.sendKeys(onKeyPress, Keys.ENTER).perform();
        waitFor(1);
        actions.moveToElement(onMouseOver).perform();
        waitFor(1);
        actions.moveToElement(onMouseLeave).moveToElement(onMouseOver).perform();
        waitFor(1);
        actions.click(onMouseDown).perform();




    }
}
