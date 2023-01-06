package tests_review;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09FileExistTest extends TestBase {
    @Test
    public void isExistTest(){
       String userDIR = System.getProperty("user.dir");
        System.out.println(userDIR);
       String userHome = System.getProperty("user.home");
        System.out.println(userHome);

       String pathOfFile =  userHome + "/Desktop/logo.jpeg";
       boolean isExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExist);
    }
}
