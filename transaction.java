package com.greatlearning.dsa;

import java.util.Scanner;


public class transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan1 = new Scanner(System.in) ;
   
	System.out.println("Enter the Size of Array");
	int size = scan1.nextInt();
	int[] transactions = new int[size];
	System.out.println("Enter the value of transaction");
	 for(int i =0; i<size; i++) {
		 transactions[i] = scan1.nextInt();
		 
	 }
	 
	 System.out.println("Enter the Total number of targets to be achieved");
	  int targetno = scan1.nextInt();
	  while (targetno > 0) {
		  int flag = 0;
		  int target;
		  System.out.println("Enter the value of the target");
		  target = scan1.nextInt();
		  long sumOfTransactions =0;
		  for(int i=0; i<size; i++) {
		  sumOfTransactions = sumOfTransactions+transactions[i];
		  if(sumOfTransactions >= target) {
		  System.out.println(" target achieved after "+(i+1)+ "transaction");
				  flag = 1;
				  break;
		  }	
	  }
	  if(flag==0) {
		  System.out.println("target is not achieved");
	  }
	  targetno--;
	 }
	  System.out.println("you have finished the target check");
	}
}

