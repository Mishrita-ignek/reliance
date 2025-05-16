package com.reliance.stock.picker.cache;

public class CacheItem<V> {
    private final V value;
    private final long expiryTime;

    public CacheItem(V value, long ttlMillis) {
        if (ttlMillis == Long.MAX_VALUE) {
            this.expiryTime = Long.MAX_VALUE;
        } else {
            this.expiryTime = System.currentTimeMillis() + ttlMillis;
        }
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }
}