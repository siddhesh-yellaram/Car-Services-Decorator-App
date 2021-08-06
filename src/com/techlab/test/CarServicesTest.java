package com.techlab.test;

import com.techlab.model.CarInspection;
import com.techlab.model.CarService;
import com.techlab.model.OilChange;
import com.techlab.model.TyreRotation;

public class CarServicesTest {
	public static void main(String []args) {
		CarService cs = new OilChange(new TyreRotation(new CarInspection()));
		System.out.println("Total Car Services Cost: "+cs.getCost());
		System.out.println("Total Car Services Completed: "+cs.getDetails());
	}
}
