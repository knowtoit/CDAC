package com.demo.dao;

import java.util.Date;

public interface DateDAO {
    Date stringToDate(String str) throws Exception;
    String dateToString(Date date);
}