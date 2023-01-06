package selfstudytests;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class WebTable extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //How many rows in the table
        int numOfRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println("numOfRows = " + numOfRows);

        //How many columns/heads in the table
        int numOfColumn=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
        System.out.println("numOfColumn = " + numOfColumn);

        //Retrieve the specific row/column data from the table
        String valueOfData=driver.findElement(By.xpath("//table[@id='customers']//tr[7]/td[1]")).getText();
        System.out.println("valueOfData = " + valueOfData);

        Thread.sleep(5000);
        //Retrieve all the data from the table
        for(int r=2;r<=numOfRows;r++){
            for(int c=1;c<=numOfColumn;c++){
               String data= driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
                System.out.println(data);
            }
        }
        //print country and contact of google
        for(int r=2;r<=numOfRows;r++){
            String company = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[1]")).getText();
            if(company.equals("Google")){
                String country = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[2]")).getText();
                String contact = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[3]")).getText();
                System.out.println(company +"  "+country+"  "+contact);//Part21 DYNAMIC WEB TABLE VAR SONRA TEKRAR BAK
            }
        }


    }
}
