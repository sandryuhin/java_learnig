package ru.isys.trainings.task7.unit2;

import ru.isys.trainings.task7.unit1.LinkList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HashedMap<K, V> {

    private final int defaultBucketCapacity = 16;
    private final List<LinkList<MapItem<K, V>>> buckets;

    public static class MapItem<K, V> {

        private final K key;
        private final V value;

        public MapItem(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
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

    public MapItem<K, V> get(K key) {
        int keyOfBucket = getKeyOfBucket(key);
        return buckets.get(keyOfBucket).get(0);
    }

    public void put(K key, V value) throws IndexOutOfBoundsException, NoSuchElementException, NullPointerException {
        int keyOfBucket = getKeyOfBucket(key);

        MapItem<K, V> newItem = new MapItem<>(key, value);

        if (buckets.get(keyOfBucket) == null) {
            buckets.get(keyOfBucket).set(0, newItem);
        } else {
            buckets.get(keyOfBucket).add(0, newItem);
        }
    }

    private int getKeyOfBucket(K key) {
        if (key == null) {
            throw new NullPointerException("Can't get hashcode from key of null");
        }

        return Math.abs(key.hashCode() % 16) - 1;
    }

    private LinkList<MapItem<K, V>> setDefaultValuesInBucket() {
        LinkList<MapItem<K, V>> defaultList = new LinkList<>();

        for (int index = 0; index < defaultBucketCapacity; index++) {
            defaultList.add(null);
        }

        return defaultList;
    }

}
