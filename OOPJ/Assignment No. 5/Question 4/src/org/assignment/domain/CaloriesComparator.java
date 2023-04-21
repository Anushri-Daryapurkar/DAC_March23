package org.assignment.domain;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Menu> {

	@Override
	public int compare(Menu o1, Menu o2) {
		// TODO Auto-generated method stub
		return o1.getCalories()-o2.getCalories();
	}
	

}
