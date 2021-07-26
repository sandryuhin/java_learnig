package ru.isys.trainings.task3.unit3;

import java.time.*;

public class Timer {

    public static void getSeconds() {

        LocalDateTime localTime = LocalDateTime.now();
        LocalDateTime tomorrow = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.of(0,0,0));

        Duration duration = Duration.between(localTime, tomorrow);

        System.out.println(duration.getSeconds());
    }

}
