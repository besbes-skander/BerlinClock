package skander.katas.berlinclock.models;

import skander.katas.berlinclock.helpers.BerlinClockHelper;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BerlinClock {

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("HH:mm:ss");
    private String seconds;
    private String topHours;
    private String bottomHours;
    private String topMinutes;
    private String bottomMinutes;
    private BerlinClockHelper berlinClockHelper = new BerlinClockHelper();

    public BerlinClock(LocalTime timeNow) {
        String formattedTime = timeNow.format(DTF);
        String[] splittedTime = formattedTime.split(":");
        this.setSeconds(splittedTime[2]);
        this.setTopHours(splittedTime[0]);
        this.setBottomHours(splittedTime[0]);
        this.setTopMinutes(splittedTime[1]);
        this.setBottomMinutes(splittedTime[1]);
    }

    public String getTopHours() {
        return topHours;
    }

    public void setTopHours(String topHours) {
        int activeLamps = berlinClockHelper.getActiveTopLamps(Integer.parseInt(topHours));
        this.topHours = berlinClockHelper.convertToLight(activeLamps, 4, "R");
    }

    public String getBottomHours() {
        return bottomHours;
    }

    public void setBottomHours(String bottomHours) {
        int activeLamps = berlinClockHelper.getActiveBottomLamps(Integer.parseInt(bottomHours));
        this.bottomHours = berlinClockHelper.convertToLight(activeLamps, 4, "R");
    }

    public String getTopMinutes() {
        return topMinutes;
    }

    public void setTopMinutes(String topMinutes) {
        int activeLamps = berlinClockHelper.getActiveTopLamps(Integer.parseInt(topMinutes));
        this.topMinutes = berlinClockHelper.convertToLight(activeLamps, 11, "Y").replaceAll("YYY", "YYR");
    }

    public String getBottomMinutes() {
        return bottomMinutes;
    }

    public void setBottomMinutes(String bottomMinutes) {
        int activeLamps = berlinClockHelper.getActiveBottomLamps(Integer.parseInt(bottomMinutes));
        this.bottomMinutes = berlinClockHelper.convertToLight(activeLamps, 4, "R");
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        int activeLamps = berlinClockHelper.getActiveSecondsLamps(Integer.parseInt(seconds));
        this.seconds = berlinClockHelper.convertToLight(activeLamps, 1, "Y");
    }

    public void displayBerlinClock() {
        System.out.println(this.getSeconds());
        System.out.println(this.getTopHours());
        System.out.println(this.getBottomHours());
        System.out.println(this.getTopMinutes());
        System.out.println(this.getBottomMinutes());
    }
}
