package com.demo.test;

import com.demo.dao.UserDaoImpl;
import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) throws Exception {
        UserTestData.printHelp();
        Scanner scanner = new Scanner(System.in);
        UserService service = new UserServiceImpl(new UserDaoImpl());

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        User user = service.searchUser(username, address);
        if (user != null) {
            System.out.println("User found: " + user);
        } else {
            System.out.println("User not found. Enter details.");
            System.out.print("Mobile: ");
            String mobile = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            service.addUser(new User(username, address, mobile, email));
            System.out.println("User added.");
        }
    }
}