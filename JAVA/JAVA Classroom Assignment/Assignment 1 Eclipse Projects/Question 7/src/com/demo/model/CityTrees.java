package com.demo.model;

import java.util.List;

public class CityTrees implements CityTreeInfo {
    private String city;
    private List<String> trees;

    public CityTrees(String city, List<String> trees) {
        this.city = city;
        this.trees = trees;
    }

    public String getCity() { return city; }
    public List<String> getTrees() { return trees; }
}