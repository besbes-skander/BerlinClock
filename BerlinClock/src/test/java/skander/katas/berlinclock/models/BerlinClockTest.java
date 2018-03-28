package skander.katas.berlinclock.models;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class BerlinClockTest {

    LocalTime timeNow = LocalTime.now();

    @Test
    public void testGetTopHoursShouldReturn4characters() {
        int expectedLength = 4;

        BerlinClock berlinClock = new BerlinClock(timeNow);
        String topHours = berlinClock.getTopHours();

        Assert.assertEquals(expectedLength, topHours.length(), 0);
    }

    @Test
    public void testGetBottomHoursShouldReturn4characters() {
        int expectedLength = 4;

        BerlinClock berlinClock = new BerlinClock(timeNow);
        String bottomHours = berlinClock.getBottomHours();

        Assert.assertEquals(expectedLength, bottomHours.length(), 0);
    }

    @Test
    public void testGetTopMinutesShouldReturn11characters() {
        int expectedLength = 11;

        BerlinClock berlinClock = new BerlinClock(timeNow);
        String topMinutes = berlinClock.getTopMinutes();

        Assert.assertEquals(expectedLength, topMinutes.length(), 0);
    }

    @Test
    public void testGetBottomMinutesShouldReturn4characters() {
        int expectedLength = 4;

        BerlinClock berlinClock = new BerlinClock(timeNow);
        String bottomMinutes = berlinClock.getTopHours();

        Assert.assertEquals(expectedLength, bottomMinutes.length(), 0);
    }

    @Test
    public void testGetSecondsShouldReturn4characters() {
        int expectedLength = 1;

        BerlinClock berlinClock = new BerlinClock(timeNow);
        String seconds = berlinClock.getSeconds();

        Assert.assertEquals(expectedLength, seconds.length(), 0);
    }

    @Test
    public void testGetBottomHoursShouldLight2RedLamps() {
        String expectedTwoRedLamp = "RROO";
        String hourTwoRedLamp = "12";

        BerlinClock berlinClock = new BerlinClock(timeNow);
        berlinClock.setBottomHours(hourTwoRedLamp);

        String lampsLighted = berlinClock.getBottomHours();
        Assert.assertEquals(expectedTwoRedLamp, lampsLighted);
    }

    @Test
    public void testGetBottomHoursShouldLight4RedLamps() {
        String expectedFourRedLamp = "RRRR";
        String hourFourRedLamp = "24";

        BerlinClock berlinClock = new BerlinClock(timeNow);
        berlinClock.setBottomHours(hourFourRedLamp);

        String lampsLighted = berlinClock.getBottomHours();
        Assert.assertEquals(expectedFourRedLamp, lampsLighted);
    }

    @Test
    public void testGetBottomMinutesShouldLightRedLampForEachQuarter() {
        String expectedTopMinutes = "YYRYYRYYROO";
        String minutes = "47";

        BerlinClock berlinClock = new BerlinClock(timeNow);
        berlinClock.setTopMinutes(minutes);

        String lampsLighted = berlinClock.getTopMinutes();
        Assert.assertEquals(expectedTopMinutes, lampsLighted);
    }


    @Test
    public void testGetBottomMinutesShouldLight4RedLamps() {
        String expectedFourRedLamp = "RRRR";
        String minutesFourRedLamp = "34";

        BerlinClock berlinClock = new BerlinClock(timeNow);
        berlinClock.setBottomMinutes(minutesFourRedLamp);

        String lampsLighted = berlinClock.getBottomMinutes();
        Assert.assertEquals(expectedFourRedLamp, lampsLighted);
    }

    @Test
    public void testGetBottomMinutesShouldLight2RedLamps() {
        String expectedTwoRedLamp = "RROO";
        String minutesTwoRedLamp = "22";

        BerlinClock berlinClock = new BerlinClock(timeNow);
        berlinClock.setBottomMinutes(minutesTwoRedLamp);

        String lampsLighted = berlinClock.getBottomMinutes();
        Assert.assertEquals(expectedTwoRedLamp, lampsLighted);
    }

}
