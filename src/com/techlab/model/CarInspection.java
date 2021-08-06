package com.techlab.model;

public class CarInspection implements CarService{

	@Override
	public double getCost() {
		return 250;
	}
	
	@Override
	public String getDetails() {
		return "\nCar Inspection Complete...";
	}
}
