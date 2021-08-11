package com.learning;

import java.util.HashMap;

public class WeekDay {
    private static final HashMap weekDays = new HashMap<Integer, String>();
    static {
        weekDays.put(1, "Sunday");
        weekDays.put(2, "Monday");
        weekDays.put(3, "Tuesday");
        weekDays.put(4, "Wednesday");
        weekDays.put(5, "Thursday");
        weekDays.put(6, "Friday");
        weekDays.put(7, "Saturday");
    }

    public String day(int dayNumber) {
        return (String)weekDays.get(dayNumber);
    }
}
