package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class OpenURLsIn2Tabs extends TestBase {
    @Test
    public void test(){
        driver.get("https://demo.nopcommerce.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.opencart.com");
    }
}
