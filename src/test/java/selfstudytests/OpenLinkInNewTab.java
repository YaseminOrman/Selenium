package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class OpenLinkInNewTab extends TestBase {
    @Test
    public void test1(){
        driver.get("https://demo.nopcommerce.com/");
        String tab = Keys.chord(Keys.COMMAND,Keys.RETURN);
        driver.findElement(By.linkText("Register")).sendKeys(tab);
    }

}
