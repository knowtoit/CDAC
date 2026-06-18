package com.demo.test;

import com.demo.dao.TreeDaoImpl;
import com.demo.service.TreeService;
import com.demo.service.TreeServiceImpl;
import java.util.List;

public class Question8LayeredTest {
    public static void main(String[] args) {
        TreeService service = new TreeServiceImpl(new TreeDaoImpl());
        service.addCityTrees("Mumbai", List.of("Banyan", "Mango"));
        service.addTree("Mumbai", "Neem");
        System.out.println(service.all());
        System.out.println(service.citiesForTree("Neem"));
    }
}