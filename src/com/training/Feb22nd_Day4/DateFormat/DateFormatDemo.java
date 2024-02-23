package com.training.Feb22nd_Day4.DateFormat;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args){

        //converting the date into our preffered locale language
        Locale loc = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
        String date = dateFormat.format(new Date());
        System.out.println(date);

        //Converting the date to our format pattern
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat datePattren = new SimpleDateFormat(pattern);
        String date1 = datePattren.format(new Date());
        System.out.println(date1);

        //Converting a String to Date format
        LocalDate date3 = LocalDate.parse("2024-02-23");
    }
}
