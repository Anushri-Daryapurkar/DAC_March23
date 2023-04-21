package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		System.out.println("Enter number of rows");
        row = sc.nextInt();
        System.out.println("Enter number of column");
        col = sc.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum = new int[row][col];
        int[][] sub = new int[row][col];
        int[][] mul = new int[row][col];
		
        
        Operations.acceptRecord(arr1);
        Operations.acceptRecord(arr2);
        Operations.printRecord(arr1);
        Operations.printRecord(arr2);
        //Operations.menuList();
        
        

		int choice;
		while((choice=Operations.menuList()) != 0) {
			switch (choice) {
			case 1: 
				Operations.SumArray(arr1, arr2, sum);
				System.out.println("Sum of Array");
				Operations.printRecord(sum);
				break;	
				
			case 2:
				Operations.SubArray(arr1, arr2, sub);
				System.out.println("Subtraction of Array");
				Operations.printRecord(sub);
				break;
			
			case 3:
				Operations.MulArray(arr1, arr2, mul);
				System.out.println("Multiplication of Array");
				Operations.printRecord(mul);
				break;
				
			default :
				System.out.println("invalid Operation");
				break;
			}
		}

	}

	
}
