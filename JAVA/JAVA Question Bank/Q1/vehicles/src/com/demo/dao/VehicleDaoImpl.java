package com.demo.dao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.model.ElectricVehicle;
import com.demo.model.PetrolVehicle;
import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

	static Set<Vehicle> vset;
	
	static {
		vset= new HashSet<>();
		vset.add(new PetrolVehicle(1, "Jupiter", 23000, "sold","petrol", 23.00 ));
	}
	@Override
	public boolean save(Vehicle v) {
		// TODO Auto-generated method stub
		return vset.add(v);
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return vset.remove(new PetrolVehicle(id));
	}
	
	public boolean modifyPriceById(int id, double newPrice) {
		// TODO Auto-generated method stub
		Vehicle v = findById(id);
		if(v!=null) {
			if(v instanceof ElectricVehicle) {
				((ElectricVehicle)v).setPrice(newPrice);
			}
			else if(v instanceof PetrolVehicle) {
				((PetrolVehicle)v).setPrice(newPrice);
			}
			return true;
		}
		return false;
	}
	public Vehicle findById(int id) {
		// TODO Auto-generated method stub
		Optional <Vehicle> op= vset.stream().filter(v->v.getVid()==id).findFirst();
		return op.orElse(null);
	}
	public boolean sellVehicleById(int id) {
		// TODO Auto-generated method stub
		Vehicle v = findById(id);
		if(v!= null) {
			if(v.getStatus().equalsIgnoreCase("AVAILABLE")) {
				v.setStatus("SOLD");
				return true;
			}
			else {
				System.out.println("Vehicle already sold!");
				return false;
			}
		}
		else{
			System.out.println("Vehicle not found");
		}
		return false;
	}
	@Override
	public boolean purchaseVehicleById(int id) {
		// TODO Auto-generated method stub
		Vehicle v = findById(id);
		if(v !=null) {
			if(v.getStatus().equalsIgnoreCase("SOLD")) {
				v.setStatus("AVAILABLE");
				return true;
			}
			else {
				System.out.println("Vehicle already available");
			}
		}
		else {
			System.out.println("Vehicle not found");
		}
		return false;
	}
	@Override
	public Set<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return vset;
	}

	@Override
	public Set<Vehicle> findByType(int ch) {
		if (ch == 1) {
			return vset.stream().filter(v -> v instanceof ElectricVehicle)
					.collect(Collectors.toCollection(LinkedHashSet::new));
		}
		if (ch == 2) {
			return vset.stream().filter(v -> v instanceof PetrolVehicle)
					.collect(Collectors.toCollection(LinkedHashSet::new));
		}
		return new LinkedHashSet<>();
	}

	@Override
	public Set<Vehicle> findByPriceRange(double minPrice, double maxPrice) {
		return vset.stream().filter(v -> v.getPrice() >= minPrice && v.getPrice() <= maxPrice)
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}

	@Override
	public List<Vehicle> sortByPrice() {
		return vset.stream().sorted(Comparator.comparingDouble(Vehicle::getPrice)).collect(Collectors.toList());
	}

	@Override
	public Vehicle searchByName(String name) {
		Optional<Vehicle> op = vset.stream().filter(v -> v.getVname().equalsIgnoreCase(name)).findFirst();
		return op.orElse(null);
	}
	
}
