package testcaseshw;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class HW3_AmazonSearch extends TestBase {
    /*
     //TC01_As user I want to know how many item are there on amazon in the first page after I search “porcelain teapot”?
       //TC02_Order the tea pot prices, find the min, max, and average price to the nearest cent.
     */
    @Test
    public void test01(){
        driver.get("https://www.amazon.com/");
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys("porcelain teapot");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        List<WebElement> lists=driver.findElements(By.xpath("//div[@class='a-section a-spacing-base']"));
        System.out.println(lists.size());

    }
    @Test
    public void test02(){
        driver.get("https://www.amazon.com/");
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys("porcelain teapot");
        driver.findElement(By.id("nav-search-submit-button")).submit();
       List<WebElement>pricesOfTePot= driver.findElements(By.partialLinkText("$"));
        for(WebElement w : pricesOfTePot){
            System.out.println(w.getText());
        }

    }

}
