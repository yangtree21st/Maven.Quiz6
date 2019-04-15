package rocks.zipcode.io.objectorientation.televisiontest;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.objectorientation.TVChannel;
import rocks.zipcode.io.objectorientation.Television;

public class SetChannelPositiveTest {
    @Test
    public void test1() {
        String expectedName = "NBC";
        Integer channelNumber = 7;
        test(expectedName, channelNumber);
    }

    @Test
    public void test2() {
        String expectedName = "CBS";
        Integer channelNumber = 8;
        test(expectedName, channelNumber);
    }


    @Test
    public void test3() {
        String[] expectedNames = {"MSN", "CNN", "FOX", "AE", "MTV", "BET", "HBO", "NBC", "CBS"};
        for (int channelNumber = 0; channelNumber < expectedNames.length; channelNumber++) {
            String expectedName = expectedNames[channelNumber];
            test(expectedName, channelNumber);
        }
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
