package practice04review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q01 extends TestBase {

//        Given
//         Go to  https://www.saucedemo.com/
//        When
//         Enter the username  as "standard_user"
//        And
//         Enter the password as "secret_sauce"
//        And
//         Click on login button
//        And
//         Add all products to cart
//        And
//         Go to cart
//        And
//         Click on checkout
//        And
//         Fill your information
//        And
//         Click on continue
//        Then
//         Assert that total price is $140.34
//        When
//         Click on finish
//        Then
//         Assert that CHECKOUT: COMPLETE!
    @Test
    public void test(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='Add to cart']"));
        for(WebElement w:addToCartButtons){
            w.click();
        }
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("1234");
        driver.findElement(By.id("continue")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='summary_total_label']")).isDisplayed());
        driver.findElement(By.id("finish")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[.='Checkout: Complete!']")).isDisplayed());
    }
}
