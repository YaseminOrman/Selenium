package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class ToolTip extends TestBase {
    @Test
    public void test(){
        driver.get("https://jqueryui.com/tooltip/");

        //How to capture tooltip of the webElement
        driver.switchTo().frame(0);
        WebElement inputBox = driver.findElement(By.xpath("//input[@id='age']"));
        String toolTipText = inputBox.getAttribute("title");
        System.out.println("toolTipText = " + toolTipText);

        //
    }
}
