package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StringArray {
	public static ArrayList<String> findStringsContainingJava(ArrayList<String> inputList) {
        ArrayList<String> list2 = new ArrayList<>();

        for (String str : inputList) {
            if (str.toLowerCase().contains("java")) {
                list2.add(str);
            }
        }

        return list2;
    }
	
	public static ArrayList<String> findUppercaseStrings(ArrayList<String> inputList) {
        ArrayList<String> list3 = new ArrayList<>();

        for (String str : inputList) {
            if (!str.isEmpty() && str.equals(str.toUpperCase())) {
                list3.add(str);
            }
        }

        return list3;
    }
	
	public static void displayList(String title, ArrayList<String> list) {
        System.out.println(title);

        for (String str : list) {
            System.out.println(str);
        }
    }

	
	public static void writeListToFile(ArrayList<String> list, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String str : list) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }
}
