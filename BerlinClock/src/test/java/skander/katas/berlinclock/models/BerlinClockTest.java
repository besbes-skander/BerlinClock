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

}
