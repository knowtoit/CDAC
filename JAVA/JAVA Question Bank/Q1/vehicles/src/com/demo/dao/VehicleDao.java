package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleDao {

	boolean save(Vehicle v);

	boolean removeById(int id);

	boolean modifyPriceById(int id, double newPrice);

	boolean sellVehicleById(int id);

	boolean purchaseVehicleById(int id);

	Set<Vehicle> findAll();

	Set<Vehicle> findByType(int ch);

	Set<Vehicle> findByPriceRange(double minPrice, double maxPrice);

	List<Vehicle> sortByPrice();

	Vehicle searchByName(String name);

}
