package com.demo.service;

import java.util.List;

public interface WrapperService {
    void addElement(List<Integer> list, int value);
    void removeElement(List<Integer> list, int value);
    boolean findElement(List<Integer> list, int value);
    void sortList(List<Integer> list);
    void display(List<Integer> list);
}