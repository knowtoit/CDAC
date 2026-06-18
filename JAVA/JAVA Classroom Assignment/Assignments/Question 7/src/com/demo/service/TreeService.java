package com.demo.service;

import java.util.List;
import java.util.Map;

public interface TreeService {
    boolean addCityTrees(String city, List<String> trees);
    List<String> treesForCity(String city);
    boolean deleteCity(String city);
    Map<String, List<String>> allCityTrees();
}