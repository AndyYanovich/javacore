package com.kitcenter.runners.classwork.lesson10;

public class FilePath {
    public String getFilePath(String name) {
        return getClass().getClassLoader().getResource(name).getPath();
    }
}
