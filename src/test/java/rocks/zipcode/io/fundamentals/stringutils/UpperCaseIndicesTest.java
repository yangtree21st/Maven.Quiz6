package rocks.zipcode.io.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.StringUtils;

/**
 * @author leon on 24/01/2019.
 */
public class UpperCaseIndicesTest {
    @Test
    public void test1() {
        String expected = "Newton";
        String actual = StringUtils.upperCaseIndices("newton", 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "NEwton";
        String actual = StringUtils.upperCaseIndices("newton", 0,1);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        String expected = "NEWton";
        String actual = StringUtils.upperCaseIndices("newton", 0,1,2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        String expected = "NEWTon";
        String actual = StringUtils.upperCaseIndices("newton", 0,1,2,3);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test5() {
        String expected = "NEWTOn";
        String actual = StringUtils.upperCaseIndices("newton", 0,1,2,3,4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String expected = "nEwToN";
        String actual = StringUtils.upperCaseIndices("newton", 1,3,5);
        Assert.assertEquals(expected, actual);
    }
}
