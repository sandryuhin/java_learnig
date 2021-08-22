package ru.isys.trainings.task6.unit2;

import java.util.List;
import java.util.Random;

public class ListManipulator {

    public enum Position {
        BEGIN,
        MIDDLE,
        END
    }

    public String getIn(List<String> list, Position position) {

        switch (position) {
            case BEGIN:
                return list.get(0);

            case MIDDLE:
                return list.get(list.size() / 2);

            case END:
                return list.get(list.size() - 1);

            default:
                return "";
        }

    }

    public void removeIn(List<String> list, Position position) {

        switch (position) {
            case BEGIN:
                list.remove(0);
                break;

            case MIDDLE:
                list.remove(list.size() / 2);
                break;

            case END:
                list.remove(list.size() - 1);
                break;
        }

    }

    public void pasteIn(List<String> list, String value, Position position) {

        switch (position) {
            case BEGIN:
                list.add(0, value);
                break;

            case MIDDLE:
                list.add(list.size() / 2, value);
                break;

            case END:
                list.add(list.size(), value);
                break;
        }

    }

    public List<String> getList(List<String> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(getRandomString(10));
        }

        return list;
    }

    private String getRandomString(int len) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int randIdx = new Random().nextInt(alphabet.length());
            char randChar = alphabet.charAt(randIdx);
            b.append(randChar);
        }

        return b.toString();
    }

}
