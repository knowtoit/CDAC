package com.demo.service;

import java.util.*;
import com.demo.dao.*;

public class WrapperServiceImpl implements WrapperService {

    WrapperDao dao = new WrapperDaoImpl();

    public void addElement(List<Integer> list, int value) {
        dao.insert(list, value);
    }

    public void removeElement(List<Integer> list, int value) {
        dao.delete(list, value);
    }

    public boolean findElement(List<Integer> list, int value) {
        return dao.search(list, value);
    }

    public void sortList(List<Integer> list) {
        dao.sort(list);
    }

    public void display(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}