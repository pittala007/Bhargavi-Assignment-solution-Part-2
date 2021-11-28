package com.Assignment.DSA;

import java.util.Scanner;

import com.Assignment.DSA.AdditionalServices;
import com.Assignment.DSA.BinarySearchImplementation;
import com.Assignment.DSA.LinearSearch;
import com.Assignment.DSA.MergeSortImplementation;

public class Main {
	public static void main(String[] args) {
		int noOfCompanies;
		int option;
		System.out.println("Enter the no of companies");
		Scanner sc = new Scanner(System.in);
		noOfCompanies = sc.nextInt();
		double priceArray[] = new double[noOfCompanies];
		boolean profitArray[] = new boolean[noOfCompanies];
		
		for(int i=0; i < noOfCompanies; i++) {
			System.out.println("Enter current stock price of the company" + (i + i));
			priceArray[i] = sc. nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			profitArray[i] = sc.nextBoolean();
			
		}
		MergeSortImplementation mergeSortImplementation = new  MergeSortImplementation();
		mergeSortImplementation.sort(priceArray, 0, priceArray.length - 1);
		
		AdditionalServices additionalServices = new AdditionalServices();
		LinearSearch linearSearch = new LinearSearch();
		
		BinarySearchImplementation binarySearchImplementation = new BinarySearchImplementation();
		
		do {
			  System.out.println();
			  System.out.println("--------------------------");
			  System.out.println("Enter the operation that ypu want to perform");
			  System.out.println("1.Display the companies stock prices in ascending order");
			  System.out.println("2.Display the companies stock prices in descending order");
			  System.out.println("3.Display the total no of companies for which stock prices rose today");
					  
			  System.out.println("4.Display the total no of companies for  which stock prices declined today");
			  System.out.println("5. Search a specific stock price");
			  System.out.println("6.Press 0 to exit");
			  System.out.println("-----------------------------------------------");
			  option = sc.nextInt();
			  switch(option) {
			  
			  case 0:
				     option = 0;
				     break;
			  case 1:{
				      additionalServices.displayPricesAscendingOrder(priceArray);
			  }
			         break;
			  case 2: {
				      additionalServices.displayPricesDescendingOrder(priceArray);
			  }
			         break;
			  case 3: {
				      System.out.println("Total no of companies whose stock price rose today : "
				    		                   + linearSearch.countCompaniesInProfit(profitArray));
			  }
			        break;
			  case 4: {
				  System.out.println("Total no of companies whose stock price declined today :"
						              + (noOfCompanies - linearSearch.countCompaniesInProfit(profitArray)));
			  }
			        break;
			  case 5: {
				       double key;
				       System.out.println("enter the key value ");
				       key = sc.nextDouble();
				       binarySearchImplementation.searchValue(priceArray, key);
				       
				  
			  }
			        break;
			   default:
				      System.out.println("enter valid option");
			  }
			  } while (option != 0);
		System.out.println("Exited Successfully");
		sc.close();
	}}

		
	
			  
			  
			  
		
	


