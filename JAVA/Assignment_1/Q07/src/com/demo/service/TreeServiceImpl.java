package com.demo.service;

import com.demo.dao.TreeDao;
import java.util.List;
import java.util.Map;

public class TreeServiceImpl implements TreeService {
    private TreeDao dao;

    public TreeServiceImpl(TreeDao dao) { this.dao = dao; }
    public boolean addCityTrees(String city, List<String> trees) { return dao.addCity(city, trees); }
    public List<String> treesForCity(String city) { return dao.findTrees(city); }
    public boolean deleteCity(String city) { return dao.deleteCity(city); }
    public Map<String, List<String>> allCityTrees() { return dao.findAll(); }
}