package com.demo.service;

import com.demo.dao.TreeDao;
import java.util.List;
import java.util.Map;

public class TreeServiceImpl implements TreeService {
    private TreeDao dao;

    public TreeServiceImpl(TreeDao dao) { this.dao = dao; }
    public boolean addCityTrees(String city, List<String> trees) { return dao.addCity(city, trees); }
    public void addTree(String city, String tree) { dao.addTree(city, tree); }
    public List<String> citiesForTree(String tree) { return dao.citiesForTree(tree); }
    public Map<String, List<String>> all() { return dao.all(); }
}