package it.unipr.informatica.exam;

public class CarSchema {
	private final int id;
	private final int height;
	private final String model;
	private final String brand;
	private final String color;
	private final String engine;
	private final int nbrOfDoors;
	
	CarSchema(int id, int height, String model, String brand, String color, String engine, int nbrOfDoors) {
		this.id = id;
		this.height = height;
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.engine = engine;
		this.nbrOfDoors = nbrOfDoors;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", height=" + height + ", model=" + model + ", brand=" + brand + ", color=" + color
				+ ", engine=" + engine + ", nbrOfDoors=" + nbrOfDoors + "]";
	}
	
	
	
}
