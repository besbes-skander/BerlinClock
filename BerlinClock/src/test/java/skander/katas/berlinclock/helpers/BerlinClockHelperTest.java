package skander.katas.berlinclock.helpers;

import org.junit.Assert;
import org.junit.Test;

public class BerlinClockHelperTest {

    @Test
    public void testGetActiveTopLampsShouldReturn2ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 13;

        int expectedActiveLamps = berlinClockHelper.getActiveTopLamps(unitTime);

        Assert.assertEquals(2, expectedActiveLamps, 0);
    }


    @Test
    public void testGetActiveTopLampsShouldReturn3ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 16;

        int expectedActiveLamps = berlinClockHelper.getActiveTopLamps(unitTime);

        Assert.assertEquals(3, expectedActiveLamps, 0);
    }

    @Test
    public void testGetActiveTopLampsShouldReturn0ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 4;

        int expectedActiveLamps = berlinClockHelper.getActiveTopLamps(unitTime);

        Assert.assertEquals(0, expectedActiveLamps, 0);
    }

    @Test
    public void testGetActiveBottomLampsShouldReturn0ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 15;

        int expectedActiveLamps = berlinClockHelper.getActiveBottomLamps(unitTime);

        Assert.assertEquals(0, expectedActiveLamps, 0);
    }

    @Test
    public void testGetActiveBottomLampsShouldReturn4ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 14;

        int expectedActiveLamps = berlinClockHelper.getActiveBottomLamps(unitTime);

        Assert.assertEquals(4, expectedActiveLamps, 0);
    }

    @Test
    public void testGetActiveSecondsLampsShouldReturn0ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 14;

        int expectedActiveLamps = berlinClockHelper.getActiveSecondsLamps(unitTime);

        Assert.assertEquals(0, expectedActiveLamps, 0);
    }

    @Test
    public void testGetActiveSecondsLampsShouldReturn1ActiveLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int unitTime = 55;

        int expectedActiveLamps = berlinClockHelper.getActiveSecondsLamps(unitTime);

        Assert.assertEquals(1, expectedActiveLamps, 0);
    }

    @Test
    public void testConvertToLightShouldReturn1RedLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int activeLamps = 1;
        int numberLamps = 4;

        String expectedLampsColor = berlinClockHelper.convertToLight(activeLamps, numberLamps, "R");

        Assert.assertEquals("ROOO", expectedLampsColor);
    }

    @Test
    public void testConvertToLightShouldReturn10YellowLamps() {
        BerlinClockHelper berlinClockHelper = new BerlinClockHelper();
        int activeLamps = 10;
        int numberLamps = 11;

        String expectedLampsColor = berlinClockHelper.convertToLight(activeLamps, numberLamps, "Y");

        Assert.assertEquals("YYYYYYYYYYO", expectedLampsColor);
    }
}