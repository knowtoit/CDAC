package com.demo.test;

import com.demo.service.WrapperListService;

public class TestWrapperList {
    public static void main(String[] args) {
        WrapperListService service = new WrapperListService();

        System.out.println("Integer Wrapper Class Operations");
        service.performIntegerListOperations();

        System.out.println();
        System.out.println("Double Wrapper Class Operations");
        service.performDoubleListOperations();

        System.out.println();
        System.out.println("Character Wrapper Class Operations");
        service.performCharacterListOperations();

        System.out.println();
        System.out.println("Boolean Wrapper Class Operations");
        service.performBooleanListOperations();
    }
}
