package com.demo.service;

import java.util.Date;
import com.demo.dao.*;

public class DateServiceImpl implements DateService {

    DateDAO dao = new DateDAOImpl();

    public Date convertStringToDate(String str) throws Exception {
        return dao.stringToDate(str);
    }

    public String convertDateToString(Date date) {
        return dao.dateToString(date);
    }

    public long getDaysBetween(Date d1, Date d2) {
        long diff = d1.getTime() - d2.getTime();
        return diff / (1000 * 60 * 60 * 24);
    }
}