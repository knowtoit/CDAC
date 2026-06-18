package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleService {

	boolean addNewVehicle(int ch);

	boolean deleteById(int id);

	boolean updatePriceById(int id, double newPrice);

	boolean sellVehicle(int id);

	boolean purchaseVehicle(int id);

	Set<Vehicle> getAll();

	Set<Vehicle> getVehiclesByType(int ch);

	Set<Vehicle> getVehiclesByPriceRange(double minPrice, double maxPrice);

	List<Vehicle> sortVehiclesByPrice();

	Vehicle searchVehicleByName(String name);

}
