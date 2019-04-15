package rocks.zipcode.io.arrays.arrayutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.arrays.ArrayUtils;

public class UnboxTest {
    @Test
    public void test1() {
        Character[] input = {'a','b','c'};
        char[] expected = {'a','b','c'};
        test(input, expected);
    }

    @Test
    public void test2() {
        Character[] input = {'z','x','y'};
        char[] expected = {'z','x','y'};
        test(input, expected);
    }

    @Test
    public void test3() {
        Character[] input = {'_', '0', ','};
        char[] expected= {'_', '0', ','};
        test(input, expected);
    }

    private void test(Character[] input, char[] expected) {
        // when
        char[] actual = ArrayUtils.unbox(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
