package practice04review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Q04 extends TestBase {
      /*
  Given
      Go to https://testpages.herokuapp.com/
  When
      Click on File Downloads
  And
      Click on Server Download
  Then
      Verify that file is downloaded
   */
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/");
        driver.findElement(By.linkText("File Downloads")).click();
        driver.findElement(By.linkText("Server Download")).click();
        String userHome=System.getProperty("user.home");
        boolean isExist= Files.exists(Paths.get(userHome+"/Downloads/textfile.txt"));
        Assert.assertTrue(isExist);
    }
}
