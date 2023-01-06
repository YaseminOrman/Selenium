import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
//        1. Set Up Chrome Driver
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");//MAC
//        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver.exe");//WINDOWS

//        2. CREATE CHROME DRIVER
        WebDriver driver = new ChromeDriver();

//        3. NOW THAT WE CREATED WEBDRIVER, WE CAN AUTOMATE WEB APPLICATION
        driver.get("https://www.techproeducation.com");

    }
}
