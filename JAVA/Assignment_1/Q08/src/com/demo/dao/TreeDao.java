package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface TreeDao {
    boolean addCity(String city, List<String> trees);
    void addTree(String city, String tree);
    List<String> citiesForTree(String tree);
    Map<String, List<String>> all();
}