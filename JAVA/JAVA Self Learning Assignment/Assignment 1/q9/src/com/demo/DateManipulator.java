package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {
    public static void main(String[] args) throws Exception {

        // Format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // ------------------
        // 1. String to Date
        String str = "25-04-2026";
        Date d1 = sdf.parse(str);
        System.out.println("String to Date: " + d1);

        // ------------------
        // 2. Date to String
        String str2 = sdf.format(d1);
        System.out.println("Date to String: " + str2);

        // ------------------
        // 3. Difference between two dates
        String str3 = "20-04-2026";
        Date d2 = sdf.parse(str3);

        long diff = d1.getTime() - d2.getTime();
        long days = diff / (1000 * 60 * 60 * 24);

        System.out.println("Days between: " + days);
    }
}