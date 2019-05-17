package com.seanshubin.tutorial.java;

public class TimeString {
    public static String stringOfTimesToSummedString(String stringOfTimes) {
        int seconds = stringOfTimesToSeconds(stringOfTimes);
        String summedString = secondsToString(seconds);
        return summedString;
    }

    private static int stringOfTimesToSeconds(String stringOfTimes) {
        String[] arrayOfTimeStrings = stringOfTimes.split(" ");
        int secondsSoFar = 0;
        for (String timeString : arrayOfTimeStrings) {
            int seconds = timeStringToSeconds(timeString);
            secondsSoFar += seconds;
        }
        return secondsSoFar;
    }

    private static int timeStringToSeconds(String timeString) {
        String[] timeStringParts = timeString.split(":");
        String minutesString = timeStringParts[0];
        String secondsString = timeStringParts[1];
        int minutes = Integer.parseInt(minutesString);
        int seconds = Integer.parseInt(secondsString);
        int totalSeconds = minutes * 60 + seconds;
        return totalSeconds;
    }

    private static String secondsToString(int totalSeconds) {
        int totalMinutes = totalSeconds / 60;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int seconds = totalSeconds % 60;
        String hoursString = Integer.toString(hours);
        String minutesString = Integer.toString(minutes);
        String secondsString = Integer.toString(seconds);
        String hoursMinutesSeconds = hoursString + ":" + minutesString + ":" + secondsString;
        return hoursMinutesSeconds;
    }
}
