package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class DatePicker extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.redbus.in");
        String year = "2023";
        String month = "Jan";
        String date = "10";

        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
        while(true) {
            String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            if(mon.equalsIgnoreCase(month) && yr.equals(year))
                break;
            else
                driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
        }
        //date selection
        List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
        for(WebElement w : allDates){
            String dt = w.getText();
            if(dt.equals(date)){
                w.click();
                break;
            }
        }
    }
}
