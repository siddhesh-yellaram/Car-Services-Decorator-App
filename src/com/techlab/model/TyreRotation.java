package com.techlab.model;

public class TyreRotation implements CarService{
	private CarService service;

	public TyreRotation(CarService service) {
		this.service = service;
	}

	@Override
	public double getCost() {
		return 350 + service.getCost();
	}
	
	@Override
	public String getDetails() {
		return service.getDetails() + "\nTyre Rotation Complete...";
	}
	
}
