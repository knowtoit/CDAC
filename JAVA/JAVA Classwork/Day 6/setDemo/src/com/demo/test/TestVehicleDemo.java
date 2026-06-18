package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImpl;

public class TestVehicleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		VehicleService vservice = new VehicleServiceImpl();
		int choice = 0;
		
		do {
			System.out.println("1. add new vehicle\n 3. delete vehicle\n4. modify vehicle price\n5. displayall");
			System.out.println("6.display by id\n7.display by price \n8. sort by price\n 9. sort by name\n10. sort by id");
			System.out.println("11. sort by date\n 12. exit\n choice :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1->{
				boolean status = vservice.addNewVehicle();
				if(status) {
					System.out.println("Addedd Successfully");
				}
				else {
					System.out.println("Could not addedd");
				}
			}
			case 2->{
							
			}
			case 3->{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				boolean status = vservice.deleteById(id);
				if(status) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Could not deleted");
				}
			}
			case 4->{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				System.out.println("Enter new price");
				float newPrice = sc.nextFloat();
				boolean status = vservice.modifyById(id, newPrice);
				if(status) {
					System.out.println("Updated successfully");
				}
				else {
					System.out.println("Could not update");
				}
			}
			case 5->{
				Set<Vehicle> vs = vservice.getAll();
				vs.forEach(System.out::println);
			}
			case 6->{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				Vehicle v = vservice.getById(id);
				if(v != null) {
					System.out.println(v);
				}
				else {
					System.out.println("Not found");
				}
			}
			case 7->{
				System.out.println("Enter price");
				double pr = sc.nextDouble();
				List<Vehicle> lst = vservice.getByPrice(pr);
				if(lst != null) {
					lst.forEach(System.out::println);
				}
				else {
					System.out.println("Not found");
				}
			}
			case 8->{
				List<Vehicle> vset = vservice.sortByPrice();
				vset.forEach(System.out::println);
			}
			case 9->{
				List<Vehicle> vset = vservice.sortByName();
				vset.forEach(System.out::println);
			}
			case 10->{
				Set<Vehicle> vset = vservice.sortById();
				vset.forEach(System.out::println);
			}
			case 11->{
				List<Vehicle> vset = vservice.sortByDate();
				vset.forEach(System.out::println);
			}
			case 12->{
				sc.close();
				System.out.println("Thank you for visiting!!");
			}
			default->{
				System.out.println("Wrong Choice");
			}
			}
			
		}while(choice != 12);

	}

}
