package com.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void isNullOrEmptyTestNull() {
        assertTrue(StringUtils.isNullOrEmpty(null));
    }

    @Test
    public void isNullOrEmptyTestEmpty() {
        assertTrue(StringUtils.isNullOrEmpty(""));
    }
}