package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class RemoveSpecifiedCharacters {
    @Test
    public void test1() {
        test("A", "ABC", "");
    }

    @Test
    public void test2() {
        test("jewish", "sh", "jewi");
    }

    @Test
    public void test3() {
        test("catholic", "c", "atholi");
    }

    @Test
    public void test4() {
        test("christian", "cn", "hristia");
    }

    @Test
    public void test5() {
        test("buddhist", "bd", "uhist");
    }

    private void test(String input, String charactersToReplace, String expected) {
        // given
        // when
        String actual = BasicStringUtils.removeSpecifiedCharacters(input,charactersToReplace);

        // then
        Assert.assertEquals(expected, actual);
    }
}
