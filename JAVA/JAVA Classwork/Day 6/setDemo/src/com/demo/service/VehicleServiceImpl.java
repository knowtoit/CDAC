package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.VehicleDao;
import com.demo.dao.VehicleDaoImpl;
import com.demo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {
	private VehicleDao vdao;

	public VehicleServiceImpl() {
		super();
		this.vdao = new VehicleDaoImpl();
	}

	@Override
	public boolean addNewVehicle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String vname = sc.next();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		System.out.println("Enter model");
		String model = sc.next();
		System.out.println("Enter date (dd/mm/yyyy)");
		String date = sc.next();
		
		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		
		
		return vdao.save(new Vehicle(id,vname,price,model,ldt));
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return vdao.removeById(id);
	}

	@Override
	public boolean modifyById(int id, float newPrice) {
		// TODO Auto-generated method stub
		return vdao.updateById(id, newPrice);
	}

	@Override
	public Vehicle getById(int id) {
		// TODO Auto-generated method stub
		return vdao.findById(id);
	}

	@Override
	public Set<Vehicle> getAll() {
		// TODO Auto-generated method stub
		return vdao.findAll();
	}

	@Override
	public List<Vehicle> getByPrice(double pr) {
		// TODO Auto-generated method stub
		return vdao.findByPrice(pr);
	}

	@Override
	public List<Vehicle> sortByPrice() {
		// TODO Auto-generated method stub
		return vdao.sortByPrice();
	}

	@Override
	public List<Vehicle> sortByName() {
		// TODO Auto-generated method stub
		return vdao.sortByName();
	}

	@Override
	public Set<Vehicle> sortById() {
		// TODO Auto-generated method stub
		return vdao.sortById();
	}

	@Override
	public List<Vehicle> sortByDate() {
		// TODO Auto-generated method stub
		return vdao.sortByDate();
	}
	
	

}
