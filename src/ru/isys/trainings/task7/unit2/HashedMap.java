package ru.isys.trainings.task7.unit2;

import ru.isys.trainings.task7.unit1.LinkList;

import java.util.ArrayList;
import java.util.List;

public class HashedMap<K, V> {

    private final List<LinkList<MapItem<K, V>>> buckets;

    private static class MapItem<K, V> {

        K key;
        V value;

        public MapItem(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    public HashedMap() {
        this.buckets = new ArrayList<>(16);
    }

    public HashedMap(int capacity) {
        this.buckets = new ArrayList<>(capacity);
    }

    public void put(K key, V value) {
        int hashOfKey = key.hashCode();
        int keyOfBucket = hashOfKey % 16;

        MapItem<K, V> newItem = new MapItem<>(key, value);

        if (buckets.get(keyOfBucket) == null) {
            buckets.get(keyOfBucket).set(keyOfBucket, newItem);
        }
    }

}
