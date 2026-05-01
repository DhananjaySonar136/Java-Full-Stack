package com.linkedArrayList;

import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class linkedlist {

	public static void main(String[] args) {
		
		//arraylist follows indexing
		//arraylist allows duplicate value
		//arraylis allows null values
		//array follows insertion order
		//no sorting
		
		TreeSet ts=new TreeSet();
		Stack<Integer> al=new Stack<Integer>();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(12);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(12));
		System.out.println(al.get(2));
		al.remove(1);
		System.out.println(al);
		al.clear();//it will remove all the items in the arraylist
		System.out.println(al.size());
		
		
	}
}
