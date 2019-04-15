package rocks.zipcode.io.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.StringUtils;

/**
 * @author leon on 10/01/2019.
 */
public class InsertAtIndexTest {
    @Test
    public void test1() {
        String input = "reptilian";
        String expected = "r0eptilian";
        String insertValue = "0";
        Integer indexToReplaceAt = 1;
        test(expected, input, insertValue, indexToReplaceAt);
    }
    @Test
    public void test7() {
        String input = "reptilian";
        String expected = "rxxeptilian";
        String insertValue = "xx";
        Integer indexToReplaceAt = 1;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    @Test
    public void test8() {
        String input = "airl";
        String expected = "aiZZrl";
        String insertValue = "ZZ";
        Integer indexToReplaceAt = 2;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    private void test(String expected, String stringToBeManipulated, String valueToBeInserted, Integer index){
        String actual = StringUtils.insertAtIndex(stringToBeManipulated, valueToBeInserted, index);
        Assert.assertEquals(expected, actual);
    }
}
