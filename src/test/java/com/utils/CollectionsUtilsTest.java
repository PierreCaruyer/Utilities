package com.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CollectionsUtilsTest {

    @Test
    public void isEmpty() {
        final Collection<String> collection = new ArrayList<>();
        assertTrue(CollectionsUtils.isEmpty(collection));
    }

    @Test
    public void isEmptyOnNull() {
        final Collection<String> collection = null;
        assertTrue(CollectionsUtils.isEmpty(collection));
    }
}