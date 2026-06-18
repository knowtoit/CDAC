package com.demo.test;

import com.demo.dao.TeamDaoImpl;
import com.demo.model.Player;
import com.demo.model.Team;
import com.demo.service.TeamService;
import com.demo.service.TeamServiceImpl;
import java.util.Scanner;

public class IplMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeamService service = new TeamServiceImpl(new TeamDaoImpl());
        IplTestData.load(service);
        int choice;
        do {
            System.out.println("\n1. Add new Team");
            System.out.println("2. Delete a team");
            System.out.println("3. Delete a player from team");
            System.out.println("4. Display all batsman");
            System.out.println("5. Display all player with speciality");
            System.out.println("6. Add a new player in a team");
            System.out.println("7. Modify coach of a team");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("Team id/name/coach: ");
                    service.addTeam(new Team(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine()));
                }
                case 2 -> {
                    System.out.print("Team id: ");
                    service.deleteTeam(Integer.parseInt(scanner.nextLine()));
                }
                case 3 -> {
                    System.out.print("Player id: ");
                    service.deletePlayer(Integer.parseInt(scanner.nextLine()));
                }
                case 4 -> service.playersBySpeciality("batsman").forEach(System.out::println);
                case 5 -> {
                    System.out.print("Speciality: ");
                    service.playersBySpeciality(scanner.nextLine()).forEach(System.out::println);
                }
                case 6 -> {
                    System.out.print("Team id: ");
                    int teamId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Player id/name/speciality: ");
                    Player player = new Player(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine());
                    service.addPlayer(teamId, player);
                }
                case 7 -> {
                    System.out.print("Team id: ");
                    int teamId = Integer.parseInt(scanner.nextLine());
                    System.out.print("New coach: ");
                    service.modifyCoach(teamId, scanner.nextLine());
                }
                case 8 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }
}