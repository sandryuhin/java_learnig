package ru.isys.trainings.task3.unit3;

import java.time.*;

public class Timer {

    public static void getSeconds() {

        LocalDateTime localTime = LocalDateTime.now();
        LocalDateTime tomorrow = localTime.plusDays(1);
        LocalDateTime tomorrowDate = tomorrow
                .minusSeconds(tomorrow.getSecond())
                .minusHours(tomorrow.getHour())
                .minusMinutes(tomorrow.getMinute());

        Duration duration = Duration.between(localTime, tomorrowDate);

        System.out.println(duration.getSeconds());

    }

}
