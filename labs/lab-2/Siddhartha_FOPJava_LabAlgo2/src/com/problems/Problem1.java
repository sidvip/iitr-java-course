package com.problems;

import java.util.Scanner;

public class Problem1 {

	private int transactionSize;
	private int[] transactionsList;
	private static int counter = 0;
	private static Scanner sc = new Scanner(System.in);
	
	public Problem1() {
		System.out.println("Enter the size of transaction array ");
		this.transactionSize = sc.nextInt();
		this.transactionsList = new int [this.transactionSize];
	}
	
	private void createTransactionsList() {
		System.out.println("Enter the values of array");
		for (int i =0; i< this.transactionSize; i++) {
			int transactionValue = sc.nextInt();
			this.transactionsList[counter++] = transactionValue;			
		}
	}
	
	private void isAchieved(int target) {
		int totalTransactions = 0;
		boolean transactionAchieved = false;
		for (int i = 0; i < this.transactionsList.length; i++) {
			totalTransactions += this.transactionsList[i];
			if (totalTransactions >= target) {
				System.out.printf("Target achieved after %d transactions", i + 1);	
				System.out.println();
				transactionAchieved = true;
				break;
			}
		}
		if (!transactionAchieved) {
			System.out.println("Given target is not achieved");			
		}
	}
	
	private void setTargets() {
		System.out.println("Enter the total no of tragets that needs to be achieved");
		int targetCount = sc.nextInt();
		for (int i = 0; i < targetCount; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			isAchieved(target);
		}
	}
	
	public void solve() {
		createTransactionsList();
		setTargets();
	}
	
}
