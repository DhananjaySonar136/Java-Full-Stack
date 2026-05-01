package com.arrays;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
//		int arr[]=new int[5];
//		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}
		
//****************************************************************
		int arr[]=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 array elements:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
