package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
	
	static Set<Vehicle> vset;
	static {
		vset = new HashSet<>();
		vset.add(new Vehicle(12,"Activa",80000,"5G",LocalDate.of(2000,9,23)));
		vset.add(new Vehicle(13,"Jupiter",100000,"6G",LocalDate.of(2015,10,19)));
		vset.add(new Vehicle(14,"Santro", 1000000,"sports",LocalDate.of(2020,12,12)));
	}

	@Override
	public boolean save(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vset.add(vehicle);
	}

	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub 
		return vset.remove(new Vehicle(id));
	}

	@Override
	public boolean updateById(int id, float newPrice) {
		// TODO Auto-generated method stub
		Vehicle v = findById(id);
		if(v != null) {
			v.setPrice(newPrice);
			return true;
		}
		return false;
	}

	@Override
	public Vehicle findById(int id) {
		// TODO Auto-generated method stub
		Optional <Vehicle> op= vset.stream().filter(v -> v.getVid() == id).findFirst();
		return op.orElse(null);
	}

	@Override
	public Set<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return vset;
	}

	@Override
	public List<Vehicle> findByPrice(double pr) {
		// TODO Auto-generated method stub
		List<Vehicle>lst = vset.stream().filter(v-> v.getPrice()>pr).collect(Collectors.toList());
		return lst.size()>0?lst:null;
	}

	public List<Vehicle> sortByPrice() {
		// TODO Auto-generated method stub
		Comparator<Vehicle> cv = (o1,o2)->{
			System.out.println("In comparator" + o1.getPrice() + o2.getPrice());
			return (int) (o1.getPrice() - o2.getPrice());
		};
		List<Vehicle> lst = new ArrayList<>();
		for(Vehicle v:vset) {
			lst.add(v);
		}
		lst.sort(cv);
		return lst;
	}

	@Override
	public List<Vehicle> sortByName() {
		// TODO Auto-generated method stub
		Comparator <Vehicle> cv = (o1,o2)->{
			System.out.println("In comparator" + o1.getVname() + o2.getVname());
			return o1.getVname().compareTo(o2.getVname());
		};
		
		List<Vehicle> lst = new ArrayList<>();
		for(Vehicle v:vset) {
			lst.add(v);
		}
		lst.sort(cv);
		return lst;
	}

	@Override
	public Set<Vehicle> sortById() {
		// TODO Auto-generated method stub
		Set<Vehicle> tset = new TreeSet<>(
				Comparator.comparing(Vehicle::getVid));
		for(Vehicle v: vset) {
			tset.add(v);
		}
		return tset;
	}

	@Override
	public List<Vehicle> sortByDate() {
		// TODO Auto-generated method stub
		List <Vehicle> lst = vset.stream().sorted((v1, v2)->v1.getMgdt().compareTo(v2.getMgdt())).toList();
		return lst;
	}

}
