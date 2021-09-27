package ru.isys.trainings.task9.unit1;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDays {

    public static int[] getDays(int monthNumber) {
        int countOfMonthDays = Month.of(monthNumber).length(false);
        int[] days = new int[countOfMonthDays];

        for (int dayNumber = 1; dayNumber <= countOfMonthDays; dayNumber++) {
            days[dayNumber - 1] = dayNumber;
        }

        return days;
    }

    public static String getMonthTitle(int monthNumber) {
        return "Days of " + Month.of(monthNumber).getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase(Locale.ROOT) + ": ";
    }

}
