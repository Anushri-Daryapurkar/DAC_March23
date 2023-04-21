package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		Operations.acceptRecord(arr);
		Operations.printRecord(arr);
		Operations.Sum(arr);
		Operations.average(arr);
		Operations.largest(arr);
		Operations.Smallest(arr);
		Operations.Sort(arr);
			

	}
	

}
