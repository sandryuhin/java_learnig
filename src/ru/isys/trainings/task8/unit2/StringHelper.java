package ru.isys.trainings.task8.unit2;

import java.util.Locale;
import java.util.Map;

public class StringHelper {

    public static int getVowelsCount(String str) {
        char[] vowels = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        char[] strChars = str.toLowerCase(Locale.ROOT).toCharArray();

        int counter = 0;
        for (char strChar : strChars) {
            for (char vowelChar : vowels) {
                if (strChar == vowelChar) {
                    counter++;
                }
            }
        }

        return counter;
    }

}
