package testcaseshw;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW1_AmazonDropDown extends TestBase {
//    Create A Class: AmazonDropdown
//    Create A Method dropdownTest
//    Go to https://www.amazon.com/
//    Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
//    Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
//    Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
//    Print all  the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
//    Print the total number of options in the dropdown
//    Assert if ‘Appliances’ is a drop-down option. Print true if “Appliances” is an option. Print false otherwise.
//            BONUS: Assert if the dropdown is in Alphabetical Order
    @Test
    public void dropdownTest(){
//    Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//    Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
       WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
//    Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
        Select select = new Select(dropdown);
      String firstSelected=select.getFirstSelectedOption().getText();
      if(firstSelected.equals("All Departments")){
          System.out.println("Expected equals to actual ");
      }else{
          System.out.println("Expected is not equals to actual");
      }
//    Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.
//    (after you select you need to use get first selected option method).
//    If it fails, then comment that code out and continue rest of the test case.
      select.selectByIndex(3);
      String forthSelected = select.getFirstSelectedOption().getText();
        if(firstSelected.equals("Amazon Devices")){
            System.out.println("Expected equals to actual ");
        }else{
            System.out.println("Expected is not equals to actual");
        }

//    Print all  the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
         List<WebElement>dropDowns= select.getOptions();
//           for(WebElement eachDropDown : dropDowns){
//               System.out.println(eachDropDown.getText());
//            }


//    Print the total number of options in the dropdown
        System.out.println(dropDowns.size());
//    Assert if ‘Appliances’ is a drop-down option. Print true if “Appliances” is an option. Print false otherwise.
        for(WebElement eachDropDown : dropDowns){
            if(eachDropDown.getText().contains("Appliances")){
                System.out.println("True");
                break;
            }
        }

//            BONUS: Assert if the dropdown is in Alphabetical Order
        List<String>options = new ArrayList<>();
        for(WebElement eachDrop : dropDowns){
            String list = eachDrop.getText();
            options.add(list);
        }
        Collections.sort(options);

    }

}
