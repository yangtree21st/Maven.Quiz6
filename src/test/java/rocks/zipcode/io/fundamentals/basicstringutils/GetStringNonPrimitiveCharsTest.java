package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class GetStringNonPrimitiveCharsTest {
    @Test
    public void test1() {
        // given
        String expected = "This is test";
        test(expected);
    }

    @Test
    public void test2() {
        // given
        String expected = "We like testing";
        test(expected);
    }

    @Test
    public void test3() {
        // given
        String expected = "Testing is fun";
        test(expected);
    }

    @Test
    public void test4() {
        // given
        String expected = "Look at all this fun we're having! Wowww!!";
        test(expected);
    }

    private void test(String expected) {
        Character[] input = new Character[expected.length()];
        for (int i = 0; i < expected.length(); i++) {
            input[i] = expected.charAt(i);
        }

        // when
        String actual = BasicStringUtils.getString(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
