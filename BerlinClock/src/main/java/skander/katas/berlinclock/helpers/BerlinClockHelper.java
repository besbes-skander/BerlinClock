package skander.katas.berlinclock.helpers;


public class BerlinClockHelper {

    public int getActiveTopLamps(int number) {
        return (number - (number % 5)) / 5;
    }

    public int getActiveBottomLamps(int number) {
        return number % 5;
    }

    public int getActiveSecondsLamps(int number) {
        return number % 2;
    }

    public String convertToLight(int numberOfActiveLamps, int numberOfLamps, String color) {
        String out = "";
        for (int i = 0; i < numberOfLamps; i++) {
            if(numberOfActiveLamps > 0) {
                out += color;
            } else {
                out += "O";
            }
            numberOfActiveLamps--;
        }

        return out;
    }
}
