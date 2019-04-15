package rocks.zipcode.io.arrays.arrayutils;

import org.junit.Test;
import rocks.zipcode.io.arrays.ArrayUtils;
import rocks.zipcode.io.TestUtilities;

/**
 * @author leon on 24/01/2019.
 */
public class GetRangeTest {
    @Test
    public void test1() {
        Integer start = 0;
        Integer end = 3;
        Integer[] expected = {0, 1, 2, 3};
        Integer[] actual = ArrayUtils.getRange(start, end);
        TestUtilities.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Integer start = 6;
        Integer end = 10;
        Integer[] expected = {6, 7, 8, 9, 10};
        Integer[] actual = ArrayUtils.getRange(start, end);
        TestUtilities.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Integer start = -9;
        Integer end = 0;
        Integer[] expected = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        Integer[] actual = ArrayUtils.getRange(start, end);
        TestUtilities.assertArrayEquals(expected, actual);
    }
}