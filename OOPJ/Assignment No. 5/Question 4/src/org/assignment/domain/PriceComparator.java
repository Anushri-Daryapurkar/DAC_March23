package org.assignment.domain;

import java.util.Comparator;

public class PriceComparator implements Comparator<Menu> {

	@Override
	public int compare(Menu o1, Menu o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrice()-o2.getPrice());
	}
	

}
