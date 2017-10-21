package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Holiday;

public class HolidayRunner {
    public static void main(String[] args) {
        for (Holiday holiday : Holiday.values()) {
            String text = holiday.getName() + " holiday is on " +
                    holiday.getMonth() + ", " + holiday.getDay();

            System.out.println(text);
        }
    }
}