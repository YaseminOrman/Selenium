package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class DatePicker_DropDown extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.findElement(By.xpath("//input[@id='dob']")).click();

        //month-year selections
        Select monthDrp=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        monthDrp.selectByVisibleText("Mar");
        Select yearDrp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        yearDrp.selectByVisibleText("1986");

        //date selections
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement dt : dates){
            if(dt.getText().equals("10")){
                dt.click();
                break;
            }
        }
    }
}
