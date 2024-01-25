package com.blueyonder.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneAPIExample {
    public static void main(String[] args) {
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println(currentZone);
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        // We use withZoneSameInstant() -- which returns a copy of current date-time
        // with a different time-zone, retaining the instant
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("tokyo time zone is " + tokyoZone);

    }
}
