package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutoCompleteDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.twoplugs.com/");
        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        searchBox.clear();
        searchBox.sendKeys("Toronto");
        String text;
        do{
         searchBox.sendKeys(Keys.ARROW_DOWN);
        text= searchBox.getAttribute("value");
        if(text.equals("Toronto, OH, USA")){
            searchBox.sendKeys(Keys.ENTER);
            break;
        }
        }while(!text.isEmpty());



    }
}
