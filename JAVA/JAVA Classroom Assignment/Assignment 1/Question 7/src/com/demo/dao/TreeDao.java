package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface TreeDao {
    boolean addCity(String city, List<String> trees);
    List<String> findTrees(String city);
    boolean deleteCity(String city);
    Map<String, List<String>> findAll();
}