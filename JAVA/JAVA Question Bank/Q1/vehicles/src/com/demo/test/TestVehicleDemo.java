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
		int choice=0;
		
		do {
			System.out.println("1.Add new Vehicle\n 2.Remove vehicle using vehicleId \n 3.Update vehicle price\n 4.Sell vehicle");
			System.out.println("5.Purchase vehicle\n 6.Display all vehicles\n 7. Display vehicles by type\n 8.Display vehicles within price range");
			System.out.println("9.Sort vehicles by price\n 10.Search vehicle by name\n 11.Exit\n choice:");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.println("Add Vehicle\n 1.Electric Vehicle\n 2. Petrol Vehicle");
				int ch = sc.nextInt();
				boolean status = vservice.addNewVehicle(ch);
				if(status) {
					System.out.println("Addedd successfully");
				}
				else {
					System.out.println("Could not add");
				}
			}
			case 2->{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				boolean status = vservice.deleteById(id);
				if(status) {
					System.out.println("Deleted Successfully!");
				}
				else {
					System.out.println("Could not delete");
				}
			}
			case 3->{
				System.out.println("Enter id");
				int id= sc.nextInt();
				System.out.println("Enter new price");
				double newPrice=sc.nextDouble();
				boolean status=vservice.updatePriceById(id, newPrice);
				if(status) {
					System.out.println("Price Updated successfully!");
				}
				else {
					System.out.println("Not found");
				}
			}
			case 4->{
				System.out.println("Enter vehicle id to sell");
				int id = sc.nextInt();
				boolean status = vservice.sellVehicle(id);
				if(status) {
					System.out.println("Vehicle sold");
				}
				else {
					System.out.println("Cound not sell");
				}
			}
			case 5->{
				System.out.println("Enter vehicle id to purchase");
				int id = sc.nextInt();
				boolean status=vservice.purchaseVehicle(id);
				if(status) {
					System.out.println("Vehicle purchased");
				}
				else {
					System.out.println("Could not purchase");
				}
			}
			case 6->{
				Set<Vehicle> vs= vservice.getAll();
				vs.forEach(System.out::println);
			}
				case 7->{
					System.out.println("1.Electric Vehicle\n2.Petrol Vehicle");
					int ch = sc.nextInt();
					Set<Vehicle> vs = vservice.getVehiclesByType(ch);
					if(vs.isEmpty()) {
						System.out.println("No vehicles found");
					}
					else {
						vs.forEach(System.out::println);
					}
				}
				case 8->{
					System.out.println("Enter minimum price");
					double minPrice = sc.nextDouble();
					System.out.println("Enter maximum price");
					double maxPrice = sc.nextDouble();
					Set<Vehicle> vs = vservice.getVehiclesByPriceRange(minPrice, maxPrice);
					if(vs.isEmpty()) {
						System.out.println("No vehicles found");
					}
					else {
						vs.forEach(System.out::println);
					}
				}
				case 9->{
					List<Vehicle> vs = vservice.sortVehiclesByPrice();
					if(vs.isEmpty()) {
						System.out.println("No vehicles found");
					}
					else {
						vs.forEach(System.out::println);
					}
				}
				case 10->{
					System.out.println("Enter vehicle name");
					String name = sc.next();
					Vehicle v = vservice.searchVehicleByName(name);
					if(v != null) {
						System.out.println(v);
					}
					else {
						System.out.println("Vehicle not found");
					}
				}
			case 11->{
				sc.close();
				System.out.println("Thank you for visiting!!");
			}
			default->{
				System.out.println("Wrong choice!");
			}
			}
		}
		while(choice != 11);
	}

}
