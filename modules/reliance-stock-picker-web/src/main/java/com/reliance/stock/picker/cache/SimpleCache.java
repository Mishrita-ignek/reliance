package com.reliance.stock.picker.cache;

import java.util.concurrent.ConcurrentHashMap;

public class SimpleCache {
    private static final ConcurrentHashMap<String, CacheItem<String>> CACHE = new ConcurrentHashMap<>();

    public static void put(String key, String value, long ttlMillis) {
        CACHE.put(key, new CacheItem<>(value, ttlMillis));
    }

    public static String get(String key) {
        CacheItem<String> item = CACHE.get(key);
        if (item == null || item.isExpired()) {
            CACHE.remove(key);
            return null;
        }
        return item.getValue();
    }

    public static void remove(String key) {
        CACHE.remove(key);
    }

    public static void clear() {
        CACHE.clear();
    }
}