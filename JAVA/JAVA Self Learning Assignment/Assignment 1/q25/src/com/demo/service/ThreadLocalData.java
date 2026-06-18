package com.demo.service;

public class ThreadLocalData {
    private static InheritableThreadLocal<String> userName = new InheritableThreadLocal<String>();

    public static void setUserName(String name) {
        userName.set(name);
    }

    public static String getUserName() {
        return userName.get();
    }

    public static void removeUserName() {
        userName.remove();
    }
}
