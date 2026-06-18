package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeDaoImpl implements TreeDao {
    private Map<String, List<String>> cityTrees = new TreeMap<>();

    public boolean addCity(String city, List<String> trees) {
        if (cityTrees.containsKey(city)) return false;
        cityTrees.put(city, trees);
        return true;
    }

    public List<String> findTrees(String city) { return cityTrees.get(city); }
    public boolean deleteCity(String city) { return cityTrees.remove(city) != null; }
    public Map<String, List<String>> findAll() { return cityTrees; }
}