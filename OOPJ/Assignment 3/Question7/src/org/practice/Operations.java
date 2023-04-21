package org.practice;

import java.util.Scanner;

public class Operations {
static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(int[][] arr1) {
		// TODO Auto-generated method stub
		System.out.println("Enter First Array");
		for(int row = 0; row < arr1.length; row++) {
			for(int col = 0; col < arr1[row].length; col++) {
				arr1[row][col] = sc.nextInt();
			}
		}
	}
	
	public static void printRecord(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row = 0; row<arr.length; row++)
		{
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}	
		System.out.println();
	}

	public static void SumArray(int[][] arr1, int[][]arr2, int[][] sum) {
		for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1.length; col++) {
                sum[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
	}
	
	
	public static void SubArray(int[][] arr1, int[][]arr2, int[][] sub) {
		for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1.length; col++) {
                sub[row][col] = arr1[row][col] - arr2[row][col];
            }
        }
	}
	
	public static void MulArray(int[][] arr1, int[][]arr2, int[][] mul) {
		for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1.length; col++) {
            	mul[row][col]=0;
                mul[row][col] += arr1[row][col] * arr2[row][col];
            }
        }
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
	
}
