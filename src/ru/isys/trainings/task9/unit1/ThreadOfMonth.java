package ru.isys.trainings.task9.unit1;

public class ThreadOfMonth implements Runnable {

    private final int monthNumber;

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            try {

                String title = MonthDays.getMonthTitle(this.monthNumber);
                int[] monthDays = MonthDays.getDays(this.monthNumber);

                System.out.print(title);
                for (Integer item : monthDays) {
                    Thread.sleep(100);
                    System.out.print(item + " ");
                }

                System.out.print("");
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public ThreadOfMonth(int monthNumber) {
        this.monthNumber = monthNumber;
    }

}
