package skander.katas.berlinclock.helpers;


public class BerlinClockHelper {

    private static final String DEFAULTCOLOR = "O";

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
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < numberOfLamps; i++) {
            if(numberOfActiveLamps > 0) {
                out.append(color);
            } else {
                out.append(DEFAULTCOLOR);
            }
            numberOfActiveLamps--;
        }

        return out.toString();
    }
}
