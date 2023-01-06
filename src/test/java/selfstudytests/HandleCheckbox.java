package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.overlay.model.LineStyle;

import java.time.Duration;
import java.util.List;

public class HandleCheckbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.findElement(By.xpath("//input[@id='monday']")).click();
        //select all check boxes
        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        for(WebElement eachBox : checkBoxes){
            eachBox.click();
        }
    }
}
