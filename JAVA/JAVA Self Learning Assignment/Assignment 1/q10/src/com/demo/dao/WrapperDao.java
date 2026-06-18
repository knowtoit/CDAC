package com.demo.dao;

import java.util.List;

public interface WrapperDao {
    void insert(List<Integer> list, int value);
    void delete(List<Integer> list, int value);
    boolean search(List<Integer> list, int value);
    void sort(List<Integer> list);
}