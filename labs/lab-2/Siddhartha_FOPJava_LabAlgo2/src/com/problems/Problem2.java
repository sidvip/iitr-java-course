package com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	private int size;
	private static Scanner sc = new Scanner(System.in);
	private int[] denomincationsArr;
	
	public Problem2() {
		System.out.println("Enter the size of currency denominations");
		this.size = sc.nextInt();
		this.denomincationsArr = new int[size];
		this.setDenominations();
	}
	
	public void setDenominations() {
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < this.size; i++) {
			this.denomincationsArr[i] = sc.nextInt();
		}
		Arrays.sort(this.denomincationsArr);
		System.out.println(Arrays.toString(this.denomincationsArr));
	}
	
	public void minimumNotes() {
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		int remainder;
//		int minNotesCount = 0;
		try {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = this.denomincationsArr.length - 1; i >= 0; i--) {
				remainder = amount % this.denomincationsArr[i];
				int minNotesCount = amount / this.denomincationsArr[i];
				if (minNotesCount != 0) {
					System.out.println(this.denomincationsArr[i] + ":" + minNotesCount);				
				}
				amount = remainder;
			}			
		} catch (ArithmeticException ae) {
			System.err.println("Error: => " + ae.getMessage());
		}
	}

	public void solve() {
		this.minimumNotes();
	}
}
