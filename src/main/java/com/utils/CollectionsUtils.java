package com.utils;

import java.util.Collection;

public final class CollectionsUtils {

    public static final boolean isEmpty(final Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
