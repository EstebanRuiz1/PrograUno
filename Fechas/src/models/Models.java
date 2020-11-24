package models;

import java.util.Date;

public class Models {
    Date date = new Date()

    private boolean validateDates(int year, int month, int day) {
        boolean yearB = false, monthB = false, dayB = false;
        if (year > date.getYear()) {
            yearB = true;
        }
        if (month < 0 && month <= 12) {
            monthB = true;
        }
        if (day <= date.getDay()) {
            dayB = true;
        }
        return yearB + monthB + dayB;
    }
}