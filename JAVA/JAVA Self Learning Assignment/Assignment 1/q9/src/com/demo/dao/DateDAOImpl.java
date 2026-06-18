package com.demo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDAOImpl implements DateDAO {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Date stringToDate(String str) throws Exception {
        return sdf.parse(str);
    }

    public String dateToString(Date date) {
        return sdf.format(date);
    }
}