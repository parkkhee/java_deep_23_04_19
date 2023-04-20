package com.ll.exam2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyHashMapTest {

    private MyHashMap<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new MyHashMap<>();
    }

    @Test
    void testPut() {
        assertNull(map.put("Key1", 1));
        assertEquals(1, map.size());
    }

    @Test
    void testPutReplace() {
        map.put("Key1", 1);
        assertEquals(Integer.valueOf(1), map.put("Key1", 2));
        assertEquals(1, map.size());
    }

    @Test
    void testGet() {
        map.put("Key1", 1);
        map.put("Key2", 2);
        assertEquals(Integer.valueOf(1), map.get("Key1"));
        assertEquals(Integer.valueOf(2), map.get("Key2"));
    }

    @Test
    void testRemove() {
        map.put("Key1", 1);
        map.put("Key2", 2);
        assertEquals(Integer.valueOf(1), map.remove("Key1"));
        assertNull(map.remove("Key3"));
        assertEquals(1, map.size());
    }

}