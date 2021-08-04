package ru.isys.trainings.task5;

import ru.isys.trainings.task5.unit1.Computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("Windows 10 x64 Rus", "Ryzen 1800x", "32Gb");

        System.out.println(computer.getComputerInfo());

    }

}
