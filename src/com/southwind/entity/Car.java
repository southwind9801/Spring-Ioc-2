package com.southwind.entity;

public class Car {
	private int id;
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Car() {
		System.out.println("创建了Car对象");
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + "]";
	}
	
}
