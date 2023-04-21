package org.assignment.domain;

public class Menu implements Comparable<Menu>{

	private String name;
	private double price;
	private int calories;
	
	public Menu() {
		
	}

	public Menu(String name, double price, int calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s%-10.2f%-5d",this.name,this.price,this.calories);
	}

	@Override
	public int compareTo(Menu o) {
		// TODO Auto-generated method stub
		return (int) (this.price-o.price);
	}
	
	
	
}
