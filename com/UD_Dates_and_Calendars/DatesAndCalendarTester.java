package com.UD_Dates_and_Calendars;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendarTester {

    public static void main(String [] args){
        DatesAndCalendarTester.displayCurrentDate();
        DatesAndCalendarTester.displaySetDate();
    }

    public static void displayCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.setTime(new java.util.Date());
        System.out.println(calendar.getTime());
    }

    public static void displaySetDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,9,26);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
