package org.assignment.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.assignment.domain.CaloriesComparator;
import org.assignment.domain.Menu;
import org.assignment.domain.NameComparator;
import org.assignment.domain.PriceComparator;

public class Program {

	private static Menu[] getArray() {
		// TODO Auto-generated method stub
		Menu[] arr = new Menu[5];
		arr[0] = new Menu("Dosa", 40.00, 60);
		arr[1] = new Menu("Idli", 30.00, 75);
		arr[2] = new Menu("Samosa", 25.00, 80);
		arr[3] = new Menu("Kachori", 25.00, 85 );
		arr[4] = new Menu("Poha", 30.00, 50);
		return arr;
	}
	
	private static void printRecord(Menu[] arr) {
		// TODO Auto-generated method stub
		if(arr != null) {
			for(Menu menu : arr)
				System.out.println(menu);
		}
		System.out.println();
	}

	
	static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1. Compare by Dish Name");
		System.out.println("2. Compare by Price");
		System.out.println("3. Compare by Calories");
		System.out.println("Enter your choice: ");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu[] arr = Program.getArray();
		Comparator<Menu> m = null;
		int choice;
		while((choice = Program.menuList()) != 0) {
			switch(choice) {
			case 1:
				m = new NameComparator();	
				break;
				
			case 2:
				m = new PriceComparator();
				break;
				
			case 3:
				m = new CaloriesComparator();
				break;
			}
			Arrays.sort(arr,m);
			Program.printRecord(arr);
		}

	}


	
	

}
