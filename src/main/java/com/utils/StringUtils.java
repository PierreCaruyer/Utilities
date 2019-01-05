package com.utils;

import org.jetbrains.annotations.Contract;

public final class StringUtils {

    @Contract("null -> true")
    public static final boolean isNullOrEmpty(final String string) {
        return string == null || string.trim().isEmpty();
    }
}
