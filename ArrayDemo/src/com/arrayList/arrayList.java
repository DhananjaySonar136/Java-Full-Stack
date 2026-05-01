package com.arrayList;

import java.util.ArrayList;

public class arrayList {

	
	//9356628136 only whatapp
	//similar to the array 
	//in array we can store same type of data
	//and in arraylist we can store muiltiple type of data
	
	//arraylist follows indexing
	//arraylist allows duplicate value
	//arraylis allows null values
	//array follows insertion order
	//arraylist no sorting
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
//		al.add(12);
//		al.add(13);
//		al.add(14);
//		al.add(12);
//		al.add(null);
		
		al.add("Dhananjay");
		al.add("Krushna");
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.contains(12));
		//System.out.println(al.get(2));
		al.remove(1);
		System.out.println(al);
		al.clear();//it will remove all the items in the arraylist
		System.out.println(al.size());
	}
}
