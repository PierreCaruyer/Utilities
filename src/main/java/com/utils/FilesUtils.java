package com.utils;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.jetbrains.annotations.Contract;

public final class FilesUtils {

    @Contract("null -> !null")
    public static final Collection<File> subDirs(final File file) {
        return file == null ? Collections.emptyList() : subDirs(file.getAbsolutePath());
    }

    public static final Collection<File> subDirs(final String path) {
        if(!fileExists(path)) {
            return Collections.emptyList();
        }
        final File file = new File(path);
        final File[] files = file.listFiles();
        if(files == null) {
            return Collections.emptyList();
        }
        return Arrays.stream(files)
                    .filter(File::isDirectory)
                    .collect(Collectors.toList());
    }

    @Contract("null -> !null")
    public static final Collection<File> dirFiles(final File file) {
        return file == null ? Collections.emptyList() : dirFiles(file.getAbsolutePath());
    }

    public static final Collection<File> dirFiles(final String path) {
        if(!fileExists(path)) {
            return Collections.emptyList();
        }
        final File file = new File(path);
        final File[] files = file.listFiles();
        if(files == null) {
            return Collections.emptyList();
        }
        return Arrays.stream(files)
                    .filter(File::isFile)
                    .collect(Collectors.toList());
    }

    public static final boolean fileExists(final String filePath) {
        return !StringUtils.isNullOrEmpty(filePath) && fileExists(new File(filePath));
    }

    @Contract("null -> false")
    public static final boolean fileExists(final File file) {
        return file != null && file.exists();
   }

    public static final int getFileLines(final File file) {
        if(!fileExists(file) || !file.isFile()) {
            return 0;
        }
        int count = 0;
        try {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            for(;reader.readLine() != null; ++count);
            reader.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return count;
    }
}
