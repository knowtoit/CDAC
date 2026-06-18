package com.demo.dao;

import java.util.*;

public class WrapperDaoImpl implements WrapperDao {

    public void insert(List<Integer> list, int value) {
        list.add(value);
    }

    public void delete(List<Integer> list, int value) {
        list.remove(Integer.valueOf(value));
    }

    public boolean search(List<Integer> list, int value) {
        return list.contains(value);
    }

    public void sort(List<Integer> list) {
        Collections.sort(list);
    }
}