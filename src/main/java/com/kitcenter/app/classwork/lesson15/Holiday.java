package com.kitcenter.app.classwork.lesson15;

public enum Holiday {
    NEW_YEAR(1, "January", "New Year"),
    OLD_NEW_YEAR(14, "January", "Old New Year"),
    FOOLS_DAY(1, "April", "Fool's Day");

    private int day;
    private String month;
    private String name;

    Holiday(int day, String month, String name) {
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
