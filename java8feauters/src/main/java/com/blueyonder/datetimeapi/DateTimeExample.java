package com.blueyonder.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //Deprected constructor so we should not use it.
        Date dt = new Date(2021,1,28);
        System.out.println(dt);

        LocalDate localDate= LocalDate.of(2021,02,28);
        System.out.println(localDate);
        System.out.println(LocalDate.now());//Current date of the system
        System.out.println(LocalDateTime.now());//Current date and time of the system
        LocalTime time = LocalTime.now();
        System.out.println("The current time is : "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = dateTime.format(formatter);


        System.out.println(formatedDateTime);

        // Print some specified date
        LocalDate date2 = LocalDate.of(1947, 8, 15);
        System.out.println(date2);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date2.format(formatter1));

        System.out.println(date2.isLeapYear());

        int month = date2.getDayOfMonth();
        System.out.println(month);
        int year = date2.getYear();
        System.out.println(year);
        LocalDate dt1 = LocalDate.now();
        System.out.println("Day of week for 15-08-1947-- "+date2.getDayOfWeek());
        System.out.println("Day of year for 15-08-1947-- "+date2.getDayOfYear());
        System.out.println("Month value for 15-08-1947-- "+date2.getMonthValue());
        System.out.println("Date after "+date2+"----"+date2.isAfter(dt1));
        System.out.println("Date before "+date2+"----"+date2.isBefore(dt1));
    }
}

