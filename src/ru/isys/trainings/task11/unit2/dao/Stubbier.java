package ru.isys.trainings.task11.unit2.dao;

public class Stubbier {

    public static void subDao(Class<?> className, String methodName) {
        System.out.println(className.getName() + "::" + methodName + "() running...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(className.getName() + "::" + methodName + "() done");
    }

}
