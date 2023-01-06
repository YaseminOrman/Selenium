package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practice3 {
    @Test
    public void test02() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //go to bestbuy page
        driver.get("https://www.bestbuy.com");
        //print number of buttons on that page
       List<WebElement> listOfButtons=driver.findElements(By.tagName("button"));
        System.out.println(listOfButtons.size());
        //print every sentence on the buttons
        for(WebElement w : listOfButtons){
            System.out.println(w.getText());



        }
    }
}
