package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class GetStringPrimitiveCharsTest {
    @Test
    public void test1() {
        // given
        String expected = "There's nothing better than testing";
        test(expected);
    }

    @Test
    public void test2() {
        // given
        String expected = "TDD is the way to go";
        test(expected);
    }

    @Test
    public void test3() {
        // given
        String expected = "How could you ever get tired of this shit?";
        test(expected);
    }

    @Test
    public void test4() {
        // given
        String expected = "It's lit";
        test(expected);
    }

    private void test(String expected) {
        char[] input = expected.toCharArray();

        // when
        String actual = BasicStringUtils.getString(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
