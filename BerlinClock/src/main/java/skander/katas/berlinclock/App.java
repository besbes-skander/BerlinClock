package skander.katas.berlinclock;

import skander.katas.berlinclock.models.BerlinClock;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        BerlinClock berlinClock = new BerlinClock(timeNow);
        berlinClock.displayBerlinClock();
    }
}
