package rocks.zipcode.io.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.StringUtils;

import java.util.Arrays;
import java.util.Collection;

public class GetAllCasingsTest {
    @Test
    public void test1() {
        // given
        String stringInput = "xy";
        Collection<String> expected = Arrays.asList(
                "Xy", "xy", "XY", "xY");



        test(stringInput, expected);
    }

    @Test
    public void test2() {
        // given
        String stringInput = "xyz";
        Collection<String> expected = Arrays.asList(
                "XYz", "XYZ", "Xyz", "xyz",
                "xYz", "XyZ", "xyZ", "xYZ");
        test(stringInput, expected);
    }

    @Test
    public void test3() {
        // given
        String stringInput = "xyzt";
        Collection<String> expected = Arrays.asList(
                        "xyzt", "xYzt", "xyZt", "xYZt",
                        "xyzT", "xYzT", "xyZT", "xYZT",
                        "XYzt", "XYZt", "XYzT", "XYZT",
                        "Xyzt", "XyZt", "XyzT", "XyZT");
        test(stringInput, expected);
    }

    @Test
    public void test4() {
        // given
        String stringInput = "xy zt";
        Collection<String> expected = Arrays.asList(
                "xy zt", "xY zt", "xy Zt", "xY Zt",
                "xy zT", "xY zT", "xy ZT", "xY ZT",
                "XY zt", "XY Zt", "XY zT", "XY ZT",
                "Xy zt", "Xy Zt", "Xy zT", "Xy ZT");
        test(stringInput, expected);
    }

    private void test(String stringInput, Collection<String> expected) {
        // when
        Collection<String> actual = StringUtils.getAllCasings(stringInput);


        // then
        Assert.assertTrue(actual.containsAll(expected));
        Assert.assertTrue(expected.containsAll(actual));
    }

}
