package com.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ArraysUtils<T> {

    private final T[] array;

    public ArraysUtils(final T ... array) {
        this.array = array;
    }

    public final List<T> asList() {
        if(array == null || array.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(array);
    }
}
