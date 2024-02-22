package com.training.Feb22nd_Day4.Temporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalDemo {
    public static void main(String... args){
        LocalDate date = LocalDate.now();
        System.out.println("Today is: "+date);

        LocalDate nextMonday = date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Next Monday is: "+nextMonday);

    }
}
