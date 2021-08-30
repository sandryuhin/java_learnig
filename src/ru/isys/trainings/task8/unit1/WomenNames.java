package ru.isys.trainings.task8.unit1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WomenNames {

    private StringBuilder stringWithNames = new StringBuilder();

    public WomenNames() {
        readFileWithNames();
    }

    public String getNames() {
        return stringWithNames.toString();
    }

    private void readFileWithNames() {

        try (Scanner scanner = new Scanner(new File("D:\\Projects\\java\\learning\\task1\\src\\ru\\isys\\trainings\\task8\\unit1\\names.txt"))) {

            while (scanner.hasNextLine()) {
                stringWithNames.append(scanner.nextLine()).append("\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
