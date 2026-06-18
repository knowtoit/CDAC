package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleDao {

	boolean save(Vehicle vehicle);

	boolean removeById(int id);

	boolean updateById(int id, float newPrice);

	Vehicle findById(int id);

	Set<Vehicle> findAll();

	List<Vehicle> findByPrice(double pr);

	List<Vehicle> sortByPrice();

	List<Vehicle> sortByName();

	Set<Vehicle> sortById();

	List<Vehicle> sortByDate();

}
