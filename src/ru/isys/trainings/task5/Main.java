package ru.isys.trainings.task5;

import ru.isys.trainings.task5.unit1.Computer;
import ru.isys.trainings.task5.unit2.Airline;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("Windows 10 x64 Rus", "Ryzen 1800x", "32Gb");
        System.out.println(computer.getComputerInfo());

        Airline airline = new Airline();
        airline.setAirlineType(Airline.AirlineType.REGULAR);
        airline.setDestination("New York");
        airline.setFlightNumber(777);
        airline.setFlightTime(LocalDateTime.now().toLocalTime());
        airline.setDaysOfWeeks(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY});

        System.out.println(
                airline.getFlightNumber() + " " +
                airline.getAirlineType().getDescription() + " " +
                airline.getFlightTime() + " " +
                Arrays.toString(airline.getDaysOfWeeks()) + " " +
                airline.getDestination()
        );

    }

}
