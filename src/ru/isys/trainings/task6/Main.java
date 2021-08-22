package ru.isys.trainings.task6;

import ru.isys.trainings.task6.unit2.ListManipulator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * task6 unit 1 находится в task4 в главном классе
     * @see ru.isys.trainings.task4.Application
     * */
    public static void main(String[] args) {

        // unit2
        ListManipulator lm = new ListManipulator();

        List<String> linkedList = lm.getList(new LinkedList<>());
        List<String> arrayList = lm.getList(new ArrayList<>());

        long startTime = System.nanoTime();

        // pasting values
        lm.pasteIn(linkedList, "linkedList set in begin", ListManipulator.Position.BEGIN);
        System.out.println("LinkedList paste in begin: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.pasteIn(arrayList, "arrayList set in begin", ListManipulator.Position.BEGIN);
        System.out.println("ArrayList paste in begin: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.pasteIn(linkedList, "linkedList set in middle", ListManipulator.Position.MIDDLE);
        System.out.println("LinkedList paste in middle: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.pasteIn(arrayList, "arrayList set in middle", ListManipulator.Position.MIDDLE);
        System.out.println("ArrayList paste in middle: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.pasteIn(linkedList, "linkedList set in end", ListManipulator.Position.END);
        System.out.println("LinkedList paste in end: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.pasteIn(arrayList, "arrayList set in end", ListManipulator.Position.END);
        System.out.println("ArrayList paste in end: " + (System.nanoTime() - startTime));

        System.out.println("");

        // getting values
        lm.getIn(linkedList, ListManipulator.Position.BEGIN);
        System.out.println("LinkedList get in begin: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.getIn(arrayList, ListManipulator.Position.BEGIN);
        System.out.println("ArrayList get in begin: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.getIn(linkedList, ListManipulator.Position.MIDDLE);
        System.out.println("LinkedList get in middle: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.getIn(arrayList, ListManipulator.Position.MIDDLE);
        System.out.println("ArrayList get in middle: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.getIn(linkedList, ListManipulator.Position.END);
        System.out.println("LinkedList get in end: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.getIn(arrayList, ListManipulator.Position.END);
        System.out.println("ArrayList get in end: " + (System.nanoTime() - startTime));

        System.out.println("");

        // removing values
        lm.removeIn(linkedList, ListManipulator.Position.BEGIN);
        System.out.println("LinkedList remove in begin: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.removeIn(arrayList, ListManipulator.Position.BEGIN);
        System.out.println("ArrayList remove in begin: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.removeIn(linkedList, ListManipulator.Position.MIDDLE);
        System.out.println("LinkedList remove in middle: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.removeIn(arrayList, ListManipulator.Position.MIDDLE);
        System.out.println("ArrayList remove in middle: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.removeIn(linkedList, ListManipulator.Position.END);
        System.out.println("LinkedList remove in end: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        lm.removeIn(arrayList, ListManipulator.Position.END);
        System.out.println("ArrayList remove in end: " + (System.nanoTime() - startTime));

        System.out.println("");

        startTime = System.nanoTime();
        for(String llValue : linkedList) {}
        System.out.println("LinkedList iteration: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        for(String alValue : arrayList) {}
        System.out.println("ArrayList iteration: " + (System.nanoTime() - startTime));

    }

}
