package ru.isys.trainings.task7.unit2;

import ru.isys.trainings.task7.unit1.LinkList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HashedMap<K, V> {

    private final int defaultBucketCapacity = 16;
    private int size = 0;
    private List<LinkList<MapItem<K, V>>> buckets;

    public static class MapItem<K, V> {

        private final K key;
        private V value;

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
        buckets = new ArrayList<>(defaultBucketCapacity);
        setDefaultValuesInBucket();
        size = defaultBucketCapacity;
    }

    public HashedMap(int capacity) {
        buckets = new ArrayList<>(capacity);
        setDefaultValuesInBucket();
        size = capacity;
    }

    public boolean constraintsValue(V value) {
        for (LinkList<MapItem<K, V>> bucket : buckets) {
            if (getBucketItemValue(value, bucket) != null) {
                return true;
            }
        }

        return false;
    }

    public boolean constraintsKey(K key) {
        try {
            int keyOfBucket = getKeyOfBucket(key);
            LinkList<MapItem<K, V>> bucket = buckets.get(keyOfBucket);
            getBucketItemIndex(key, bucket);

            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void remove(K key) {
        int keyOfBucket = getKeyOfBucket(key);
        LinkList<MapItem<K, V>> bucket = buckets.get(keyOfBucket);
        bucket.remove(getBucketItemIndex(key, bucket));
    }

    public MapItem<K, V> get(K key) throws NoSuchElementException {
        int keyOfBucket = getKeyOfBucket(key);
        return searchBucketItem(key, buckets.get(keyOfBucket));
    }

    public void put(K key, V value) throws IndexOutOfBoundsException, NullPointerException {
        int keyOfBucket = getKeyOfBucket(key);
        setBucketItem(buckets.get(keyOfBucket), new MapItem<>(key, value));
    }

    public void clear() {
        for (LinkList<MapItem<K, V>> bucket : buckets) {
            bucket.clear();
        }
    }

    public boolean isEmpty() {
        for (LinkList<MapItem<K, V>> bucket : buckets) {
            if (!bucket.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public int getSize() {
        return size;
    }

    private void setBucketItem(LinkList<MapItem<K, V>> bucket, MapItem<K, V> newItem) {
        long currentBucketSize = bucket.getSize();

        if (currentBucketSize == 0) {
            bucket.add(newItem);
            return;
        }

        try {
            MapItem<K, V> item = searchBucketItem(newItem.getKey(), bucket);
            item.value = newItem.value;
        } catch (NoSuchElementException e) {
            bucket.add(newItem);
        }
    }

    private V getBucketItemValue(V value, LinkList<MapItem<K, V>> bucket) {
        for (MapItem<K, V> item : bucket) {
            if (item.getValue().equals(value)) {
                return item.getValue();
            }
        }

        return null;
    }

    private long getBucketItemIndex(K key, LinkList<MapItem<K, V>> bucket) {
        long itemIndex = 0;

        for (MapItem<K, V> item : bucket) {
            if (item.getKey().equals(key)) {
                return itemIndex;
            }

            itemIndex++;
        }

        throw new NoSuchElementException();
    }

    private MapItem<K, V> searchBucketItem(K key, LinkList<MapItem<K, V>> bucket) throws NoSuchElementException {
        for (MapItem<K, V> item : bucket) {
            if (item.getKey().equals(key)) {
                return item;
            }
        }

        throw new NoSuchElementException();
    }

    private int getKeyOfBucket(K key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("Can't get hashcode from key of null");
        }

        return Math.abs(key.hashCode() % 16);
    }

    private void setDefaultValuesInBucket() {
        for (int index = 0; index < defaultBucketCapacity; index++) {
            buckets.add(new LinkList<>());
        }
    }
}
