package practice04review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q02 extends TestBase {
     /*
  Given
      Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
  When
      Click on "click me" button
  Then
      Verify that "Event Triggered"
   */
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
        waitFor(5);
         driver.findElement(By.id("growbutton")).click();
        Assert.assertTrue(driver.findElement(By.id("growbuttonstatus")).isDisplayed());

    }
}
