package org.assignment.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import org.assignment.domain.Product;
import org.assignment.utils.priceComparator;

public class Program {

	private static void printRecord(Product[] p) {
		// TODO Auto-generated method stub
		if(p != null) {
			for(Product product : p)
				System.out.println(product);
		}
	}
	
	private static void sortRecord(Product[] p) {
		// TODO Auto-generated method stub
		Comparator<Product> c = new priceComparator();
		Arrays.sort(p, c);
		System.out.println("Sorted Array: ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of products: ");
		int n = sc.nextInt();
		
		Product[] p = new Product[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter Name of product: ");
			String name = sc.next();
			System.out.println("Enter price of product: ");
			double price = sc.nextDouble();
			System.out.println("Enter Category: ");
			String category = sc.next();
			
			p[i] = new Product(name,price,category);
		}
		
		Program.sortRecord(p);
		Program.printRecord(p);
	}
}
