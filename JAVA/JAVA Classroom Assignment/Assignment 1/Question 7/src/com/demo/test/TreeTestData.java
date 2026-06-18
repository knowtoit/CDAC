package com.demo.test;

import com.demo.service.TreeService;
import java.util.List;

public class TreeTestData {
    public static void load(TreeService service) {
        service.addCityTrees("Mumbai", List.of("Banyan", "Mango"));
        service.addCityTrees("Pune", List.of("Neem", "Gulmohar"));
    }
}