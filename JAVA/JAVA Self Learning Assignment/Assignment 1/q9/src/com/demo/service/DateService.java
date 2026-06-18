package com.demo.service;

import java.util.Date;

public interface DateService {
    Date convertStringToDate(String str) throws Exception;
    String convertDateToString(Date date);
    long getDaysBetween(Date d1, Date d2);
}