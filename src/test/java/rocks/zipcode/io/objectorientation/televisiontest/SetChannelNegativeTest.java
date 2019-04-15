package rocks.zipcode.io.objectorientation.televisiontest;

import org.junit.Test;
import rocks.zipcode.io.objectorientation.Television;

/**
 * Ensures TV must be powered on before setting a channel
 */
public class SetChannelNegativeTest {
    @Test(expected = IllegalStateException.class)
    public void test1() {
        Television television = new Television();
        Integer channelNumber = 3;

        // when
        television.setChannel(channelNumber);
    }

    @Test(expected = IllegalStateException.class)
    public void test2() {
        Television television = new Television();
        Integer channelNumber = 4;

        // when
        television.setChannel(channelNumber);
    }


    @Test(expected = IllegalStateException.class)
    public void test3() {
        Television television = new Television();
        Integer channelNumber = 5;

        // when
        television.setChannel(channelNumber);
    }
}
