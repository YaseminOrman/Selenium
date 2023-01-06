package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement drpCountry= driver.findElement(By.id("input-country"));
        Select select = new Select(drpCountry);
        //select.selectByVisibleText("Denmark");
        //select.selectByValue("10");
        //select.selectByIndex(4);

        //without using select methods
       List<WebElement>allOptions= select.getOptions();
       for(WebElement eachOption :allOptions){
           if(eachOption.getText().equals("Turkey")){
               eachOption.click();
               break;
           }
       }

    }
}
