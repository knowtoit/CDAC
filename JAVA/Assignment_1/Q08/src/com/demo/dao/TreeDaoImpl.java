package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeDaoImpl implements TreeDao {
    private Map<String, List<String>> cityTrees = new TreeMap<>();

    public boolean addCity(String city, List<String> trees) {
        if (cityTrees.containsKey(city)) return false;
        cityTrees.put(city, new ArrayList<>(trees));
        return true;
    }

    public void addTree(String city, String tree) {
        cityTrees.computeIfAbsent(city, key -> new ArrayList<>()).add(tree);
    }

    public List<String> citiesForTree(String tree) {
        List<String> cities = new ArrayList<>();
        cityTrees.forEach((city, trees) -> {
            if (trees.stream().anyMatch(value -> value.equalsIgnoreCase(tree))) cities.add(city);
        });
        return cities;
    }

    public Map<String, List<String>> all() { return cityTrees; }
}