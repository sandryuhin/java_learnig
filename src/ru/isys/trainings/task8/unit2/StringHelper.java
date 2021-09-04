package ru.isys.trainings.task8.unit2;

import java.util.Locale;

public class StringHelper {

    static char[] VOWELS = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};

    public static int getVowelsCount(String str) {

        char[] strChars = str.toLowerCase(Locale.ROOT).toCharArray();

        int counter = 0;
        for (char strChar : strChars) {
            for (char vowelChar : VOWELS) {
                if (strChar == vowelChar) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static boolean isVowel(String someStr) {
        char firstCharOfStr = someStr.toLowerCase(Locale.ROOT).charAt(0);
        for (char vowel : VOWELS) {
            if (vowel == firstCharOfStr) {
                return true;
            }
        }

        return false;
    }

}
