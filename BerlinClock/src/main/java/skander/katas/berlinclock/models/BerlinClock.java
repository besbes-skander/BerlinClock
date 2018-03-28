package skander.katas.berlinclock.models;

import java.time.LocalTime;

public class BerlinClock {
    private String seconds;
    private String topHours;
    private String bottomHours;
    private String topMinutes;
    private String bottomMinutes;

    public BerlinClock(LocalTime timeNow) {
        this.seconds = "Y";
        this.topHours = "RRYY";
        this.bottomHours = "RYYY";
        this.topMinutes = "YYRYYYYYYYY";
        this.bottomMinutes = "RRRR";
    }

    public String getTopHours() {
        return topHours;
    }

    public void setTopHours(String topHours) {
        this.topHours = topHours;
    }

    public String getBottomHours() {
        return bottomHours;
    }

    public void setBottomHours(String bottomHours) {
        this.bottomHours = bottomHours;
    }

    public String getTopMinutes() {
        return topMinutes;
    }

    public void setTopMinutes(String topMinutes) {
        this.topMinutes = topMinutes;
    }

    public String getBottomMinutes() {
        return bottomMinutes;
    }

    public void setBottomMinutes(String bottomMinutes) {
        this.bottomMinutes = bottomMinutes;
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public void displayBerlinClock() {
        System.out.println(this.getSeconds());
        System.out.println(this.getTopHours());
        System.out.println(this.getBottomHours());
        System.out.println(this.getTopMinutes());
        System.out.println(this.getBottomMinutes());
    }
}
