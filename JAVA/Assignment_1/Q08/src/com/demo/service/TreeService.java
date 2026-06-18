package com.demo.service;

import java.util.List;
import java.util.Map;

public interface TreeService {
    boolean addCityTrees(String city, List<String> trees);
    void addTree(String city, String tree);
    List<String> citiesForTree(String tree);
    Map<String, List<String>> all();
}