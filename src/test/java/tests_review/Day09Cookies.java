package tests_review;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class Day09Cookies extends TestBase {
    @Test
    public void cookieTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        //1. Find the total number of cookies
        Set<Cookie> allCookies=driver.manage().getCookies();
        int numberOfCookies = allCookies.size();
        System.out.println("numberOfCookies = " + numberOfCookies);
        //        2. Print all the cookies
        for(Cookie eachCookie : allCookies){
            System.out.println(eachCookie);
            System.out.println(eachCookie.getValue());
            System.out.println(eachCookie.getName());
        }
        //        4. Add new cookie
        Cookie cookie = new Cookie("my_favcookie","apple-pie");
        driver.manage().addCookie(cookie);
        Set<Cookie> newCookies = driver.manage().getCookies();
        int numOfNewCookies = newCookies.size();
        System.out.println(numOfNewCookies);

        //        5. Delete cookie by name
        Thread.sleep(2000);
        driver.manage().deleteCookieNamed("my_favcookie");
        System.out.println(driver.manage().getCookies().size());

        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
        int lastNumOfCookies = driver.manage().getCookies().size();
        System.out.println("lastNumOfCookies = " + lastNumOfCookies);

    }
}
