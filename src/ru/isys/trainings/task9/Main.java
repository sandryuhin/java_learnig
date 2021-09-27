package ru.isys.trainings.task9;

import ru.isys.trainings.task9.unit1.ThreadOfMonth;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        int monthCount = 12;
        for (int monthNumber = 1; monthNumber <= monthCount; monthNumber++) {
            Runnable tom = new ThreadOfMonth(monthNumber);
            Thread thread = new Thread(tom);
            threads.add(thread);
            thread.start();
        }

        Thread.sleep(100000);
        threads.forEach(Thread::interrupt);

        System.out.println("All threads finished");
    }

}
