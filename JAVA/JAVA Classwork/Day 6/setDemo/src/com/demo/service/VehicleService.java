package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleService {

	boolean addNewVehicle();

	boolean deleteById(int id);

	boolean modifyById(int id, float newPrice);

	Vehicle getById(int id);

	Set<Vehicle> getAll();

	List<Vehicle> getByPrice(double pr);

	List<Vehicle> sortByPrice();

	List<Vehicle> sortByName();

	Set<Vehicle> sortById();

	List<Vehicle> sortByDate();

}
