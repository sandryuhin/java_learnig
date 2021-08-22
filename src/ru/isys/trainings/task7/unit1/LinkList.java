package ru.isys.trainings.task7.unit1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkList<E> implements Iterable<E> {

    private ListItem<E> head = null;
    private int size = 0;

    private static class ListItem<E> {

        E data;
        ListItem<E> next;

        public ListItem(E data, ListItem<E> next) {
            this.data = data;
            this.next = next;
        }

    }

    private class LinkIterator implements Iterator<E> {

        ListItem<E> current;

        public LinkIterator(ListItem<E> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }

            E value = current.data;
            current = current.next;

            return value;
        }

    }

    public void add(int index, E element) throws NoSuchElementException {
        if (index < 0 || index > size + 1) {
            throw new NoSuchElementException();
        }

        if (index == size) {
            add(element);
            return;
        }

        ListItem<E> item = head;
        ListItem<E> newItem = new ListItem<>(element, null);
        if (index == 0) {
            head = newItem;
            newItem.next = item;
            return;
        }

        int currentIndex = 0;
        while (item.next != null) {
            if (currentIndex == index - 1) {
                ListItem<E> nextItem = item.next;
                item.next = newItem;
                newItem.next = nextItem;
                break;
            }

            item = item.next;
            currentIndex++;
        }

    }

    public void add(E element) {
        ListItem<E> newItem = new ListItem<>(element, null);

        if (head == null) {
            head = newItem;
        } else {
            ListItem<E> lastItem = head;
            while (lastItem.next != null) {
                lastItem = lastItem.next;
            }

            lastItem.next = newItem;
        }

        size++;
    }

    public void clear() {
        if (head == null) {
            return;
        }

        ListItem<E> item = head;
        while (item.next != null) {
            item = item.next;
        }

        head = null;
        System.gc();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkIterator(head);
    }

    public long getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
