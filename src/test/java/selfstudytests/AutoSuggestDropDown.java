package selfstudytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
        List<WebElement>lists= driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
        System.out.println(lists.size());
        for(WebElement listItem : lists){
            if(listItem.getText().contains("download")){
                listItem.click();
                break;
            }
        }
    }
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("java tutorial");
        List<WebElement>lists= driver.findElements(By.xpath("//li[@class='sbct']"));
        System.out.println(lists.size());
        for(WebElement listItem : lists){
            if(listItem.getText().contains("oracle")){
                listItem.click();
                break;
            }
        }
    }
}
