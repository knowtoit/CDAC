package com.demo.test;

import java.util.*;
import com.demo.service.*;

public class WrapperTest {

    public static void main(String[] args) {

        WrapperService service = new WrapperServiceImpl();

        List<Integer> list = new ArrayList<>();

        // Insert
        service.addElement(list, 10);
        service.addElement(list, 20);
        service.addElement(list, 5);
        System.out.print("After Insert: ");
        service.display(list);

        // Delete
        service.removeElement(list, 20);
        System.out.print("After Delete: ");
        service.display(list);

        // Search
        boolean found = service.findElement(list, 10);
        System.out.println("Search 10: " + found);

        // Sort
        service.sortList(list);
        System.out.print("After Sort: ");
        service.display(list);
    }
}