package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class Day08_WindowHandle2 extends TestBase {
   // Open 3 new windows and verify their TITLES
   // Open 3 new tabs and verify their TITLES

    @Test
    public void newWindowTest() throws InterruptedException {
        //open techproeducation on a new window 2
        driver.get("https://www.techproeducation.com");
        String techProTitle = driver.getTitle();
        Assert.assertTrue(techProTitle.contains("Techpro Education"));
        String techProHandle = driver.getWindowHandle();//getting window 1 id
        Thread.sleep(3000);
        //open amazon on a new window 2
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new window and switches to that window automatically
        driver.get("https://www.amazon.com");
        String amazonTitle = driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));
        String amazonHandle = driver.getWindowHandle();//getting window 2 id
        Thread.sleep(3000);
        //open LinkedIn on a new window 3
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new window and switches to that window automatically
        driver.get("https://www.linkedin.com");
        String linkedinTitle = driver.getTitle();
        Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
        String linkedinHandle = driver.getWindowHandle();//getting window 3 id

        Thread.sleep(3000);
        //Switch back to Techpro
        driver.switchTo().window(techProHandle);
        System.out.println("TechPro : " + driver.getCurrentUrl());
        Thread.sleep(3000);
//        Switch back to Amazon
        driver.switchTo().window(amazonHandle);
        System.out.println("Amazon : " +driver.getCurrentUrl());

        Thread.sleep(3000);
//        switching back to Linkedin
        driver.switchTo().window(linkedinHandle);
        System.out.println("Linkedin : "+driver.getCurrentUrl());
    }
    @Test
    public void newTabTest() throws InterruptedException {
        //open techproeducation on a new TAB 2
        driver.get("https://www.techproeducation.com");
        String techProTitle = driver.getTitle();
        Assert.assertTrue(techProTitle.contains("Techpro Education"));
        String techProHandle = driver.getWindowHandle();//getting TAB 1 id
        Thread.sleep(3000);
        //open amazon on a new TAB 2
        driver.switchTo().newWindow(WindowType.TAB);//create a new TAB and switches to that TAB automatically
        driver.get("https://www.amazon.com");
        String amazonTitle = driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));
        String amazonHandle = driver.getWindowHandle();//getting TAB 2 id
        Thread.sleep(3000);
        //open LinkedIn on a new TAB 3
        driver.switchTo().newWindow(WindowType.TAB);//create a new TAB and switches to that window automatically
        driver.get("https://www.linkedin.com");
        String linkedinTitle = driver.getTitle();
        Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
        String linkedinHandle = driver.getWindowHandle();//getting TAB 3 id

        Thread.sleep(3000);
        //Switch back to Techpro
        driver.switchTo().window(techProHandle);
        System.out.println("TechPro : " + driver.getCurrentUrl());
        Thread.sleep(3000);
//        Switch back to Amazon
        driver.switchTo().window(amazonHandle);
        System.out.println("Amazon : " +driver.getCurrentUrl());

        Thread.sleep(3000);
//        switching back to Linkedin
        driver.switchTo().window(linkedinHandle);
        System.out.println("Linkedin : "+driver.getCurrentUrl());
    }
}
