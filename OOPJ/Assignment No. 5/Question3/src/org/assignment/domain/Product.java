package org.assignment.domain;

public class Product {
	
	private String name;
	private  double price;
	private String category;
	
	public Product() {
		
	}

	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s%-10.2f%-10s ", this.name, this.price, this.category);
	}


	
}
