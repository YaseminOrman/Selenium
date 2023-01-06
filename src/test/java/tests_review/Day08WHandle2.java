package tests_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class Day08WHandle2 extends TestBase {
    @Test
    public void test() throws InterruptedException {
        //open window 1
        driver.get("https://www.techproeducation.com");
        Assert.assertTrue(driver.getTitle().contains("Techpro Education"));
        String techproHandle=driver.getWindowHandle();
        //open window 2
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        String amazonHandle=driver.getWindowHandle();
        //open window 3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle=driver.getWindowHandle();

        Thread.sleep(3000);
        driver.switchTo().window(techproHandle);
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.switchTo().window(amazonHandle);
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.switchTo().window(linkedinHandle);
        System.out.println(driver.getCurrentUrl());






    }

}
