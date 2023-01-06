package testcaseshw;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test1_2_3_4 extends TestBase {
    @Test
    public void test1(){
//        When user goes to https://jqueryui.com/accordion/
        driver.get("https://jqueryui.com/accordion/");
//        And user clicks on Section2 accordion
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//h3[@id='ui-id-3']")).click();
        waitFor(3);
//        Verify the text contains “Sed non urna.”
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ui-id-4']")).getText().contains("Sed non urna."));
    }
    @Test
    public void test2(){
//        When user goes to https://jqueryui.com/datepicker/
        driver.get("https://jqueryui.com/datepicker/");
//        And select the next date of the current date
 //       EG if today is August-30, 2022 -> select August 31, 2022
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();
        String currentDay=new SimpleDateFormat("d").format(new Date());
        System.out.println(currentDay);
        List<WebElement> allDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']"));
        for (int i=0;i<allDays.size();i++){
            if(allDays.get(i).getText().equals(currentDay)){
                allDays.get(i+1).click();
            }
        }
    }

//        When user goes to https://jqueryui.com/toggle/
//        Print the text that should be : Etiam libero neque, luctus a, eleifend nec, semper at, lorem.
//        Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
//                Eg: System.out.println(element); -> Etiam libero neque, luctus a, eleifend nec, semper at, lorem.
//                Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
//                Then click on Run Effect button
//        Then print the text and verify it is empty.
//                Eg: System.out.println(element); -> NO TEXT
//        Then click on Run Effect button one more time
//        Print the text that should be : Etiam libero neque, luctus a, eleifend nec, semper at, lorem.
//        Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
//                Eg: System.out.println(element); -> Etiam libero neque, luctus a, eleifend nec, semper at, lorem.
//                Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.
//                You can use hard wait if needed.
    @Test
    public void test3(){
        driver.get("https://jqueryui.com/toggle/");
        driver.switchTo().frame(0);
        String text1 = driver.findElement(By.xpath("//p")).getText();
        waitFor(3);
        System.out.println(text1);
        driver.findElement(By.xpath("//button[@id='button']")).click();
        waitFor(3);
        String afterRun=driver.findElement(By.xpath("//*[@id='effect']")).getText();
        System.out.println(afterRun);
        waitFor(3);
        Assert.assertTrue(afterRun.isEmpty());
        driver.findElement(By.xpath("//button[@id='button']")).click();
        waitFor(3);
        String text2 = driver.findElement(By.xpath("//p")).getText();
        waitFor(3);
        System.out.println(text2);
    }




    @Test
    public void test4(){
        //    When user goes to https://jqueryui.com/autocomplete/
        driver.get("https://jqueryui.com/autocomplete/");
        driver.switchTo().frame(0);
        //    And type Apple
        driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Apple");;
        //    Then select Applescript
        driver.findElement(By.id("ui-id-1")).click();
    }


}
