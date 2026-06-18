package com.demo.test;

import com.demo.service.*;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws Exception {

        DateService service = new DateServiceImpl();

        Date d1 = service.convertStringToDate("25-04-2026");
        Date d2 = service.convertStringToDate("20-04-2026");

        String str = service.convertDateToString(d1);
        long days = service.getDaysBetween(d1, d2);

        System.out.println("Date1: " + d1);
        System.out.println("Date2: " + d2);
        System.out.println("Date to String: " + str);
        System.out.println("Days between: " + days);
    }
}