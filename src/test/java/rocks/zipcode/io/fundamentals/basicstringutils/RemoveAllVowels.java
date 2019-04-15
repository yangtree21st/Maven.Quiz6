package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class RemoveAllVowels {
    @Test
    public void test1() {
        test("WOWWWWW", "WWWWWW");
    }

    @Test
    public void test2() {
        test("we're", "w'r");
    }

    @Test
    public void test3() {
        test("Oh shit", "h sht");
    }

    @Test
    public void test4() {
        test("AEIOU", "");
    }

    @Test
    public void test5() {
        test("aeiou", "");
    }

    private void test(String input, String expected) {
        // given
        // when
        String actual = BasicStringUtils.removeAllVowels(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
