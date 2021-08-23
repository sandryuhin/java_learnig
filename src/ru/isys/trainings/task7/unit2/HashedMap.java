package ru.isys.trainings.task7.unit2;

import ru.isys.trainings.task7.unit1.LinkList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HashedMap<K, V> {

    private final int defaultBucketCapacity = 16;
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
        this.buckets = new ArrayList<>(defaultBucketCapacity);

        for (int index = 0; index < defaultBucketCapacity; index++) {
            buckets.add(index, setDefaultValuesInBucket());
        }
    }

    public HashedMap(int capacity) {
        this.buckets = new ArrayList<>(capacity);
    }

    public void put(K key, V value) throws IndexOutOfBoundsException, NoSuchElementException {
        int hashOfKey = key.hashCode();
        int keyOfBucket = Math.abs(hashOfKey % 16) - 1;

        MapItem<K, V> newItem = new MapItem<>(key, value);

        if (buckets.get(keyOfBucket) == null) {
            buckets.get(keyOfBucket).set(keyOfBucket, newItem);
        } else {
            buckets.get(keyOfBucket).add(keyOfBucket, newItem);
        }
    }

    private LinkList<MapItem<K, V>> setDefaultValuesInBucket() {
        LinkList<MapItem<K, V>> defaultList = new LinkList<>();

        for (int index = 0; index < defaultBucketCapacity; index++) {
            defaultList.add(null);
        }

        return defaultList;
    }

}
