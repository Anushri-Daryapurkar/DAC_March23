package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Operations {

	
static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(int[] arr) {
		// TODO Auto-generated method stub
		for(int index=0; index<arr.length; index++)
		{
			System.out.println("Enter array element");
			arr[index] = sc.nextInt();
		}
			
	}
	public static void printRecord(int[] arr) {
		// TODO Auto-generated method stub
			System.out.println("Contents of Array: "+Arrays.toString(arr));
	}
	
	public static void Sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int index = 0; index<arr.length; index++)
			sum = sum + arr[index];
		System.out.println("Sum of Array: "+ sum);
			
	}
	
	
	public static void average(int[] arr) {
		int sum = 0;
		for(int index = 0; index<arr.length; index++)
			sum = sum + arr[index];
		int average = sum/arr.length ;
		System.out.println("Average of Array: "+ average);
	}
	
	public static void largest(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max)
                max = arr[index];
		}
            System.out.println("Largest Element in array: "+max);
		}
	
	public static void Smallest(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		for(int index=0; index<arr.length; index++) {
			if(arr[index] < min)
				min = arr[index];
		}
		System.out.println("Smallest Element in array: "+min);
	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
	}
	
}
