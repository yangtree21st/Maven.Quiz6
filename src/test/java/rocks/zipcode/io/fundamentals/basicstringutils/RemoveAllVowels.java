package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class RemoveAllVowels {
    @Test
    public void test1() {
        test("ABCDEFG", "BCDFG");
    }

    @Test
    public void test2() {
        test("Firefly", "Frfly");
    }

    @Test
    public void test3() {
        test("Coachella", "Cchll");
    }

    @Test
    public void test4() {
        test("Burning man", "Brnng mn");
    }

    @Test
    public void test5() {
        test("Mississippi", "Msssspp");
    }

    private void test(String input, String expected) {
        // given
        // when
        String actual = BasicStringUtils.removeAllVowels(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
