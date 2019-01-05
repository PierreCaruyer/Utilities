package com.utils;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class ArraysUtilsTest {

    @Test
    public void asList() {
        final String[] strings = new String[] {"f1", "f2", "f3"};
        final Collection<String> collectionStrings = new ArraysUtils<>(strings).asList();
        assertEquals(strings.length, collectionStrings.size());
    }

    @Test
    public void asListOnNull() {
        final String[] strings = null;
        final Collection<String> collectionStrings = new ArraysUtils<>(strings).asList();
        assertEquals(0, collectionStrings.size());
    }

    @Test
    public void asListOnEmptyArray() {
        final String[] strings = new String[0];
        final Collection<String> collectionStrings = new ArraysUtils<>(strings).asList();
        assertEquals(0, collectionStrings.size());
    }
}