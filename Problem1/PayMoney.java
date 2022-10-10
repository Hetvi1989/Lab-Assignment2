package com.Lab2.Algorithm.Problem1;

import java.util.Scanner;

public class PayMoney {
	static int size;
	static int[] inputTransactions = new int[size];
	static int totalNumberOfTargets;
	static int initialValue;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of tansaction array");
		int size = sc.nextInt();
		
		int inputTransactions[] = new int[size];
		
		System.out.println("Enter the value of array");		
		
		for (int i = 0; i<size; i++) {
		
		inputTransactions[i] = sc.nextInt();}
		
		System.out.println("Enter the total number of targets that needs to be achived");
		
		int totalNumberOfTargets = sc.nextInt();
		
		System.out.println("Enter the targets value");
		
		int targetValue = sc.nextInt();
		
		//int initialValue = 0 ;
		
		int result = reachedTarget(initialValue, targetValue);
		if (result != -1) {
			System.out.println("Target achieved after " + result + " count");
		} else {
			System.out.println("Target was not achieved ");
		}
	}

	private static int reachedTarget(int initialValue, int targetValue) {
			
		int index = 0;
		while (initialValue < targetValue && index < size) {
			
			if (initialValue == targetValue) {
				
				System.out.println("Target reached after " + (index + 1) + " attempts");
				return index;
			}
			if (index >= totalNumberOfTargets) {
				System.out.println("Could not meet the target after the target count");
				break;
			}
			initialValue = initialValue + inputTransactions [index++];
		}
		if (initialValue > targetValue) {
			return index;
		}
		return -1;
	}
}

	
