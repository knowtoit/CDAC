package com.demo.test;

import com.demo.dao.FriendDaoImpl;
import com.demo.model.Friend;
import com.demo.service.FriendService;
import com.demo.service.FriendServiceImpl;
import java.time.LocalDate;
import java.util.Scanner;

public class FriendMenu {
    private static Friend acceptFriend(Scanner scanner) {
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Hobbies comma separated: ");
        String[] hobbies = scanner.nextLine().split(",");
        System.out.print("Mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date yyyy-mm-dd: ");
        LocalDate bdate = LocalDate.parse(scanner.nextLine());
        System.out.print("Address: ");
        String address = scanner.nextLine();
        return new Friend(id, name, lastName, hobbies, mobile, email, bdate, address);
    }

    private static void display(Friend[] friends) {
        for (Friend friend : friends) {
            friend.display();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FriendService service = new FriendServiceImpl(new FriendDaoImpl());
        FriendTestData.load(service);

        int choice;
        do {
            System.out.println("\n1. Add Friend");
            System.out.println("2. Display All Friend");
            System.out.println("3. Search by id");
            System.out.println("4. Search by name");
            System.out.println("5. Display all friend with a particular hobby");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> service.addFriend(acceptFriend(scanner));
                case 2 -> display(service.getAllFriends());
                case 3 -> {
                    System.out.print("Id: ");
                    Friend friend = service.searchById(Integer.parseInt(scanner.nextLine()));
                    if (friend != null) friend.display();
                }
                case 4 -> {
                    System.out.print("Name: ");
                    display(service.searchByName(scanner.nextLine()));
                }
                case 5 -> {
                    System.out.print("Hobby: ");
                    display(service.searchByHobby(scanner.nextLine()));
                }
                case 6 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}