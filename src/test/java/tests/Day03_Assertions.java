package tests;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {
    @Test
    public void assertions(){
        /*
        what is assertion in testing
        Assertion is done to check if expected result is equal to actual result
        -expected== actual -> pass
        -expected!= actual -> fail
        ---------------------
        assertEquals("expected","actual");
        assertTrue(true); -> pass
        assertTrue(false); -> fail
        assertFalse(false); -> pass
        assertFalse(true); -> fail
        --------------------
         */
        Assert.assertEquals(5,5);//pass

        if("java".contains("f"))
        Assert.assertEquals("java","java");//pass
        Assert.assertEquals("java".contains("j"),"java");//pass

        Assert.assertTrue("java".contains("j"));//pass

        Assert.assertFalse("Java".contains("j"));//pass

//        TEST EXECUTION STOPS IF ONE THE ASSERTION FAILS. THIS IS CALLED HARD ASSERTIOS
//        TEST EXECUTION CONTINUES EVEN IF TEST VERRIFICATION FAILS. VERIFICATION MEANS LIKE IF STATEMENT

       // --------------------------------------------
//        What is difference between Assertion and Verification?
//        Assertion stops after assertion fails. Verification continues even after verification fails
//        Junit assertions are hard assertion. If statement is verification
//        NOTE: TestNG has soft assertion as well. We will learn it in TestNG


    }
}
