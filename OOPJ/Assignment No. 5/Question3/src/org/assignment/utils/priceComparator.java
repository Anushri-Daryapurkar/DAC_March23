package org.assignment.utils;

import java.util.Comparator;

import org.assignment.domain.Product;

public class priceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrice()-o2.getPrice());
	}

}
