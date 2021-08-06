package com.techlab.model;

public class OilChange implements CarService{
	private CarService service;

	public OilChange(CarService service) {
		this.service = service;
	}

	@Override
	public double getCost() {
		return 1200 + service.getCost();
	}
	
	@Override
	public String getDetails() {
		return service.getDetails() + "\nOil Change Complete...";
	}
}
