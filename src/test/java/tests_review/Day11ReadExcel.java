package tests_review;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day11ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
//        Store the path of the  file in a string
        String path ="./src/test/java/resources/Capitals.xlsx";
//        Open the file
        FileInputStream fileInputStream = new FileInputStream(path);
//        Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Open the first worksheet
        Sheet sheet1=workbook.getSheet("Sheet1");
//        Go to first row
        Row row1= sheet1.getRow(0);
//        Go to first cell on that first row and print
        Cell cell1= row1.getCell(0);
        System.out.println("cell1 = " + cell1);
//        Go to second cell on that first row and print
        Cell cell2=row1.getCell(1);
        System.out.println("cell2 = " + cell2);
//        Go to 2nd row first cell  and assert if the data equal to USA
        String r2c1= sheet1.getRow(1).getCell(0).toString();
        Assert.assertEquals("USA",r2c1);
//        Go to 3rd row 2nd cell-chain the row and cell
        String r3c2= sheet1.getRow(2).getCell(1).toString();
        System.out.println("r3c2 = " + r3c2);
//        Find the number of row
        int numOfRow= sheet1.getLastRowNum()+1;
        System.out.println("numOfRow = " + numOfRow);
//        Find the number of used row
        int numOfData= sheet1.getPhysicalNumberOfRows();
        System.out.println("numOfData = " + numOfData);
//        Print country, capitol key value pairs as map object
        Map<String,String> countryCapitals=new HashMap<>();
        for(int i=1;i<numOfRow;i++){
           String country = sheet1.getRow(i).getCell(0).toString();
           String capitals = sheet1.getRow(i).getCell(1).toString();
           countryCapitals.put(country,capitals);
        }
        System.out.println(countryCapitals);
    }
}
