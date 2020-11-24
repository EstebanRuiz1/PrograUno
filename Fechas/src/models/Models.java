package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Models {

    public void validateDates(int year, int month, int day) {
        if (year < 1900) {
            throw new IllegalArgumentException("Año inválido.");
        }
        LocalDate today = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(formatter.format(today));
    }

    public void verifyMinorDate() {
        try {
            SimpleDateFormat dateFormat = new
                    SimpleDateFormat("yyyy-MM-dd");
            Date date1 = dateFormat.parse("2019-09-16");
            Date date2 = dateFormat.parse("2020-01-25");
            System.out.println("Fecha 1: " +
                    dateFormat.format(date1));
            System.out.println("Fecha 2: " +
                    dateFormat.format(date2));
            if (date1.before(date2)) {
                System.out.println("La fecha uno es mas pequeña que la forma 2\n");
            }
        } catch (ParseException ex) {
        }
    }
}