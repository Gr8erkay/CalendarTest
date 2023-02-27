package org.gr8erkay;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Calendar calendar = new GregorianCalendar();

        int month = calendar.get(Calendar.MONTH) +1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);

        int hour = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        String am_pm;

        if (calendar.get(Calendar.AM_PM) == 0){
            am_pm = "AM";
        }else {
            am_pm = "PM";
            hour += 12;
        }
        System.out.println(hour + ":" + min + ":" + sec + " " + am_pm + " ");
        System.out.println(month + "/" + day + "/" + year);
    }
}