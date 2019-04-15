package rocks.zipcode.io.collections.collectionutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.collections.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;

public class FlattenTest {
    @Test
    public void test1() {
        // given
        Collection<?> collection1 = Arrays.asList(10, 11, 12, 13);
        Collection<?> collection2 = Arrays.asList(15, 110, 115, 120);
        Collection<?> collection3 = Arrays.asList(110, 120, 130, 140);
        Collection<?> collection4 = Arrays.asList(115, 130, 145, 160);
        Collection<?> expected = Arrays.asList(
                10, 11, 12, 13,
                15, 110, 115, 120,
                110, 120, 130, 140,
                115, 130, 145, 160);

        // when
        Collection<?> actual = CollectionUtils.flatten(collection1, collection2, collection3, collection4);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // given
        Collection<?> collection1 = Arrays.asList("10", "11", "12", "13");
        Collection<?> collection2 = Arrays.asList("15", "110", "115", "120");
        Collection<?> collection3 = Arrays.asList("110", "120", "130", "140");
        Collection<?> collection4 = Arrays.asList("115", "130", "145", "160");
        Collection<?> expected = Arrays.asList(
                "10", "11", "12", "13",
                "15", "110", "115", "120",
                "110", "120", "130", "140",
                "115", "130", "145", "160");

        // when
        Collection<?> actual = CollectionUtils.flatten(collection1, collection2, collection3, collection4);

        // then
        Assert.assertEquals(expected, actual);
    }

}
