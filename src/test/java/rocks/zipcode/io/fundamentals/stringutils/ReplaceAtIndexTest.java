package rocks.zipcode.io.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.StringUtils;

public class ReplaceAtIndexTest {
    @Test
    public void test1() {
        String input = "reptilian";
        String expected = "@eptilian";
        Character insertValue = '@';
        Integer indexToReplaceAt = 0;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    @Test
    public void test2() {
        String input = "reptilian";
        String expected = "r!ptilian";
        Character insertValue = '!';
        Integer indexToReplaceAt = 1;
        test(expected, input, insertValue, indexToReplaceAt);
    }

    @Test
    public void test3() {
        String input = "reptilian";
        String expected = "re#tilian";
        Character insertValue = '#';
        Integer indexToReplaceAt = 2;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test4() {
        String input = "reptilian";
        String expected = "rep ilian";
        Character insertValue = ' ';
        Integer indexToReplaceAt = 3;
        test(expected, input, insertValue, indexToReplaceAt);
    }


    @Test
    public void test5() {
        String input = "reptilian";
        String expected = "rept*lian";
        Character insertValue = '*';
        Integer indexToReplaceAt = 4;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test6() {
        String input = "reptilian";
        String expected = "reptiZian";
        Character insertValue = 'Z';
        Integer indexToReplaceAt = 5;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test7() {
        String input = "reptilian";
        String expected = "reptilXan";
        Character insertValue = 'X';
        Integer indexToReplaceAt = 6;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test8() {
        String input = "reptilian";
        String expected = "reptiliYn";
        Character insertValue = 'Y';
        Integer indexToReplaceAt = 7;
        test(expected, input, insertValue, indexToReplaceAt);
    }



    @Test
    public void test9() {
        String input = "reptilian";
        String expected = "reptiliaV";
        Character insertValue = 'V';
        Integer indexToReplaceAt = 8;
        test(expected, input, insertValue, indexToReplaceAt);
    }


    @Test
    public void test10() {
        String input = "reptilian";
        String expected = "reptilia\r";
        Character insertValue = '\r';
        Integer indexToReplaceAt = 8;
        test(expected, input, insertValue, indexToReplaceAt);
    }


    private void test(String expected, String input, Character replacementValue, Integer indexToReplaceAt) {
        String actual = StringUtils.replaceAtIndex(input, replacementValue, indexToReplaceAt);
        Assert.assertEquals(expected, actual);
    }
}
