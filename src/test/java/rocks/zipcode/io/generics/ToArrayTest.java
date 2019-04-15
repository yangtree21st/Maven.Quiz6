package rocks.zipcode.io.generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ToArrayTest {
    @Test
    public void test1() {
        String[] array = {"That", "Damn", "Fast", "Bunny"};
        test(Arrays.asList(array), array);
    }

    @Test
    public void test2() {
        Integer[] array = {10, 15, 115, 120, 125};
        test(Arrays.asList(array), array);
    }

    @Test
    public void test3() {
        Character[] array = {'T', 'G', 'I', 'F'};
        test(Arrays.asList(array), array);
    }

    @Test
    public void test4() {
        Boolean[] array = {false, true, false, true, true, false, true, false};
        test(Arrays.asList(array), array);
    }

    private <E> void test(Collection<E> collection, E[] expected) {
        E[] collectionToArray = GenericUtils.toArray(collection);
        List<E> arrayAsList = Arrays.asList(collectionToArray);
        List<E> expectedAsList = Arrays.asList(expected);

        Assert.assertEquals(expectedAsList, arrayAsList);
    }
}
