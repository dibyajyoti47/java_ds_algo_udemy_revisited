package com.dj_practicing_dsalgo.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class Hashtable<K, V> {

    private LinkedList<Entry<K,V>>[] hashtable;

    public Hashtable () {
        hashtable = new LinkedList[10];
    }

    public int getHashIndex (K key) {
        return key.hashCode() % hashtable.length;
    }

    public void put (K key, V value) {
        int keyIndex = getHashIndex(key);
        if (hashtable[keyIndex] == null)
            hashtable[keyIndex] = new LinkedList<Entry<K,V>>();
        hashtable[keyIndex].add(new Entry<K,V>(key, value));
    }

    public V get(K key) {
        int index = getHashIndex(key);
        LinkedList<Entry<K,V>> list = hashtable[index];
        V value = null;
        for (Entry<K,V> entry: list) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
        }
        return value;
    }

    public void printHashtable () {
        Arrays.stream(hashtable).forEach(list -> {
            if (list != null) list.forEach(System.out::print);
            else System.out.println(list);
        });
    }
    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public boolean equals (Entry entry) {
            return entry.getKey().equals(this.key) && entry.getValue().equals(this.value);
        }

        public String toString() {
            return this.value.toString();
        }
    }
}
