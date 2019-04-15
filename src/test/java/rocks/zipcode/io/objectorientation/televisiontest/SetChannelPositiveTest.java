package rocks.zipcode.io.objectorientation.televisiontest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.objectorientation.TVChannel;
import rocks.zipcode.io.objectorientation.Television;

public class SetChannelPositiveTest {
    @Test
    public void test1() {
        String expectedName = "MSN";
        Integer channelNumber = 0;
        test(expectedName, channelNumber);
    }

    @Test
    public void test2() {
        String expectedName = "CNN";
        Integer channelNumber = 1;
        test(expectedName, channelNumber);
    }

    @Test
    public void test3() {
        String expectedName = "FOX";
        Integer channelNumber = 2;
        test(expectedName, channelNumber);
    }

    private void test(String expectedName, Integer channelNumber) {
        Television television = new Television();
        television.turnOn();

        // when
        television.setChannel(channelNumber);
        TVChannel tvChannel = television.getChannel();
        String actualName = tvChannel.name();

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}
