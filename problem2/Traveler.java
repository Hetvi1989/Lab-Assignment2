package com.lab.algorithm.problem2;

import java.util.*;
import java.util.Scanner;

public class Traveler {

	static Integer[] inPutDenominators;
	static int targetAmount;
	static int size;
	static int noOfNotes[] = new int[size];
	static int index;
	static Integer[] sortedDenominators;

	void denominator(int targetAmount) {
		for (int index = 0; index < size; index++) {
			if (targetAmount >= inPutDenominators[index]) {

				noOfNotes[index] = targetAmount / inPutDenominators[index];

				targetAmount = targetAmount %= inPutDenominators[index];
			}
		}

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int index = 0; index < size; index++) {
			if (noOfNotes[index] != 0) {
				System.out.println(inPutDenominators[index] + " : " + noOfNotes[index]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		inPutDenominators = new Integer[size];

		System.out.println("Enter the currency denominations value");

		for (int index = 0; index < inPutDenominators.length; index++) {
			inPutDenominators[index] = sc.nextInt();
		}

		Arrays.sort(inPutDenominators, Collections.reverseOrder());

		System.out.println("Enter the amount you want to pay");
		//targetAmount = sc.nextInt();

		Traveler t1 = new Traveler();
		t1.denominator(targetAmount = sc.nextInt());

	}
}